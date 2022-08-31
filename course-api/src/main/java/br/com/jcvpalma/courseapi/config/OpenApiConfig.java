package br.com.jcvpalma.courseapi.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.info.BuildProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Autowired
    private BuildProperties buildProperties;

    @Bean
    public OpenAPI coursesOpenApi(){
        return new OpenAPI()
                .info(infoApi());
    }

    private Info infoApi(){
        return new Info()
                .title(buildProperties.getName())
                .description("API responsible to manage Courses data")
                .contact(contact())
                .version(buildProperties.getVersion());
    }

    private Contact contact(){
        return new Contact()
                .email("jcvpalma@gmail.com")
                .name("Julio Cesar V Palma")
                .url("https://github.com/jcvpalma");
    }

}
