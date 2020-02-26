package org.telosysgen;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "fk", path = "fk")
public interface FkRepository extends PagingAndSortingRepository<TbFkJpaRecord, Long> {

	List<TbFkJpaRecord> findByTable_IdTable(@Param("tableId") Long tableId, Pageable pageable);

}
