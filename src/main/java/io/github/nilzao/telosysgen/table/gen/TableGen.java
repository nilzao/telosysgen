package io.github.nilzao.telosysgen.table.gen;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@MappedSuperclass
public abstract class TableGen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_TABLE")
    private Long idTable;
    
    @Column(name = "CATALOG")
    private String catalog;
        
    @Column(name = "DB_COMMENT")
    private String databaseComment;
        
    @Column(name = "JAVA_BEAN")
    private String javaBean;
        
    @Column(name = "NAME")
    private String name;
        
    @Column(name = "SCHEMA")
    private String schema;
        
    @Column(name = "DB_TYPE")
    private String databaseType;
        
    @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST })
    @JoinColumn(name = "ID_DATABASE", referencedColumnName = "ID_DATABASE")
    private io.github.nilzao.telosysgen.database.Database database;
        
    @OneToMany(mappedBy = "table",
    targetEntity = io.github.nilzao.telosysgen.link.Link.class,
    fetch = FetchType.LAZY,cascade = { CascadeType.MERGE, CascadeType.PERSIST })
    private java.util.List<io.github.nilzao.telosysgen.link.Link> linkList;
            
    @OneToMany(mappedBy = "table",
    targetEntity = io.github.nilzao.telosysgen.column.Column.class,
    fetch = FetchType.LAZY,cascade = { CascadeType.MERGE, CascadeType.PERSIST })
    private java.util.List<io.github.nilzao.telosysgen.column.Column> columnList;
        
    @OneToMany(mappedBy = "table",
    targetEntity = io.github.nilzao.telosysgen.fk.Fk.class,
    fetch = FetchType.LAZY,cascade = { CascadeType.MERGE, CascadeType.PERSIST })
    private java.util.List<io.github.nilzao.telosysgen.fk.Fk> fkList;
    
}