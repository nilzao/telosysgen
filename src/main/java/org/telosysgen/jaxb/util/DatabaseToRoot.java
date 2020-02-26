package org.telosysgen.jaxb.util;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.telosysgen.TbColumnJpaRecord;
import org.telosysgen.TbDatabaseJpaRecord;
import org.telosysgen.TbFkColJpaRecord;
import org.telosysgen.TbFkJpaRecord;
import org.telosysgen.TbLinkJpaRecord;
import org.telosysgen.TbTableJpaRecord;
import org.telosysgen.jaxb.repo.Root;
import org.telosysgen.jaxb.repo.Root.TableList;
import org.telosysgen.jaxb.repo.Root.TableList.Table;
import org.telosysgen.jaxb.repo.Root.TableList.Table.Column;
import org.telosysgen.jaxb.repo.Root.TableList.Table.Fk;
import org.telosysgen.jaxb.repo.Root.TableList.Table.Fk.Fkcol;
import org.telosysgen.jaxb.repo.Root.TableList.Table.Link;

public class DatabaseToRoot {

	public Root convert(TbDatabaseJpaRecord tbDatabaseJpaRecord) {
		Root root = new Root();
		TableList database = new TableList();
		database.setDatabaseId(tbDatabaseJpaRecord.getId().toString());
		BeanUtils.copyProperties(tbDatabaseJpaRecord, database);
		List<TbTableJpaRecord> tableList = tbDatabaseJpaRecord.getTableList();
		for (TbTableJpaRecord tbTableJpaRecord : tableList) {
			Table table = new Table();
			BeanUtils.copyProperties(tbTableJpaRecord, table);

			List<TbColumnJpaRecord> columnList = tbTableJpaRecord.getColumnList();
			for (TbColumnJpaRecord tbColumnJpaRecord : columnList) {
				Column column = new Column();
				BeanUtils.copyProperties(tbColumnJpaRecord, column);
				table.getColumn().add(column);
			}
			List<TbFkJpaRecord> fkList = tbTableJpaRecord.getFkList();
			for (TbFkJpaRecord tbFkJpaRecord : fkList) {
				Fk fk = new Fk();
				BeanUtils.copyProperties(tbFkJpaRecord, fk);
				List<TbFkColJpaRecord> fkColList = tbFkJpaRecord.getFkColList();
				for (TbFkColJpaRecord tbFkColJpaRecord : fkColList) {
					Fkcol fkcol = new Fkcol();
					BeanUtils.copyProperties(tbFkColJpaRecord, fkcol);
					fk.getFkcol().add(fkcol);
				}
				table.getFk().add(fk);
			}
			List<TbLinkJpaRecord> linkList = tbTableJpaRecord.getLinkList();
			for (TbLinkJpaRecord tbLinkJpaRecord : linkList) {
				Link link = new Link();
				BeanUtils.copyProperties(tbLinkJpaRecord, link);
				link.setId(tbLinkJpaRecord.getIdDb());
				table.getLink().add(link);
			}
			
			database.getTable().add(table);
		}
		root.setTableList(database);
		return root;
	}

}
