/*
 * Created on 2020-02-12 ( Date ISO 2020-02-12 - Time 22:12:27 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.1.2
 */

package org.telosysgen;

import java.io.Serializable;


import javax.persistence.*;

/**
 * Persistent class for "TbLink" entity stored in table "TB_LINK" <br>
 * This class is a "record entity" without JPA links  <br>
 *
 * @author Telosys
 *
 */
@Entity
@Table(name="TB_LINK", schema="PUBLIC" )
// Define named queries here
@NamedQueries ( {
  @NamedQuery ( name="TbLinkJpaRecord.countAll",  query="SELECT COUNT(x) FROM TbLinkJpaRecord x" ),
  @NamedQuery ( name="TbLinkJpaRecord.countById", query="SELECT COUNT(x) FROM TbLinkJpaRecord x WHERE x.idLink = ?1 " )
} )
public class TbLinkJpaRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="ID_LINK", nullable=false)
    private Long       idLink       ; 

    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    @Column(name="CARDINALITY_TG", length=100)
    private String     cardinalityTg ; 

    @Column(name="CASCADE_TG", length=100)
    private String     cascadeTg    ; 

    @Column(name="FETCH_TG", length=100)
    private String     fetchTg      ; 

    @Column(name="FOREIGN_KEY_NAME", length=100)
    private String     foreignKeyName ; 

    @Column(name="ID", length=100)
    private String     id           ; 

    @Column(name="INVERSE_SIDE_OF", length=100)
    private String     inverseSideOf ; 

    @Column(name="JAVA_NAME", length=100)
    private String     javaName     ; 

    @Column(name="JAVA_TYPE", length=100)
    private String     javaType     ; 

    @Column(name="JOIN_TABLE_NAME", length=100)
    private String     joinTableName ; 

    @Column(name="MAPPED_BY", length=100)
    private String     mappedBy     ; 

    @Column(name="OPTIONAL", length=100)
    private String     optional     ; 

    @Column(name="OWNING_SIDE", length=100)
    private String     owningSide   ; 

    @Column(name="SOURCE_TABLE_NAME", length=100)
    private String     sourceTableName ; 

    @Column(name="TARGET_ENTITY", length=100)
    private String     targetEntity ; 

    @Column(name="TARGET_TABLE_NAME", length=100)
    private String     targetTableName ; 

    @Column(name="USED", length=100)
    private String     used         ; 

    @Column(name="ID_TABLE")
    private Long       idTable      ; // Foreign Key 


    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public TbLinkJpaRecord() {
		super();
    }
    
    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
    public void setIdLink( Long idLink ) {
        this.idLink = idLink ;
    }
    public Long getIdLink() {
        return this.idLink;
    }

    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
    //--- DATABASE MAPPING : CARDINALITY_TG ( VARCHAR ) 
    public void setCardinalityTg( String cardinalityTg ) {
        this.cardinalityTg = cardinalityTg;
    }
    public String getCardinalityTg() {
        return this.cardinalityTg;
    }

    //--- DATABASE MAPPING : CASCADE_TG ( VARCHAR ) 
    public void setCascadeTg( String cascadeTg ) {
        this.cascadeTg = cascadeTg;
    }
    public String getCascadeTg() {
        return this.cascadeTg;
    }

    //--- DATABASE MAPPING : FETCH_TG ( VARCHAR ) 
    public void setFetchTg( String fetchTg ) {
        this.fetchTg = fetchTg;
    }
    public String getFetchTg() {
        return this.fetchTg;
    }

    //--- DATABASE MAPPING : FOREIGN_KEY_NAME ( VARCHAR ) 
    public void setForeignKeyName( String foreignKeyName ) {
        this.foreignKeyName = foreignKeyName;
    }
    public String getForeignKeyName() {
        return this.foreignKeyName;
    }

    //--- DATABASE MAPPING : ID ( VARCHAR ) 
    public void setId( String id ) {
        this.id = id;
    }
    public String getId() {
        return this.id;
    }

    //--- DATABASE MAPPING : INVERSE_SIDE_OF ( VARCHAR ) 
    public void setInverseSideOf( String inverseSideOf ) {
        this.inverseSideOf = inverseSideOf;
    }
    public String getInverseSideOf() {
        return this.inverseSideOf;
    }

    //--- DATABASE MAPPING : JAVA_NAME ( VARCHAR ) 
    public void setJavaName( String javaName ) {
        this.javaName = javaName;
    }
    public String getJavaName() {
        return this.javaName;
    }

    //--- DATABASE MAPPING : JAVA_TYPE ( VARCHAR ) 
    public void setJavaType( String javaType ) {
        this.javaType = javaType;
    }
    public String getJavaType() {
        return this.javaType;
    }

    //--- DATABASE MAPPING : JOIN_TABLE_NAME ( VARCHAR ) 
    public void setJoinTableName( String joinTableName ) {
        this.joinTableName = joinTableName;
    }
    public String getJoinTableName() {
        return this.joinTableName;
    }

    //--- DATABASE MAPPING : MAPPED_BY ( VARCHAR ) 
    public void setMappedBy( String mappedBy ) {
        this.mappedBy = mappedBy;
    }
    public String getMappedBy() {
        return this.mappedBy;
    }

    //--- DATABASE MAPPING : OPTIONAL ( VARCHAR ) 
    public void setOptional( String optional ) {
        this.optional = optional;
    }
    public String getOptional() {
        return this.optional;
    }

    //--- DATABASE MAPPING : OWNING_SIDE ( VARCHAR ) 
    public void setOwningSide( String owningSide ) {
        this.owningSide = owningSide;
    }
    public String getOwningSide() {
        return this.owningSide;
    }

    //--- DATABASE MAPPING : SOURCE_TABLE_NAME ( VARCHAR ) 
    public void setSourceTableName( String sourceTableName ) {
        this.sourceTableName = sourceTableName;
    }
    public String getSourceTableName() {
        return this.sourceTableName;
    }

    //--- DATABASE MAPPING : TARGET_ENTITY ( VARCHAR ) 
    public void setTargetEntity( String targetEntity ) {
        this.targetEntity = targetEntity;
    }
    public String getTargetEntity() {
        return this.targetEntity;
    }

    //--- DATABASE MAPPING : TARGET_TABLE_NAME ( VARCHAR ) 
    public void setTargetTableName( String targetTableName ) {
        this.targetTableName = targetTableName;
    }
    public String getTargetTableName() {
        return this.targetTableName;
    }

    //--- DATABASE MAPPING : USED ( VARCHAR ) 
    public void setUsed( String used ) {
        this.used = used;
    }
    public String getUsed() {
        return this.used;
    }

    //--- DATABASE MAPPING : ID_TABLE ( BIGINT ) 
    public void setIdTable( Long idTable ) {
        this.idTable = idTable;
    }
    public Long getIdTable() {
        return this.idTable;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append("["); 
        sb.append(idLink);
        sb.append("]:"); 
        sb.append(cardinalityTg);
        sb.append("|");
        sb.append(cascadeTg);
        sb.append("|");
        sb.append(fetchTg);
        sb.append("|");
        sb.append(foreignKeyName);
        sb.append("|");
        sb.append(id);
        sb.append("|");
        sb.append(inverseSideOf);
        sb.append("|");
        sb.append(javaName);
        sb.append("|");
        sb.append(javaType);
        sb.append("|");
        sb.append(joinTableName);
        sb.append("|");
        sb.append(mappedBy);
        sb.append("|");
        sb.append(optional);
        sb.append("|");
        sb.append(owningSide);
        sb.append("|");
        sb.append(sourceTableName);
        sb.append("|");
        sb.append(targetEntity);
        sb.append("|");
        sb.append(targetTableName);
        sb.append("|");
        sb.append(used);
        sb.append("|");
        sb.append(idTable);
        return sb.toString(); 
    } 

}