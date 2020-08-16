package io.github.nilzao.telosysgen.linkjoincolumn.gen;
                                
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;
import io.github.nilzao.telosysgen.linkjoincolumn.LinkJoincolumn;

@NoRepositoryBean
public interface LinkJoincolumnRepositoryGen extends PagingAndSortingRepository<LinkJoincolumn, Long> {

    Page<LinkJoincolumn> findByLink_IdLink(@Param("idLink") Long idLink, Pageable pageable);

}