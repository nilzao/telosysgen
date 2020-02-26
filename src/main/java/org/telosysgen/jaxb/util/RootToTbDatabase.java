package org.telosysgen.jaxb.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.telosysgen.TbColumnJpaRecord;
import org.telosysgen.TbDatabaseJpaRecord;
import org.telosysgen.TbFkColJpaRecord;
import org.telosysgen.TbFkJpaRecord;
import org.telosysgen.TbJoinColumnJpaRecord;
import org.telosysgen.TbLinkJpaRecord;
import org.telosysgen.TbTableJpaRecord;
import org.telosysgen.jaxb.repo.Root;
import org.telosysgen.jaxb.repo.Root.TableList;
import org.telosysgen.jaxb.repo.Root.TableList.Table;
import org.telosysgen.jaxb.repo.Root.TableList.Table.Column;
import org.telosysgen.jaxb.repo.Root.TableList.Table.Fk;
import org.telosysgen.jaxb.repo.Root.TableList.Table.Fk.Fkcol;
import org.telosysgen.jaxb.repo.Root.TableList.Table.Link;
import org.telosysgen.jaxb.repo.Root.TableList.Table.Link.JoinColumns;
import org.telosysgen.jaxb.repo.Root.TableList.Table.Link.JoinColumns.JoinColumn;

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
				List<Fkcol> fkcolList = fk.getFkcol();
				tbFkJpaRecord.setFkColList(new ArrayList<>());
				for (Fkcol fkcol : fkcolList) {
					TbFkColJpaRecord tbFkColJpaRecord = new TbFkColJpaRecord();
					BeanUtils.copyProperties(fkcol, tbFkColJpaRecord);
					tbFkColJpaRecord.setFk(tbFkJpaRecord);
					tbFkJpaRecord.getFkColList().add(tbFkColJpaRecord);
				}
				tbFkJpaRecord.setTable(tbTableJpaRecord);
				tbTableJpaRecord.getFkList().add(tbFkJpaRecord);
			}
			List<Link> linkList = table.getLink();
			for (Link link : linkList) {
				TbLinkJpaRecord tbLinkJpaRecord = new TbLinkJpaRecord();
				tbLinkJpaRecord.setJoinColumList(new ArrayList<>());
				BeanUtils.copyProperties(link, tbLinkJpaRecord);
				tbLinkJpaRecord.setIdDb(link.getId());
				tbLinkJpaRecord.setTable(tbTableJpaRecord);
				JoinColumns joinColumns = link.getJoinColumns();
				if (joinColumns != null) {
					List<JoinColumn> joinColumnList = joinColumns.getJoinColumn();
					for (JoinColumn joinColumn : joinColumnList) {
						TbJoinColumnJpaRecord tbJoinColumnJpaRecord = new TbJoinColumnJpaRecord();
						BeanUtils.copyProperties(joinColumn, tbJoinColumnJpaRecord);
						tbJoinColumnJpaRecord.setLink(tbLinkJpaRecord);
						tbLinkJpaRecord.getJoinColumList().add(tbJoinColumnJpaRecord);
					}
				}
				tbTableJpaRecord.getLinkList().add(tbLinkJpaRecord);
			}
		}

		return tbDatabaseJpaRecord;
	}

}
