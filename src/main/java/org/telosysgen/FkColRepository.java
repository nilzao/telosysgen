package org.telosysgen;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "fkcol", path = "fkcol")
public interface FkColRepository extends PagingAndSortingRepository<TbFkColJpaRecord, Long> {

	Page<TbFkColJpaRecord> findByFk_Table_IdTable(@Param("tableId") Long tableId, Pageable pageable);

}
