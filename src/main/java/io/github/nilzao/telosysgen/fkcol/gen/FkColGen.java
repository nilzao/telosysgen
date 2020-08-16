package io.github.nilzao.telosysgen.fkcol.gen;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@MappedSuperclass
public abstract class FkColGen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_FK_COL")
    private Long idFkCol;
    
    @Column(name = "COLNAME")
    private String colname;
        
    @Column(name = "COLREF")
    private String colref;
        
    @Column(name = "DEFERRABLE")
    private String deferrable;
        
    @Column(name = "DELETERULE")
    private String deleterule;
        
    @Column(name = "COLSEQUENCE")
    private String sequence;
        
    @Column(name = "TABLENAME")
    private String tablename;
        
    @Column(name = "TABLEREF")
    private String tableref;
        
    @Column(name = "UPDATERULE")
    private String updaterule;
        
    @Column(name = "VALUE")
    private String value;
        
    @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST })
    @JoinColumn(name = "ID_FK", referencedColumnName = "ID_FK")
    private io.github.nilzao.telosysgen.fk.Fk fk;
        
}