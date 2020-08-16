package io.github.nilzao.telosysgen.fkcol.gen;
                                            
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;
import io.github.nilzao.telosysgen.fkcol.FkCol;

@NoRepositoryBean
public interface FkColRepositoryGen extends PagingAndSortingRepository<FkCol, Long> {

    Page<FkCol> findByFk_IdFk(@Param("idFk") Long idFk, Pageable pageable);

}