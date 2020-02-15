package org.telosysgen.jaxb.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.telosysgen.TbColumnJpaRecord;
import org.telosysgen.TbDatabaseJpaRecord;
import org.telosysgen.TbFkJpaRecord;
import org.telosysgen.TbLinkJpaRecord;
import org.telosysgen.TbTableJpaRecord;
import org.telosysgen.jaxb.repo.Root;
import org.telosysgen.jaxb.repo.Root.TableList;
import org.telosysgen.jaxb.repo.Root.TableList.Table;
import org.telosysgen.jaxb.repo.Root.TableList.Table.Column;
import org.telosysgen.jaxb.repo.Root.TableList.Table.Fk;
import org.telosysgen.jaxb.repo.Root.TableList.Table.Link;

public class RootToTbDatabase {

	public TbDatabaseJpaRecord convert(Root root) {
		TbDatabaseJpaRecord tbDatabaseJpaRecord = new TbDatabaseJpaRecord();
		tbDatabaseJpaRecord.setTableList(new ArrayList<>());
		TableList database = root.getTableList();

		BeanUtils.copyProperties(database, tbDatabaseJpaRecord);

		List<Table> tableList = database.getTable();
		for (Table table : tableList) {
			TbTableJpaRecord tbTableJpaRecord = new TbTableJpaRecord();
			BeanUtils.copyProperties(table, tbTableJpaRecord);
			tbTableJpaRecord.setDatabase(tbDatabaseJpaRecord);
			tbTableJpaRecord.setColumnList(new ArrayList<>());
			tbTableJpaRecord.setFkList(new ArrayList<>());
			tbTableJpaRecord.setLinkList(new ArrayList<>());
			tbDatabaseJpaRecord.getTableList().add(tbTableJpaRecord);

			List<Column> columnList = table.getColumn();
			for (Column column : columnList) {
				TbColumnJpaRecord tbColumnJpaRecord = new TbColumnJpaRecord();
				BeanUtils.copyProperties(column, tbColumnJpaRecord);
				tbColumnJpaRecord.setTable(tbTableJpaRecord);
				tbTableJpaRecord.getColumnList().add(tbColumnJpaRecord);
			}
			List<Fk> fkList = table.getFk();
			for (Fk fk : fkList) {
				TbFkJpaRecord tbFkJpaRecord = new TbFkJpaRecord();
				BeanUtils.copyProperties(fk, tbFkJpaRecord);
				tbFkJpaRecord.setTable(tbTableJpaRecord);
				tbTableJpaRecord.getFkList().add(tbFkJpaRecord);
			}
			List<Link> linkList = table.getLink();
			for (Link link : linkList) {
				TbLinkJpaRecord tbLinkJpaRecord = new TbLinkJpaRecord();
				BeanUtils.copyProperties(link, tbLinkJpaRecord);
				tbLinkJpaRecord.setTable(tbTableJpaRecord);
				tbTableJpaRecord.getLinkList().add(tbLinkJpaRecord);
			}
		}

		return tbDatabaseJpaRecord;
	}

}
