package org.telosysgen;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "link", path = "link")
public interface LinkRepository extends PagingAndSortingRepository<TbLinkJpaRecord, Long> {
}
