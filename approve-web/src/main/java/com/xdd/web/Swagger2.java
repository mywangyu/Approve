package com.xdd.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by Deso on 2019/3/18.
 */
@Configuration
@EnableSwagger2
public class Swagger2 {

    @Bean
    public Docket createApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("auth")
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.xdd.web.controller.auth"))
                .paths(PathSelectors.any())
                .build();
    }


    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("approve 1.0 beta api")
                .description("参考:https://www.cnblogs.com/jtlgb/p/8532433.html")
                .version("1.0")
                .build();

    }
}
