package io.github.nilzao.telosysgen.link.gen;
                                                                        
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;
import io.github.nilzao.telosysgen.link.Link;

@NoRepositoryBean
public interface LinkRepositoryGen extends PagingAndSortingRepository<Link, Long> {

    Page<Link> findByTable_IdTable(@Param("idTable") Long idTable, Pageable pageable);

}