package org.telosysgen;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "joinColumn", path = "joinColumn")
public interface JoinColumnRepository extends PagingAndSortingRepository<TbJoinColumnJpaRecord, Long> {

	List<TbJoinColumnJpaRecord> findByLink_IdLink(@Param("linkId") Long linkId, Pageable pageable);

}
