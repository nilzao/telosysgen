package org.telosysgen;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "fkcol", path = "fkcol")
public interface FkColRepository extends PagingAndSortingRepository<TbFkColJpaRecord, Long> {

	List<TbFkColJpaRecord> findByFk_Table_IdTable(@Param("tableId") Long tableId, Pageable pageable);

}
