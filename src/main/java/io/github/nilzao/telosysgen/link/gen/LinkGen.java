package io.github.nilzao.telosysgen.link.gen;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@MappedSuperclass
public abstract class LinkGen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_LINK")
    private Long idLink;
    
    @Column(name = "CARDINALITY_TG")
    private String cardinality;
        
    @Column(name = "CASCADE_TG")
    private String cascade;
        
    @Column(name = "FETCH_TG")
    private String fetch;
        
    @Column(name = "FOREIGN_KEY_NAME")
    private String foreignKeyName;
        
    @Column(name = "ID_TMP")
    private String idTmp;
        
    @Column(name = "INVERSE_SIDE_OF")
    private String inverseSideOf;
        
    @Column(name = "JAVA_NAME")
    private String javaName;
        
    @Column(name = "JAVA_TYPE")
    private String javaType;
        
    @Column(name = "JOIN_TABLE_NAME")
    private String joinTableName;
        
    @Column(name = "MAPPED_BY")
    private String mappedBy;
        
    @Column(name = "OPTIONAL")
    private String optional;
        
    @Column(name = "OWNING_SIDE")
    private String owningSide;
        
    @Column(name = "SOURCE_TABLE_NAME")
    private String sourceTableName;
        
    @Column(name = "TARGET_ENTITY")
    private String targetEntity;
        
    @Column(name = "TARGET_TABLE_NAME")
    private String targetTableName;
        
    @Column(name = "USED")
    private String used;
        
    @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST })
    @JoinColumn(name = "ID_TABLE", referencedColumnName = "ID_TABLE")
    private io.github.nilzao.telosysgen.table.Table table;
        
    @OneToMany(mappedBy = "link",
    targetEntity = io.github.nilzao.telosysgen.linkjoincolumn.LinkJoincolumn.class,
    fetch = FetchType.LAZY,cascade = { CascadeType.MERGE, CascadeType.PERSIST })
    private java.util.List<io.github.nilzao.telosysgen.linkjoincolumn.LinkJoincolumn> linkJoincolumnList;
        
}