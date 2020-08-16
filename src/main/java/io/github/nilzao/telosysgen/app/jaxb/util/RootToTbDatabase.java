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

import java.util.ArrayList;
import java.util.List;

public class RootToTbDatabase {

    public Database convert(Root root) {
        Database tbDatabaseJpaRecord = new Database();
        tbDatabaseJpaRecord.setTableList(new ArrayList<>());
        Root.TableList database = root.getTableList();
        database.getDatabaseName();
        BeanUtils.copyProperties(database, tbDatabaseJpaRecord);

        List<Root.TableList.Table> tableList = database.getTable();
        for (Root.TableList.Table table : tableList) {
            Table tbTableJpaRecord = new Table();
            BeanUtils.copyProperties(table, tbTableJpaRecord);
            tbTableJpaRecord.setDatabase(tbDatabaseJpaRecord);
            tbTableJpaRecord.setColumnList(new ArrayList<>());
            tbTableJpaRecord.setFkList(new ArrayList<>());
            tbTableJpaRecord.setLinkList(new ArrayList<>());
            tbDatabaseJpaRecord.getTableList().add(tbTableJpaRecord);

            List<Root.TableList.Table.Column> columnList = table.getColumn();
            for (Root.TableList.Table.Column column : columnList) {
                Column tbColumnJpaRecord = new Column();
                BeanUtils.copyProperties(column, tbColumnJpaRecord);
                tbColumnJpaRecord.setTable(tbTableJpaRecord);
                tbTableJpaRecord.getColumnList().add(tbColumnJpaRecord);
            }
            List<Root.TableList.Table.Fk> fkList = table.getFk();
            for (Root.TableList.Table.Fk fk : fkList) {
                Fk tbFkJpaRecord = new Fk();
                BeanUtils.copyProperties(fk, tbFkJpaRecord);
                List<Root.TableList.Table.Fk.Fkcol> fkcolList = fk.getFkcol();
                tbFkJpaRecord.setFkColList(new ArrayList<>());
                for (Root.TableList.Table.Fk.Fkcol fkcol : fkcolList) {
                    FkCol tbFkColJpaRecord = new FkCol();
                    BeanUtils.copyProperties(fkcol, tbFkColJpaRecord);
                    tbFkColJpaRecord.setFk(tbFkJpaRecord);
                    tbFkJpaRecord.getFkColList().add(tbFkColJpaRecord);
                }
                tbFkJpaRecord.setTable(tbTableJpaRecord);
                tbTableJpaRecord.getFkList().add(tbFkJpaRecord);
            }
            List<Root.TableList.Table.Link> linkList = table.getLink();
            for (Root.TableList.Table.Link link : linkList) {
                Link tbLinkJpaRecord = new Link();
                tbLinkJpaRecord.setLinkJoincolumnList(new ArrayList<>());
                BeanUtils.copyProperties(link, tbLinkJpaRecord);
				tbLinkJpaRecord.setIdTmp(link.getId());
				tbLinkJpaRecord.setTable(tbTableJpaRecord);
                Root.TableList.Table.Link.JoinColumns joinColumns = link.getJoinColumns();
                if (joinColumns != null) {
                    List<Root.TableList.Table.Link.JoinColumns.JoinColumn> joinColumnList = joinColumns.getJoinColumn();
                    for (Root.TableList.Table.Link.JoinColumns.JoinColumn joinColumn : joinColumnList) {
                        LinkJoincolumn tbJoinColumnJpaRecord = new LinkJoincolumn();
                        BeanUtils.copyProperties(joinColumn, tbJoinColumnJpaRecord);
                        tbJoinColumnJpaRecord.setLink(tbLinkJpaRecord);
                        tbLinkJpaRecord.getLinkJoincolumnList().add(tbJoinColumnJpaRecord);
                    }
                }
                tbTableJpaRecord.getLinkList().add(tbLinkJpaRecord);
            }
        }

        return tbDatabaseJpaRecord;
    }

}
