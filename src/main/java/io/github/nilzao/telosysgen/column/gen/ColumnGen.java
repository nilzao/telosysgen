package io.github.nilzao.telosysgen.column.gen;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@MappedSuperclass
public abstract class ColumnGen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_COLUMN")
    private Long idColumn;
    
    @Column(name = "DB_AUTOINCREMENTED")
    private String dbAutoIncremented;
        
    @Column(name = "DB_COMMENT")
    private String dbComment;
        
    @Column(name = "DB_DEFAULT_VALUE")
    private String dbDefaultValue;
        
    @Column(name = "DB_NAME")
    private String dbName;
        
    @Column(name = "DB_NOT_NULL")
    private String dbNotNull;
        
    @Column(name = "DB_POSITION")
    private String dbPosition;
        
    @Column(name = "DB_PRIMARY_KEY")
    private String dbPrimaryKey;
        
    @Column(name = "DB_SIZE")
    private String dbSize;
        
    @Column(name = "DB_TYPE_NAME")
    private String dbTypeName;
        
    @Column(name = "INPUT_TYPE")
    private String inputType;
        
    @Column(name = "JAVA_NAME")
    private String javaName;
        
    @Column(name = "JAVA_TYPE")
    private String javaType;
        
    @Column(name = "JDBC_TYPE_CODE")
    private String jdbcTypeCode;
        
    @Column(name = "LABEL")
    private String label;
        
    @Column(name = "MAX_LENGTH")
    private String maxLength;
        
    @Column(name = "NOT_NULL")
    private String notNull;
        
    @Column(name = "SELECTED")
    private String selected;
        
    @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST })
    @JoinColumn(name = "ID_TABLE", referencedColumnName = "ID_TABLE")
    private io.github.nilzao.telosysgen.table.Table table;
        
}