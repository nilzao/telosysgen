/*
 * Created on 2020-02-12 ( Date ISO 2020-02-12 - Time 22:12:27 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.1.2
 */

package org.telosysgen;

import java.io.Serializable;


import javax.persistence.*;

/**
 * Persistent class for "TbDatabase" entity stored in table "TB_DATABASE" <br>
 * This class is a "record entity" without JPA links  <br>
 *
 * @author Telosys
 *
 */
@Entity
@Table(name="TB_DATABASE", schema="PUBLIC" )
// Define named queries here
@NamedQueries ( {
  @NamedQuery ( name="TbDatabaseJpaRecord.countAll",  query="SELECT COUNT(x) FROM TbDatabaseJpaRecord x" ),
  @NamedQuery ( name="TbDatabaseJpaRecord.countById", query="SELECT COUNT(x) FROM TbDatabaseJpaRecord x WHERE x.idDatabase = ?1 " )
} )
public class TbDatabaseJpaRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="ID_DATABASE", nullable=false)
    private Long       idDatabase   ; 

    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    @Column(name="NAME", length=100)
    private String     name         ; 

    @Column(name="PRODUCT_NAME", length=100)
    private String     productName  ; 

    @Column(name="GENERATION", length=100)
    private String     generation   ; 


    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public TbDatabaseJpaRecord() {
		super();
    }
    
    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
    public void setIdDatabase( Long idDatabase ) {
        this.idDatabase = idDatabase ;
    }
    public Long getIdDatabase() {
        return this.idDatabase;
    }

    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
    //--- DATABASE MAPPING : NAME ( VARCHAR ) 
    public void setDatabaseName( String name ) {
        this.name = name;
    }
    public String getDatabaseName() {
        return this.name;
    }

    //--- DATABASE MAPPING : PRODUCT_NAME ( VARCHAR ) 
    public void setDatabaseProductName( String productName ) {
        this.productName = productName;
    }
    public String getDatabaseProductName() {
        return this.productName;
    }

    //--- DATABASE MAPPING : GENERATION ( VARCHAR ) 
    public void setGeneration( String generation ) {
        this.generation = generation;
    }
    public String getGeneration() {
        return this.generation;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append("["); 
        sb.append(idDatabase);
        sb.append("]:"); 
        sb.append(name);
        sb.append("|");
        sb.append(productName);
        sb.append("|");
        sb.append(generation);
        return sb.toString(); 
    } 

}
