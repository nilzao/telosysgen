/*
 * Created on 2020-02-12 ( Date ISO 2020-02-12 - Time 22:12:27 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.1.2
 */

package org.telosysgen;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "TB_FK_COL")
// Define named queries here
@NamedQueries({ @NamedQuery(name = "TbFkColJpaRecord.countAll", query = "SELECT COUNT(x) FROM TbFkColJpaRecord x"),
		@NamedQuery(name = "TbFkColJpaRecord.countById", query = "SELECT COUNT(x) FROM TbFkColJpaRecord x WHERE x.idFkCol = ?1 ") })
public class TbFkColJpaRecord implements Serializable {

	private static final long serialVersionUID = 1L;

	// ----------------------------------------------------------------------
	// ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
	// ----------------------------------------------------------------------
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "SEQ_FK_COL")
	@Column(name = "ID_FK_COL", nullable = false)
	private Long idFkCol;

	// ----------------------------------------------------------------------
	// ENTITY DATA FIELDS
	// ----------------------------------------------------------------------
//	fkcol.getColref();
//	fkcol.getDeferrable();
//	fkcol.getDeleterule();
//	fkcol.getSequence();
//	fkcol.getTablename();
//	fkcol.getTableref();
//	fkcol.getUpdaterule();
//	fkcol.getValue();
	@Column(name = "COLNAME", length = 100)
	private String colname;

	@Column(name = "COLREF", length = 100)
	private String colref;

	@Column(name = "DEFERRABLE", length = 100)
	private String deferrable;

	@Column(name = "DELETERULE", length = 100)
	private String deleterule;

	@Column(name = "COLSEQUENCE", length = 100)
	private String sequence;

	@Column(name = "TABLENAME", length = 100)
	private String tablename;

	@Column(name = "TABLEREF", length = 100)
	private String tableref;

	@Column(name = "UPDATERULE", length = 100)
	private String updaterule;

	@Column(name = "VALUE", length = 100)
	private String value;

	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST })
	@JoinColumn(name = "ID_FK", referencedColumnName = "ID_FK", foreignKey = @ForeignKey(name = "FK_COL_FK"))
	private TbFkJpaRecord fk;

	// ----------------------------------------------------------------------
	// CONSTRUCTOR(S)
	// ----------------------------------------------------------------------
	public TbFkColJpaRecord() {
		super();
	}

	public Long getIdFkCol() {
		return idFkCol;
	}

	public void setIdFkCol(Long idFkCol) {
		this.idFkCol = idFkCol;
	}

	public String getColname() {
		return colname;
	}

	public void setColname(String colname) {
		this.colname = colname;
	}

	public String getColref() {
		return colref;
	}

	public void setColref(String colref) {
		this.colref = colref;
	}

	public String getDeferrable() {
		return deferrable;
	}

	public void setDeferrable(String deferrable) {
		this.deferrable = deferrable;
	}

	public String getSequence() {
		return sequence;
	}

	public void setSequence(String sequence) {
		this.sequence = sequence;
	}

	public String getTablename() {
		return tablename;
	}

	public void setTablename(String tablename) {
		this.tablename = tablename;
	}

	public String getTableref() {
		return tableref;
	}

	public void setTableref(String tableref) {
		this.tableref = tableref;
	}

	public String getUpdaterule() {
		return updaterule;
	}

	public void setUpdaterule(String updaterule) {
		this.updaterule = updaterule;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public TbFkJpaRecord getFk() {
		return fk;
	}

	public void setFk(TbFkJpaRecord fk) {
		this.fk = fk;
	}

	public Long getId() {
		return this.idFkCol;
	}

	public void setId(Long id) {
		this.idFkCol = id;
	}

	public String getDeleterule() {
		return deleterule;
	}

	public void setDeleterule(String deleterule) {
		this.deleterule = deleterule;
	}

	// ----------------------------------------------------------------------
	// GETTER & SETTER FOR THE KEY FIELD
	// ----------------------------------------------------------------------

}