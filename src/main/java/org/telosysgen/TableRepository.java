package org.telosysgen;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "table", path = "table")
public interface TableRepository extends PagingAndSortingRepository<TbTableJpaRecord, Long> {

	@Query("SELECT obj from TbTableJpaRecord obj where obj.name like :name%")
	List<TbTableJpaRecord> findByName(@Param("name") String name, Pageable pageable);
}
