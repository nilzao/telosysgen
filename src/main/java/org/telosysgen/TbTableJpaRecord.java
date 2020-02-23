/*
 * Created on 2020-02-12 ( Date ISO 2020-02-12 - Time 22:12:27 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.1.2
 */

package org.telosysgen;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Persistent class for "TbTable" entity stored in table "TB_TABLE" <br>
 * This class is a "record entity" without JPA links <br>
 *
 * @author Telosys
 *
 */
@Entity
@Table(name = "TB_TABLE")
// Define named queries here
@NamedQueries({ @NamedQuery(name = "TbTableJpaRecord.countAll", query = "SELECT COUNT(x) FROM TbTableJpaRecord x"),
		@NamedQuery(name = "TbTableJpaRecord.countById", query = "SELECT COUNT(x) FROM TbTableJpaRecord x WHERE x.idTable = ?1 ") })
public class TbTableJpaRecord implements Serializable {

	private static final long serialVersionUID = 1L;

	// ----------------------------------------------------------------------
	// ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
	// ----------------------------------------------------------------------
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "SEQ_TABLE")
	@Column(name = "ID_TABLE", nullable = false)
	private Long idTable;

	// ----------------------------------------------------------------------
	// ENTITY DATA FIELDS
	// ----------------------------------------------------------------------
	@Column(name = "CATALOG", length = 100)
	private String catalog;

	@Column(name = "COMMENT", length = 100)
	private String comment;

	@Column(name = "TYPE", length = 100)
	private String type;

	@Column(name = "JAVA_BEAN", length = 100)
	private String javaBean;

	@Column(name = "NAME", length = 100)
	private String name;

	@Column(name = "SCHEMA", length = 100)
	private String schema;

	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST })
	@JoinColumn(name = "ID_DATABASE", referencedColumnName = "ID_DATABASE", foreignKey = @ForeignKey(name = "FK_TABLE_DATABASE"))
	private TbDatabaseJpaRecord database;

	@OneToMany(mappedBy = "table", fetch = FetchType.LAZY, targetEntity = TbColumnJpaRecord.class, cascade = { CascadeType.MERGE, CascadeType.PERSIST })
	private List<TbColumnJpaRecord> columnList;

	@OneToMany(mappedBy = "table", fetch = FetchType.LAZY, targetEntity = TbFkJpaRecord.class, cascade = { CascadeType.MERGE, CascadeType.PERSIST })
	private List<TbFkJpaRecord> fkList;

	@OneToMany(mappedBy = "table", fetch = FetchType.LAZY, targetEntity = TbLinkJpaRecord.class, cascade = { CascadeType.MERGE, CascadeType.PERSIST })
	private List<TbLinkJpaRecord> linkList;

	// ----------------------------------------------------------------------
	// CONSTRUCTOR(S)
	// ----------------------------------------------------------------------
	public TbTableJpaRecord() {
		super();
	}

	// ----------------------------------------------------------------------
	// GETTER & SETTER FOR THE KEY FIELD
	// ----------------------------------------------------------------------
	public void setIdTable(Long idTable) {
		this.idTable = idTable;
	}

	public Long getIdTable() {
		return this.idTable;
	}

	// ----------------------------------------------------------------------
	// GETTERS & SETTERS FOR FIELDS
	// ----------------------------------------------------------------------
	// --- DATABASE MAPPING : CATALOG ( VARCHAR )
	public void setCatalog(String catalog) {
		this.catalog = catalog;
	}

	public String getCatalog() {
		return this.catalog;
	}

	// --- DATABASE MAPPING : COMMENT ( VARCHAR )
	public void setDatabaseComment(String comment) {
		this.comment = comment;
	}

	public String getDatabaseComment() {
		return this.comment;
	}

	// --- DATABASE MAPPING : TYPE ( VARCHAR )
	public void setDatabaseType(String type) {
		this.type = type;
	}

	public String getDatabaseType() {
		return this.type;
	}

	// --- DATABASE MAPPING : JAVA_BEAN ( VARCHAR )
	public void setJavaBean(String javaBean) {
		this.javaBean = javaBean;
	}

	public String getJavaBean() {
		return this.javaBean;
	}

	// --- DATABASE MAPPING : NAME ( VARCHAR )
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	// --- DATABASE MAPPING : SCHEMA ( VARCHAR )
	public void setSchema(String schema) {
		this.schema = schema;
	}

	public String getSchema() {
		return this.schema;
	}

	public List<TbColumnJpaRecord> getColumnList() {
		return columnList;
	}

	public void setColumnList(List<TbColumnJpaRecord> columnList) {
		this.columnList = columnList;
	}

	public List<TbFkJpaRecord> getFkList() {
		return fkList;
	}

	public void setFkList(List<TbFkJpaRecord> fkList) {
		this.fkList = fkList;
	}

	public List<TbLinkJpaRecord> getLinkList() {
		return linkList;
	}

	public void setLinkList(List<TbLinkJpaRecord> linkList) {
		this.linkList = linkList;
	}

	public TbDatabaseJpaRecord getDatabase() {
		return database;
	}

	public void setDatabase(TbDatabaseJpaRecord database) {
		this.database = database;
	}

	public Long getId() {
		return this.idTable;
	}

	public void setId(Long id) {
		this.idTable = id;
	}

	// ----------------------------------------------------------------------
	// toString METHOD
	// ----------------------------------------------------------------------
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		sb.append(idTable);
		sb.append("]:");
		sb.append(catalog);
		sb.append("|");
		sb.append(comment);
		sb.append("|");
		sb.append(type);
		sb.append("|");
		sb.append(javaBean);
		sb.append("|");
		sb.append(name);
		sb.append("|");
		sb.append(schema);
		return sb.toString();
	}

}
