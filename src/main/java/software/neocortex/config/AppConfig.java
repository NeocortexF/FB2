package software.neocortex.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import software.neocortex.model.Message;

@Configuration
public class AppConfig {

    @Autowired
    Environment environment;    //возможость подключать внешние ресурсы из папки маркированной как ресурсы
                                //либо руками - правой кнопкой по папке, либо в pom.xml

    @Bean
    public Message message() {
        return new Message("Welcome to FB2!");
    }

    @Bean
    public DriverManagerDataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(environment.getProperty("jdbc.mysql.driverClass"));
        dataSource.setUrl(environment.getProperty("jdbc.mysql.url"));
        dataSource.setUsername(environment.getProperty("jdbc.mysql.username"));
        dataSource.setPassword(environment.getProperty("jdbc.mysql.password"));
        return dataSource;
    }
}
