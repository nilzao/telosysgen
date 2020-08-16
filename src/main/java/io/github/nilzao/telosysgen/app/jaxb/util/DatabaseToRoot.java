package io.github.nilzao.telosysgen.app.jaxb.util;

import io.github.nilzao.telosysgen.app.jaxb.repo.Root;
import io.github.nilzao.telosysgen.column.Column;
import io.github.nilzao.telosysgen.database.Database;
import io.github.nilzao.telosysgen.fk.Fk;
import io.github.nilzao.telosysgen.fkcol.FkCol;
import io.github.nilzao.telosysgen.link.Link;
import io.github.nilzao.telosysgen.linkjoincolumn.LinkJoincolumn;
import io.github.nilzao.telosysgen.table.Table;
import org.springframework.beans.BeanUtils;

import java.util.List;

public class DatabaseToRoot {

	public Root convert(Database tbDatabaseJpaRecord) {
		Root root = new Root();
		Root.TableList database = new Root.TableList();
		database.setDatabaseId(tbDatabaseJpaRecord.getIdDatabase().toString());
		BeanUtils.copyProperties(tbDatabaseJpaRecord, database);
		List<Table> tableList = tbDatabaseJpaRecord.getTableList();
		for (Table tbTableJpaRecord : tableList) {
			Root.TableList.Table table = new Root.TableList.Table();
			BeanUtils.copyProperties(tbTableJpaRecord, table);

			List<Column> columnList = tbTableJpaRecord.getColumnList();
			for (Column tbColumnJpaRecord : columnList) {
				Root.TableList.Table.Column column = new Root.TableList.Table.Column();
				BeanUtils.copyProperties(tbColumnJpaRecord, column);
				table.getColumn().add(column);
			}
			List<Fk> fkList = tbTableJpaRecord.getFkList();
			for (Fk tbFkJpaRecord : fkList) {
				Root.TableList.Table.Fk fk = new Root.TableList.Table.Fk();
				BeanUtils.copyProperties(tbFkJpaRecord, fk);
				List<FkCol> fkColList = tbFkJpaRecord.getFkColList();
				for (FkCol tbFkColJpaRecord : fkColList) {
					Root.TableList.Table.Fk.Fkcol fkcol = new Root.TableList.Table.Fk.Fkcol();
					BeanUtils.copyProperties(tbFkColJpaRecord, fkcol);
					fk.getFkcol().add(fkcol);
				}
				table.getFk().add(fk);
			}
			List<Link> linkList = tbTableJpaRecord.getLinkList();
			for (Link tbLinkJpaRecord : linkList) {
				Root.TableList.Table.Link  link = new Root.TableList.Table.Link ();
				BeanUtils.copyProperties(tbLinkJpaRecord, link);
				List<LinkJoincolumn> joinColumList = tbLinkJpaRecord.getLinkJoincolumnList();
				Root.TableList.Table.Link.JoinColumns joinColumns = new Root.TableList.Table.Link.JoinColumns();
				for (LinkJoincolumn tbJoinColumnJpaRecord : joinColumList) {
					Root.TableList.Table.Link.JoinColumns.JoinColumn  joinColumn = new Root.TableList.Table.Link.JoinColumns.JoinColumn ();
					BeanUtils.copyProperties(tbJoinColumnJpaRecord, joinColumn);
					joinColumns.getJoinColumn().add(joinColumn);
				}
				link.setJoinColumns(joinColumns);
				link.setId(tbLinkJpaRecord.getIdTmp());
				table.getLink().add(link);
			}

			database.getTable().add(table);
		}
		root.setTableList(database);
		return root;
	}

}
