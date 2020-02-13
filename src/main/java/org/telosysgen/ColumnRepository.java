package org.telosysgen;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "column", path = "column")
public interface ColumnRepository extends PagingAndSortingRepository<TbColumnJpaRecord, Long> {

}
