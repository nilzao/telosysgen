package io.github.nilzao.telosysgen.table.gen;
                                
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;
import io.github.nilzao.telosysgen.table.Table;

@NoRepositoryBean
public interface TableRepositoryGen extends PagingAndSortingRepository<Table, Long> {

    Page<Table> findByDatabase_IdDatabase(@Param("idDatabase") Long idDatabase, Pageable pageable);

}