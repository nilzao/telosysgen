package org.telosysgen;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "linkJoinColumn", path = "linkJoinColumn")
public interface JoinColumnRepository extends PagingAndSortingRepository<TbJoinColumnJpaRecord, Long> {

	Page<TbJoinColumnJpaRecord> findByLink_Table_IdTable(@Param("tableId") Long tableId, Pageable pageable);

}
