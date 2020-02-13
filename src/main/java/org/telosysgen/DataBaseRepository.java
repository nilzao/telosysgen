package org.telosysgen;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "database", path = "database")
public interface DataBaseRepository extends PagingAndSortingRepository<TbDatabaseJpaRecord, Long> {

}
