
package io.github.nilzao.telosysgen.app.jaxb.repo;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tableList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="table" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="column" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="dbAutoIncremented" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="dbComment" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="dbDefaultValue" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="dbName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="dbNotNull" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="dbPosition" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="dbPrimaryKey" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="dbSize" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="dbTypeName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="inputType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="javaName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="javaType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="jdbcTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="label" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="maxLength" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="notNull" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="selected" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="link" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="joinColumns">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="joinColumn" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;simpleContent>
 *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                                         &lt;attribute name="insertable" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="nullable" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="referencedColumnName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="unique" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="updatable" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/extension>
 *                                                     &lt;/simpleContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="cardinality" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="cascade" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="fetch" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="foreignKeyName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="inverseSideOf" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="javaName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="javaType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="joinTableName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="mappedBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="optional" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="owningSide" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="sourceTableName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="targetEntity" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="targetTableName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="used" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="fk" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="fkcol" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                               &lt;attribute name="colname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="colref" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="deferrable" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="deleterule" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="sequence" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="tablename" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="tableref" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="updaterule" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="catalog" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="databaseComment" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="databaseType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="javaBean" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="schema" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="databaseId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="databaseName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="databaseProductName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="generation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tableList"
})
@XmlRootElement(name = "root")
public class Root {

    @XmlElement(required = true)
    protected TableList tableList;

    /**
     * Gets the value of the tableList property.
     *
     * @return
     *     possible object is
     *     {@link TableList }
     *
     */
    public TableList getTableList() {
        return tableList;
    }

