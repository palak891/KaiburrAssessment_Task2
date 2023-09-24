package com.kaiburr.Ankit;

import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@Server
@Configuration
@EnableSwagger2
@ComponentScan(basePackages = "com.kaiburr")
public class SwaggerConfig {
    // Configuration code here

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.kaiburr")) // Set your base package here
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Ankit's Task-2 for Kaiburr")
                .description("API documentation for the Kaiburr application.")
                .version("1.0.0")
                .contact(ApiInfo.DEFAULT_CONTACT)
                .build();
    }
}
