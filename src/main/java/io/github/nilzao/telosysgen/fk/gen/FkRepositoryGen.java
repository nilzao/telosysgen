package io.github.nilzao.telosysgen.fk.gen;
            
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;
import io.github.nilzao.telosysgen.fk.Fk;

@NoRepositoryBean
public interface FkRepositoryGen extends PagingAndSortingRepository<Fk, Long> {

    Page<Fk> findByTable_IdTable(@Param("idTable") Long idTable, Pageable pageable);

}