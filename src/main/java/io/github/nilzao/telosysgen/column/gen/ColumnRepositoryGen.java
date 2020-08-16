package io.github.nilzao.telosysgen.column.gen;
                                                                            
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;
import io.github.nilzao.telosysgen.column.Column;

@NoRepositoryBean
public interface ColumnRepositoryGen extends PagingAndSortingRepository<Column, Long> {

    Page<Column> findByTable_IdTable(@Param("idTable") Long idTable, Pageable pageable);

}