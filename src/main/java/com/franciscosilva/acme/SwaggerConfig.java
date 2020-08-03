package com.franciscosilva.acme;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {

    @Bean
    public springfox.documentation.spring.web.plugins.Docket docket() {
        Docket docket = new Docket(springfox.documentation.spi.DocumentationType.SWAGGER_2);
        return docket.apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        @SuppressWarnings("deprecation")
        ApiInfo apiInfo = new ApiInfo("Acme Producer (AP) REST API", "Lista de serviços da empresa AP para integração", "Versão API 1.0",
                "Termos de uso", "aluno@e-mail.com", "API License", "API License URL");
        return apiInfo;
    }

}