    /**
     * Sets the value of the tableList property.
     *
     * @param value
     *     allowed object is
     *     {@link TableList }
     *
     */
    public void setTableList(TableList value) {
        this.tableList = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="table" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="column" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="dbAutoIncremented" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="dbComment" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="dbDefaultValue" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="dbName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="dbNotNull" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="dbPosition" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="dbPrimaryKey" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="dbSize" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="dbTypeName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="inputType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="javaName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="javaType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="jdbcTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="label" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="maxLength" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="notNull" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="selected" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="link" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="joinColumns">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="joinColumn" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;simpleContent>
     *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                               &lt;attribute name="insertable" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="nullable" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="referencedColumnName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="unique" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="updatable" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/extension>
     *                                           &lt;/simpleContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="cardinality" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="cascade" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="fetch" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="foreignKeyName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="inverseSideOf" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="javaName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="javaType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="joinTableName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="mappedBy" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="optional" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="owningSide" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="sourceTableName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="targetEntity" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="targetTableName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="used" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="fk" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="fkcol" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                     &lt;attribute name="colname" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="colref" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="deferrable" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="deleterule" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="sequence" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="tablename" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="tableref" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="updaterule" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="catalog" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="databaseComment" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="databaseType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="javaBean" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="schema" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="databaseId" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="databaseName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="databaseProductName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="generation" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "table"
    })
    public static class TableList {

        protected List<Table> table;
        @XmlAttribute(name = "databaseId")
        protected String databaseId;
        @XmlAttribute(name = "databaseName")
        protected String databaseName;
        @XmlAttribute(name = "databaseProductName")
        protected String databaseProductName;
        @XmlAttribute(name = "generation")
        protected String generation;

        /**
         * Gets the value of the table property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the table property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTable().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Table }
         *
         *
         */
        public List<Table> getTable() {
            if (table == null) {
                table = new ArrayList<Table>();
            }
            return this.table;
        }

        /**
         * Gets the value of the databaseId property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getDatabaseId() {
            return databaseId;
        }

        /**
         * Sets the value of the databaseId property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setDatabaseId(String value) {
            this.databaseId = value;
        }

        /**
         * Gets the value of the databaseName property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getDatabaseName() {
            return databaseName;
        }

        /**
         * Sets the value of the databaseName property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setDatabaseName(String value) {
            this.databaseName = value;
        }

        /**
         * Gets the value of the databaseProductName property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getDatabaseProductName() {
            return databaseProductName;
        }

        /**
         * Sets the value of the databaseProductName property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setDatabaseProductName(String value) {
            this.databaseProductName = value;
        }

        /**
         * Gets the value of the generation property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getGeneration() {
            return generation;
        }

        /**
         * Sets the value of the generation property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setGeneration(String value) {
            this.generation = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="column" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="dbAutoIncremented" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="dbComment" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="dbDefaultValue" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="dbName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="dbNotNull" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="dbPosition" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="dbPrimaryKey" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="dbSize" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="dbTypeName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="inputType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="javaName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="javaType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="jdbcTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="label" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="maxLength" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="notNull" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="selected" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="link" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="joinColumns">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="joinColumn" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;simpleContent>
         *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                                     &lt;attribute name="insertable" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="nullable" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="referencedColumnName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="unique" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="updatable" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/extension>
         *                                 &lt;/simpleContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="cardinality" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="cascade" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="fetch" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="foreignKeyName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="inverseSideOf" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="javaName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="javaType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="joinTableName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="mappedBy" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="optional" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="owningSide" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="sourceTableName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="targetEntity" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="targetTableName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="used" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="fk" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="fkcol" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                           &lt;attribute name="colname" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="colref" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="deferrable" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="deleterule" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="sequence" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="tablename" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="tableref" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="updaterule" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="catalog" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="databaseComment" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="databaseType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="javaBean" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="schema" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "column",
            "link",
            "fk"
        })
        public static class Table {

            protected List<Column> column;
            protected List<Link> link;
            protected List<Fk> fk;
            @XmlAttribute(name = "catalog")
            protected String catalog;
            @XmlAttribute(name = "databaseComment")
            protected String databaseComment;
            @XmlAttribute(name = "databaseType")
            protected String databaseType;
            @XmlAttribute(name = "javaBean")
            protected String javaBean;
            @XmlAttribute(name = "name")
            protected String name;
            @XmlAttribute(name = "schema")
            protected String schema;

            /**
             * Gets the value of the column property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the column property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getColumn().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Column }
             *
             *
             */
            public List<Column> getColumn() {
                if (column == null) {
                    column = new ArrayList<Column>();
                }
                return this.column;
            }

            /**
             * Gets the value of the link property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the link property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLink().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Link }
             *
             *
             */
            public List<Link> getLink() {
                if (link == null) {
                    link = new ArrayList<Link>();
                }
                return this.link;
            }

            /**
             * Gets the value of the fk property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the fk property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFk().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Fk }
             *
             *
             */
            public List<Fk> getFk() {
                if (fk == null) {
                    fk = new ArrayList<Fk>();
                }
                return this.fk;
            }

            /**
             * Gets the value of the catalog property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getCatalog() {
                return catalog;
            }

            /**
             * Sets the value of the catalog property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setCatalog(String value) {
                this.catalog = value;
            }

            /**
             * Gets the value of the databaseComment property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDatabaseComment() {
                return databaseComment;
            }

            /**
             * Sets the value of the databaseComment property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDatabaseComment(String value) {
                this.databaseComment = value;
            }

            /**
             * Gets the value of the databaseType property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDatabaseType() {
                return databaseType;
            }

            /**
             * Sets the value of the databaseType property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDatabaseType(String value) {
                this.databaseType = value;
            }

            /**
             * Gets the value of the javaBean property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getJavaBean() {
                return javaBean;
            }

            /**
             * Sets the value of the javaBean property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setJavaBean(String value) {
                this.javaBean = value;
            }

            /**
             * Gets the value of the name property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Gets the value of the schema property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getSchema() {
                return schema;
            }

            /**
             * Sets the value of the schema property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setSchema(String value) {
                this.schema = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             *
             * <p>The following schema fragment specifies the expected content contained within this class.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="dbAutoIncremented" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="dbComment" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="dbDefaultValue" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="dbName" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="dbNotNull" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="dbPosition" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="dbPrimaryKey" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="dbSize" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="dbTypeName" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="inputType" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="javaName" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="javaType" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="jdbcTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="label" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="maxLength" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="notNull" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="selected" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class Column {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "dbAutoIncremented")
                protected String dbAutoIncremented;
                @XmlAttribute(name = "dbComment")
                protected String dbComment;
                @XmlAttribute(name = "dbDefaultValue")
                protected String dbDefaultValue;
                @XmlAttribute(name = "dbName")
                protected String dbName;
                @XmlAttribute(name = "dbNotNull")
                protected String dbNotNull;
                @XmlAttribute(name = "dbPosition")
                protected String dbPosition;
                @XmlAttribute(name = "dbPrimaryKey")
                protected String dbPrimaryKey;
                @XmlAttribute(name = "dbSize")
                protected String dbSize;
                @XmlAttribute(name = "dbTypeName")
                protected String dbTypeName;
                @XmlAttribute(name = "inputType")
                protected String inputType;
                @XmlAttribute(name = "javaName")
                protected String javaName;
                @XmlAttribute(name = "javaType")
                protected String javaType;
                @XmlAttribute(name = "jdbcTypeCode")
                protected String jdbcTypeCode;
                @XmlAttribute(name = "label")
                protected String label;
                @XmlAttribute(name = "maxLength")
                protected String maxLength;
                @XmlAttribute(name = "notNull")
                protected String notNull;
                @XmlAttribute(name = "selected")
                protected String selected;

                /**
                 * Gets the value of the value property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Gets the value of the dbAutoIncremented property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getDbAutoIncremented() {
                    return dbAutoIncremented;
                }

                /**
                 * Sets the value of the dbAutoIncremented property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setDbAutoIncremented(String value) {
                    this.dbAutoIncremented = value;
                }

                /**
                 * Gets the value of the dbComment property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getDbComment() {
                    return dbComment;
                }

                /**
                 * Sets the value of the dbComment property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setDbComment(String value) {
                    this.dbComment = value;
                }

                /**
                 * Gets the value of the dbDefaultValue property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getDbDefaultValue() {
                    return dbDefaultValue;
                }

                /**
                 * Sets the value of the dbDefaultValue property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setDbDefaultValue(String value) {
                    this.dbDefaultValue = value;
                }

                /**
                 * Gets the value of the dbName property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getDbName() {
                    return dbName;
                }

                /**
                 * Sets the value of the dbName property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setDbName(String value) {
                    this.dbName = value;
                }

                /**
                 * Gets the value of the dbNotNull property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getDbNotNull() {
                    return dbNotNull;
                }

                /**
                 * Sets the value of the dbNotNull property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setDbNotNull(String value) {
                    this.dbNotNull = value;
                }

                /**
                 * Gets the value of the dbPosition property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getDbPosition() {
                    return dbPosition;
                }

                /**
                 * Sets the value of the dbPosition property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setDbPosition(String value) {
                    this.dbPosition = value;
                }

                /**
                 * Gets the value of the dbPrimaryKey property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getDbPrimaryKey() {
                    return dbPrimaryKey;
                }

                /**
                 * Sets the value of the dbPrimaryKey property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setDbPrimaryKey(String value) {
                    this.dbPrimaryKey = value;
                }

                /**
                 * Gets the value of the dbSize property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getDbSize() {
                    return dbSize;
                }

                /**
                 * Sets the value of the dbSize property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setDbSize(String value) {
                    this.dbSize = value;
                }

                /**
                 * Gets the value of the dbTypeName property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getDbTypeName() {
                    return dbTypeName;
                }

                /**
                 * Sets the value of the dbTypeName property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setDbTypeName(String value) {
                    this.dbTypeName = value;
                }

                /**
                 * Gets the value of the inputType property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getInputType() {
                    return inputType;
                }

                /**
                 * Sets the value of the inputType property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setInputType(String value) {
                    this.inputType = value;
                }

                /**
                 * Gets the value of the javaName property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getJavaName() {
                    return javaName;
                }

                /**
                 * Sets the value of the javaName property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setJavaName(String value) {
                    this.javaName = value;
                }

                /**
                 * Gets the value of the javaType property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getJavaType() {
                    return javaType;
                }

                /**
                 * Sets the value of the javaType property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setJavaType(String value) {
                    this.javaType = value;
                }

                /**
                 * Gets the value of the jdbcTypeCode property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getJdbcTypeCode() {
                    return jdbcTypeCode;
                }

                /**
                 * Sets the value of the jdbcTypeCode property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setJdbcTypeCode(String value) {
                    this.jdbcTypeCode = value;
                }

                /**
                 * Gets the value of the label property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getLabel() {
                    return label;
                }

                /**
                 * Sets the value of the label property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setLabel(String value) {
                    this.label = value;
                }

                /**
                 * Gets the value of the maxLength property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getMaxLength() {
                    return maxLength;
                }

                /**
                 * Sets the value of the maxLength property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setMaxLength(String value) {
                    this.maxLength = value;
                }

                /**
                 * Gets the value of the notNull property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getNotNull() {
                    return notNull;
                }

                /**
                 * Sets the value of the notNull property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setNotNull(String value) {
                    this.notNull = value;
                }

                /**
                 * Gets the value of the selected property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getSelected() {
                    return selected;
                }

                /**
                 * Sets the value of the selected property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setSelected(String value) {
                    this.selected = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             *
             * <p>The following schema fragment specifies the expected content contained within this class.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="fkcol" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                 &lt;attribute name="colname" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="colref" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="deferrable" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="deleterule" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="sequence" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="tablename" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="tableref" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="updaterule" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/extension>
             *             &lt;/simpleContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "fkcol"
            })
            public static class Fk {

                protected List<Fkcol> fkcol;
                @XmlAttribute(name = "name")
                protected String name;

                /**
                 * Gets the value of the fkcol property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the fkcol property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getFkcol().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Fkcol }
                 *
                 *
                 */
                public List<Fkcol> getFkcol() {
                    if (fkcol == null) {
                        fkcol = new ArrayList<Fkcol>();
                    }
                    return this.fkcol;
                }

                /**
                 * Gets the value of the name property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getName() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setName(String value) {
                    this.name = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 *
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;simpleContent>
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *       &lt;attribute name="colname" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="colref" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="deferrable" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="deleterule" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="sequence" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="tablename" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="tableref" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="updaterule" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/extension>
                 *   &lt;/simpleContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "value"
                })
                public static class Fkcol {

                    @XmlValue
                    protected String value;
                    @XmlAttribute(name = "colname")
                    protected String colname;
                    @XmlAttribute(name = "colref")
                    protected String colref;
                    @XmlAttribute(name = "deferrable")
                    protected String deferrable;
                    @XmlAttribute(name = "deleterule")
                    protected String deleterule;
                    @XmlAttribute(name = "sequence")
                    protected String sequence;
                    @XmlAttribute(name = "tablename")
                    protected String tablename;
                    @XmlAttribute(name = "tableref")
                    protected String tableref;
                    @XmlAttribute(name = "updaterule")
                    protected String updaterule;

                    /**
                     * Gets the value of the value property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getValue() {
                        return value;
                    }

                    /**
                     * Sets the value of the value property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setValue(String value) {
                        this.value = value;
                    }

                    /**
                     * Gets the value of the colname property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getColname() {
                        return colname;
                    }

                    /**
                     * Sets the value of the colname property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setColname(String value) {
                        this.colname = value;
                    }

                    /**
                     * Gets the value of the colref property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getColref() {
                        return colref;
                    }

                    /**
                     * Sets the value of the colref property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setColref(String value) {
                        this.colref = value;
                    }

                    /**
                     * Gets the value of the deferrable property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getDeferrable() {
                        return deferrable;
                    }

                    /**
                     * Sets the value of the deferrable property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setDeferrable(String value) {
                        this.deferrable = value;
                    }

                    /**
                     * Gets the value of the deleterule property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getDeleterule() {
                        return deleterule;
                    }

                    /**
                     * Sets the value of the deleterule property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setDeleterule(String value) {
                        this.deleterule = value;
                    }

                    /**
                     * Gets the value of the sequence property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getSequence() {
                        return sequence;
                    }

                    /**
                     * Sets the value of the sequence property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setSequence(String value) {
                        this.sequence = value;
                    }

                    /**
                     * Gets the value of the tablename property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getTablename() {
                        return tablename;
                    }

                    /**
                     * Sets the value of the tablename property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setTablename(String value) {
                        this.tablename = value;
                    }

                    /**
                     * Gets the value of the tableref property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getTableref() {
                        return tableref;
                    }

                    /**
                     * Sets the value of the tableref property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setTableref(String value) {
                        this.tableref = value;
                    }

                    /**
                     * Gets the value of the updaterule property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getUpdaterule() {
                        return updaterule;
                    }

                    /**
                     * Sets the value of the updaterule property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setUpdaterule(String value) {
                        this.updaterule = value;
                    }

                }

            }


            /**
             * <p>Java class for anonymous complex type.
             *
             * <p>The following schema fragment specifies the expected content contained within this class.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="joinColumns">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="joinColumn" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;simpleContent>
             *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                           &lt;attribute name="insertable" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="nullable" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="referencedColumnName" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="unique" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="updatable" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/extension>
             *                       &lt;/simpleContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="cardinality" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="cascade" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="fetch" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="foreignKeyName" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="inverseSideOf" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="javaName" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="javaType" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="joinTableName" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="mappedBy" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="optional" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="owningSide" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="sourceTableName" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="targetEntity" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="targetTableName" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="used" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "joinColumns"
            })
            public static class Link {

                @XmlElement(required = true)
                protected JoinColumns joinColumns;
                @XmlAttribute(name = "cardinality")
                protected String cardinality;
                @XmlAttribute(name = "cascade")
                protected String cascade;
                @XmlAttribute(name = "fetch")
                protected String fetch;
                @XmlAttribute(name = "foreignKeyName")
                protected String foreignKeyName;
                @XmlAttribute(name = "id")
                protected String id;
                @XmlAttribute(name = "inverseSideOf")
                protected String inverseSideOf;
                @XmlAttribute(name = "javaName")
                protected String javaName;
                @XmlAttribute(name = "javaType")
                protected String javaType;
                @XmlAttribute(name = "joinTableName")
                protected String joinTableName;
                @XmlAttribute(name = "mappedBy")
                protected String mappedBy;
                @XmlAttribute(name = "optional")
                protected String optional;
                @XmlAttribute(name = "owningSide")
                protected String owningSide;
                @XmlAttribute(name = "sourceTableName")
                protected String sourceTableName;
                @XmlAttribute(name = "targetEntity")
                protected String targetEntity;
                @XmlAttribute(name = "targetTableName")
                protected String targetTableName;
                @XmlAttribute(name = "used")
                protected String used;

                /**
                 * Gets the value of the joinColumns property.
                 *
                 * @return
                 *     possible object is
                 *     {@link JoinColumns }
                 *
                 */
                public JoinColumns getJoinColumns() {
                    return joinColumns;
                }

                /**
                 * Sets the value of the joinColumns property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link JoinColumns }
                 *
                 */
                public void setJoinColumns(JoinColumns value) {
                    this.joinColumns = value;
                }

                /**
                 * Gets the value of the cardinality property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getCardinality() {
                    return cardinality;
                }

                /**
                 * Sets the value of the cardinality property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setCardinality(String value) {
                    this.cardinality = value;
                }

                /**
                 * Gets the value of the cascade property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getCascade() {
                    return cascade;
                }

                /**
                 * Sets the value of the cascade property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setCascade(String value) {
                    this.cascade = value;
                }

                /**
                 * Gets the value of the fetch property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getFetch() {
                    return fetch;
                }

                /**
                 * Sets the value of the fetch property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setFetch(String value) {
                    this.fetch = value;
                }

                /**
                 * Gets the value of the foreignKeyName property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getForeignKeyName() {
                    return foreignKeyName;
                }

                /**
                 * Sets the value of the foreignKeyName property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setForeignKeyName(String value) {
                    this.foreignKeyName = value;
                }

                /**
                 * Gets the value of the id property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getId() {
                    return id;
                }

                /**
                 * Sets the value of the id property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setId(String value) {
                    this.id = value;
                }

                /**
                 * Gets the value of the inverseSideOf property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getInverseSideOf() {
                    return inverseSideOf;
                }

                /**
                 * Sets the value of the inverseSideOf property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setInverseSideOf(String value) {
                    this.inverseSideOf = value;
                }

                /**
                 * Gets the value of the javaName property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getJavaName() {
                    return javaName;
                }

                /**
                 * Sets the value of the javaName property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setJavaName(String value) {
                    this.javaName = value;
                }

                /**
                 * Gets the value of the javaType property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getJavaType() {
                    return javaType;
                }

                /**
                 * Sets the value of the javaType property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setJavaType(String value) {
                    this.javaType = value;
                }

                /**
                 * Gets the value of the joinTableName property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getJoinTableName() {
                    return joinTableName;
                }

                /**
                 * Sets the value of the joinTableName property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setJoinTableName(String value) {
                    this.joinTableName = value;
                }

                /**
                 * Gets the value of the mappedBy property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getMappedBy() {
                    return mappedBy;
                }

                /**
                 * Sets the value of the mappedBy property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setMappedBy(String value) {
                    this.mappedBy = value;
                }

                /**
                 * Gets the value of the optional property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getOptional() {
                    return optional;
                }

                /**
                 * Sets the value of the optional property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setOptional(String value) {
                    this.optional = value;
                }

                /**
                 * Gets the value of the owningSide property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getOwningSide() {
                    return owningSide;
                }

                /**
                 * Sets the value of the owningSide property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setOwningSide(String value) {
                    this.owningSide = value;
                }

                /**
                 * Gets the value of the sourceTableName property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getSourceTableName() {
                    return sourceTableName;
                }

                /**
                 * Sets the value of the sourceTableName property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setSourceTableName(String value) {
                    this.sourceTableName = value;
                }

                /**
                 * Gets the value of the targetEntity property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getTargetEntity() {
                    return targetEntity;
                }

                /**
                 * Sets the value of the targetEntity property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setTargetEntity(String value) {
                    this.targetEntity = value;
                }

                /**
                 * Gets the value of the targetTableName property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getTargetTableName() {
                    return targetTableName;
                }

                /**
                 * Sets the value of the targetTableName property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setTargetTableName(String value) {
                    this.targetTableName = value;
                }

                /**
                 * Gets the value of the used property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getUsed() {
                    return used;
                }

                /**
                 * Sets the value of the used property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setUsed(String value) {
                    this.used = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 *
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="joinColumn" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;simpleContent>
                 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *                 &lt;attribute name="insertable" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="nullable" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="referencedColumnName" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="unique" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="updatable" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/extension>
                 *             &lt;/simpleContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "joinColumn"
                })
                public static class JoinColumns {

                    protected List<JoinColumn> joinColumn;

                    /**
                     * Gets the value of the joinColumn property.
                     *
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the joinColumn property.
                     *
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getJoinColumn().add(newItem);
                     * </pre>
                     *
                     *
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link JoinColumn }
                     *
                     *
                     */
                    public List<JoinColumn> getJoinColumn() {
                        if (joinColumn == null) {
                            joinColumn = new ArrayList<JoinColumn>();
                        }
                        return this.joinColumn;
                    }


                    /**
                     * <p>Java class for anonymous complex type.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;simpleContent>
                     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                     *       &lt;attribute name="insertable" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="nullable" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="referencedColumnName" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="unique" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="updatable" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/extension>
                     *   &lt;/simpleContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "value"
                    })
                    public static class JoinColumn {

                        @XmlValue
                        protected String value;
                        @XmlAttribute(name = "insertable")
                        protected String insertable;
                        @XmlAttribute(name = "name")
                        protected String name;
                        @XmlAttribute(name = "nullable")
                        protected String nullable;
                        @XmlAttribute(name = "referencedColumnName")
                        protected String referencedColumnName;
                        @XmlAttribute(name = "unique")
                        protected String unique;
                        @XmlAttribute(name = "updatable")
                        protected String updatable;

                        /**
                         * Gets the value of the value property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getValue() {
                            return value;
                        }

                        /**
                         * Sets the value of the value property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setValue(String value) {
                            this.value = value;
                        }

                        /**
                         * Gets the value of the insertable property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getInsertable() {
                            return insertable;
                        }

                        /**
                         * Sets the value of the insertable property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setInsertable(String value) {
                            this.insertable = value;
                        }

                        /**
                         * Gets the value of the name property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getName() {
                            return name;
                        }

                        /**
                         * Sets the value of the name property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setName(String value) {
                            this.name = value;
                        }

                        /**
                         * Gets the value of the nullable property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getNullable() {
                            return nullable;
                        }

                        /**
                         * Sets the value of the nullable property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setNullable(String value) {
                            this.nullable = value;
                        }

                        /**
                         * Gets the value of the referencedColumnName property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getReferencedColumnName() {
                            return referencedColumnName;
                        }

                        /**
                         * Sets the value of the referencedColumnName property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setReferencedColumnName(String value) {
                            this.referencedColumnName = value;
                        }

                        /**
                         * Gets the value of the unique property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getUnique() {
                            return unique;
                        }

                        /**
                         * Sets the value of the unique property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setUnique(String value) {
                            this.unique = value;
                        }

                        /**
                         * Gets the value of the updatable property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getUpdatable() {
                            return updatable;
                        }

                        /**
                         * Sets the value of the updatable property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setUpdatable(String value) {
                            this.updatable = value;
                        }

                    }

                }

            }

        }

    }

}
