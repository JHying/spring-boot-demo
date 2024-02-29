package tw.hyin.demo.config;

import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tw.hyin.java.utils.config.SwaggerCreater;

/**
 * @author H-yin on 2021.
 * @Description ./swagger-ui/#/
 */
@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI createRestApi() {
        return SwaggerCreater.createSwaggerDefault("Description of APIs", "1.0");
    }

}
