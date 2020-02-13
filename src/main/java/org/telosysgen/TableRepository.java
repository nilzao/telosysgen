package org.telosysgen;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "table", path = "table")
public interface TableRepository extends PagingAndSortingRepository<TbTableJpaRecord, Long> {
}
