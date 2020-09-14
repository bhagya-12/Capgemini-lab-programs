package com.capg.otms.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@ComponentScan(basePackages= {"com.capg.otms.user"})
@Configuration
@EntityScan("com.capg.otms.user.model")
@EnableSwagger2
@SpringBootApplication
public class OtmsUserMsSwaggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OtmsUserMsSwaggerApplication.class, args);
	}
	@Bean
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)  
          .select()                                  
          .apis(RequestHandlerSelectors.any())              
          .paths(PathSelectors.any())                          
          .build();                                           
    }
@Bean
	
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	
}

}
