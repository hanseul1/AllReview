package com.hs.review.config;

import static com.google.common.base.Predicates.or;
import static springfox.documentation.builders.PathSelectors.regex;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	private static final Logger logger = LoggerFactory.getLogger(SwaggerConfig.class);

	@Bean
    public Docket postsApi() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("allReview")
                .apiInfo(apiInfo()).select()
                //.paths(PathSelectors.any())
                .paths(postPaths())
                .build();
    }
	
    private Predicate<String> postPaths() {
        return regex("/.*");
    }
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("AllReview API")
                .description("AllReview API Reference for Developers")
                .termsOfServiceUrl("https://github.com/hanseul1")
                .license("hs")
                .licenseUrl("hs@hs.com").version("1.0").build();
    }

}
