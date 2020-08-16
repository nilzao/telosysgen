package io.github.nilzao.telosysgen.linkjoincolumn;

import io.github.nilzao.telosysgen.linkjoincolumn.gen.LinkJoincolumnRepositoryGen;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "linkjoincolumns", path = "linkjoincolumns")
public interface LinkJoincolumnRepository extends LinkJoincolumnRepositoryGen {

    Page<LinkJoincolumn> findByLink_Table_IdTable(@Param("idTable") Long idTable, Pageable pageable);

}