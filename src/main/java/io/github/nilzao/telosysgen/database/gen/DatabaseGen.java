package io.github.nilzao.telosysgen.database.gen;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@MappedSuperclass
public abstract class DatabaseGen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_DATABASE")
    private Long idDatabase;
    
    @Column(name = "GENERATION")
    private String generation;
        
    @Column(name = "NAME")
    private String databaseName;
        
    @Column(name = "PRODUCT_NAME")
    private String databaseProductName;
        
    @OneToMany(mappedBy = "database",
    targetEntity = io.github.nilzao.telosysgen.table.Table.class,
    fetch = FetchType.LAZY,cascade = { CascadeType.MERGE, CascadeType.PERSIST })
    private java.util.List<io.github.nilzao.telosysgen.table.Table> tableList;
    
}