package org.telosysgen;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "fk", path = "fk")
public interface FkRepository extends PagingAndSortingRepository<TbFkJpaRecord, Long> {

	Page<TbFkJpaRecord> findByTable_IdTable(@Param("tableId") Long tableId, Pageable pageable);

}
