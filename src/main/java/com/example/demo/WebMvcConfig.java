package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.data.rest.configuration.SpringDataRestConfiguration;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@Import({SpringDataRestConfiguration.class})
@EnableSwagger2
public class WebMvcConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
            .groupName("example")
            .select()
            .paths(PathSelectors.any())
            .build()
            .apiInfo(apiInfo("Example API", "Example API"));
    }

    private ApiInfo apiInfo(String title, String description) {
         return new ApiInfoBuilder()
             .title(title)
             .description(description)
             .build();
   }
}
