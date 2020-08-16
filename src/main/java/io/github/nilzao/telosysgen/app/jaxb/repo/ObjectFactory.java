
package io.github.nilzao.telosysgen.app.jaxb.repo;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.telosysgen.jaxb.repo package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.telosysgen.jaxb.repo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Root }
     * 
     */
    public Root createRoot() {
        return new Root();
    }

    /**
     * Create an instance of {@link Root.TableList }
     * 
     */
    public Root.TableList createRootTableList() {
        return new Root.TableList();
    }

    /**
     * Create an instance of {@link Root.TableList.Table }
     * 
     */
    public Root.TableList.Table createRootTableListTable() {
        return new Root.TableList.Table();
    }

    /**
     * Create an instance of {@link Root.TableList.Table.Fk }
     * 
     */
    public Root.TableList.Table.Fk createRootTableListTableFk() {
        return new Root.TableList.Table.Fk();
    }

    /**
     * Create an instance of {@link Root.TableList.Table.Link }
     * 
     */
    public Root.TableList.Table.Link createRootTableListTableLink() {
        return new Root.TableList.Table.Link();
    }

    /**
     * Create an instance of {@link Root.TableList.Table.Link.JoinColumns }
     * 
     */
    public Root.TableList.Table.Link.JoinColumns createRootTableListTableLinkJoinColumns() {
        return new Root.TableList.Table.Link.JoinColumns();
    }

    /**
     * Create an instance of {@link Root.TableList.Table.Column }
     * 
     */
    public Root.TableList.Table.Column createRootTableListTableColumn() {
        return new Root.TableList.Table.Column();
    }

    /**
     * Create an instance of {@link Root.TableList.Table.Fk.Fkcol }
     * 
     */
    public Root.TableList.Table.Fk.Fkcol createRootTableListTableFkFkcol() {
        return new Root.TableList.Table.Fk.Fkcol();
    }

    /**
     * Create an instance of {@link Root.TableList.Table.Link.JoinColumns.JoinColumn }
     * 
     */
    public Root.TableList.Table.Link.JoinColumns.JoinColumn createRootTableListTableLinkJoinColumnsJoinColumn() {
        return new Root.TableList.Table.Link.JoinColumns.JoinColumn();
    }

}
