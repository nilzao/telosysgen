package io.github.nilzao.telosysgen.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.web.config.PageableHandlerMethodArgumentResolverCustomizer;

@Configuration
public class PageableResolverConfig {

    @Bean
    public PageableHandlerMethodArgumentResolverCustomizer oneIndex() {
        return p -> p.setOneIndexedParameters(true);
    }
}
