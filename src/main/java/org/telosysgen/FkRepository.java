package org.telosysgen;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "fk", path = "fk")
public interface FkRepository extends PagingAndSortingRepository<TbFkJpaRecord, Long> {
}
