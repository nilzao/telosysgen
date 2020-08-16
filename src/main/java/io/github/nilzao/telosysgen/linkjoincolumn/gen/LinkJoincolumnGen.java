package io.github.nilzao.telosysgen.linkjoincolumn.gen;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@MappedSuperclass
public abstract class LinkJoincolumnGen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_JOINCOLUMN")
    private Long idJoincolumn;
    
    @Column(name = "INSERTABLE")
    private String insertable;
        
    @Column(name = "NAME")
    private String name;
        
    @Column(name = "NULLABLE_TG")
    private String nullable;
        
    @Column(name = "REFERENCEDCOLUMNNAME")
    private String referencedColumnName;
        
    @Column(name = "UNIQUE_TG")
    private String unique;
        
    @Column(name = "UPDATABLE")
    private String updatable;
        
    @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST })
    @JoinColumn(name = "ID_LINK", referencedColumnName = "ID_LINK")
    private io.github.nilzao.telosysgen.link.Link link;
        
}