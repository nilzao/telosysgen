package io.github.nilzao.telosysgen.database.gen;
            import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;
import io.github.nilzao.telosysgen.database.Database;

@NoRepositoryBean
public interface DatabaseRepositoryGen extends PagingAndSortingRepository<Database, Long> {

}