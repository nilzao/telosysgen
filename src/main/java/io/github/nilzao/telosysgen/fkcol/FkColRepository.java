package io.github.nilzao.telosysgen.fkcol;

import io.github.nilzao.telosysgen.fkcol.gen.FkColRepositoryGen;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "fkcols", path = "fkcols")
public interface FkColRepository extends FkColRepositoryGen {

    Page<FkCol> findByFk_Table_IdTable(@Param("idTable") Long idTable, Pageable pageable);

}