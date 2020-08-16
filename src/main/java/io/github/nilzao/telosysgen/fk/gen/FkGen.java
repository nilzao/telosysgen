package io.github.nilzao.telosysgen.fk.gen;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@MappedSuperclass
public abstract class FkGen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_FK")
    private Long idFk;
    
    @Column(name = "NAME")
    private String name;
        
    @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST })
    @JoinColumn(name = "ID_TABLE", referencedColumnName = "ID_TABLE")
    private io.github.nilzao.telosysgen.table.Table table;
            
    @OneToMany(mappedBy = "fk",
    targetEntity = io.github.nilzao.telosysgen.fkcol.FkCol.class,
    fetch = FetchType.LAZY,cascade = { CascadeType.MERGE, CascadeType.PERSIST })
    private java.util.List<io.github.nilzao.telosysgen.fkcol.FkCol> fkColList;
    
}