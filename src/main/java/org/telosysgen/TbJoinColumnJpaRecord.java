/*
 * Created on 2020-02-12 ( Date ISO 2020-02-12 - Time 22:12:27 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.1.2
 */

package org.telosysgen;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "TB_LINK_JOINCOLUMN")
// Define named queries here
@NamedQueries({ @NamedQuery(name = "TbJoinColumnJpaRecord.countAll", query = "SELECT COUNT(x) FROM TbJoinColumnJpaRecord x"),
		@NamedQuery(name = "TbJoinColumnJpaRecord.countById", query = "SELECT COUNT(x) FROM TbJoinColumnJpaRecord x WHERE x.idJoinColumn = ?1 ") })
public class TbJoinColumnJpaRecord implements Serializable {

	private static final long serialVersionUID = 1L;

	// ----------------------------------------------------------------------
	// ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
	// ----------------------------------------------------------------------
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "SEQ_JOINCOLUMN")
	@Column(name = "ID_JOINCOLUMN", nullable = false)
	private Long idJoinColumn;

	// ----------------------------------------------------------------------
	// ENTITY DATA FIELDS
	// ----------------------------------------------------------------------
	@Column(name = "INSERTABLE", length = 100)
	private String insertable;

	@Column(name = "NAME", length = 100)
	private String name;

	@Column(name = "NULLABLE_TG", length = 100)
	private String nullable;

	@Column(name = "REFERENCEDCOLUMNNAME", length = 100)
	private String referencedColumnName;

	@Column(name = "UNIQUE_TG", length = 100)
	private String unique;

	@Column(name = "UPDATABLE", length = 100)
	private String updatable;

	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST })
	@JoinColumn(name = "ID_LINK", referencedColumnName = "ID_LINK", foreignKey = @ForeignKey(name = "FK_JOINCOLUN_LINK"))
	private TbLinkJpaRecord link;

	// ----------------------------------------------------------------------
	// CONSTRUCTOR(S)
	// ----------------------------------------------------------------------
	public TbJoinColumnJpaRecord() {
		super();
	}

	public Long getIdJoinColumn() {
		return idJoinColumn;
	}

	public void setIdJoinColumn(Long idJoinColumn) {
		this.idJoinColumn = idJoinColumn;
	}

	public String getInsertable() {
		return insertable;
	}

	public void setInsertable(String insertable) {
		this.insertable = insertable;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNullable() {
		return nullable;
	}

	public void setNullable(String nullable) {
		this.nullable = nullable;
	}

	public String getReferencedColumnName() {
		return referencedColumnName;
	}

	public void setReferencedColumnName(String referencedColumnName) {
		this.referencedColumnName = referencedColumnName;
	}

	public String getUnique() {
		return unique;
	}

	public void setUnique(String unique) {
		this.unique = unique;
	}

	public String getUpdatable() {
		return updatable;
	}

	public void setUpdatable(String updatable) {
		this.updatable = updatable;
	}

	public TbLinkJpaRecord getLink() {
		return link;
	}

	public void setLink(TbLinkJpaRecord link) {
		this.link = link;
	}

	public void setId(Long id) {
		this.idJoinColumn = id;
	}

	public Long getId() {
		return this.idJoinColumn;
	}

}
