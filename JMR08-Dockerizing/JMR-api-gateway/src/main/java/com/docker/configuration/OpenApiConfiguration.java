package com.docker.configuration;

import java.util.List;

import org.springdoc.core.GroupedOpenApi;
import org.springdoc.core.SwaggerUiConfigParameters;
import org.springdoc.core.SwaggerUiConfigProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class OpenApiConfiguration {
 
    @Bean
    @Lazy(false)
    public List<GroupedOpenApi> apis() {
        return List.of(
                // Define groups explicitly for cambio-service and book-service
                GroupedOpenApi.builder().group("cambio-service").pathsToMatch("/cambio/**").build(),
                GroupedOpenApi.builder().group("book-service").pathsToMatch("/book/**").build()
        );
    }
 
    @Bean
    @Lazy(false)
    public SwaggerUiConfigParameters swaggerUiConfigParameters(SwaggerUiConfigProperties swaggerUiConfigProperties) {
        return new SwaggerUiConfigParameters(swaggerUiConfigProperties);
    }
 
    @Bean
    @Lazy(false)
    public SwaggerUiConfigProperties swaggerUiConfigProperties() {
        return new SwaggerUiConfigProperties();
    }
}