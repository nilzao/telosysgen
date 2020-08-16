package io.github.nilzao.telosysgen.app.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import javax.persistence.EntityManager;
import java.util.stream.Collectors;

@Configuration
@RequiredArgsConstructor
public class RepositoryRestConfigurerConfig implements RepositoryRestConfigurer {

    private final EntityManager entityManager;

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
//        expose ids
        config.exposeIdsFor(entityManager.getMetamodel()
                .getEntities().stream()
                .map(e -> e.getJavaType()).collect(Collectors.toList()).toArray(new Class[0]));
    }

}
