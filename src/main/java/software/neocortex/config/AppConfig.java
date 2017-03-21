package software.neocortex.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import software.neocortex.model.Message;

@Configuration
public class AppConfig {

    @Bean
    public Message message() {
        return new Message("Welcome to FB2!");
    }

}
