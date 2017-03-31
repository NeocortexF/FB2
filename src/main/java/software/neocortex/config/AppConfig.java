package software.neocortex.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import software.neocortex.model.Message;
import software.neocortex.model.QueryExample;

@Configuration
@PropertySource(value = {"classpath:util.properties"})
public class AppConfig {

    @Autowired
    Environment environment;    //возможость подключать внешние ресурсы из папки маркированной как ресурсы
                                //либо руками - правой кнопкой по папке, либо в pom.xml

    @Bean
    public Message message() {
        return new Message("Welcome to FB2!");
    }

    //DriverManagerDataSource используеться только для теста подключения
    //для боевого режима используют пул подключений по средствам JNDI
    //например apache dbcp в котором есть фабрики для подключений
    //т.к. обычно пользователь запросы делает не постоянно, а подкдючать
    // и отключать на каждый запрос долго каждого пользователя
    @Bean
    public DriverManagerDataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(environment.getProperty("jdbc.mysql.driverClass"));
        dataSource.setUrl(environment.getProperty("jdbc.mysql.url"));
        dataSource.setUsername(environment.getProperty("jdbc.mysql.username"));
        dataSource.setPassword(environment.getProperty("jdbc.mysql.password"));
        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource());
        return jdbcTemplate;
    }

    @Bean
    public QueryExample queryExample() {
        return new QueryExample(jdbcTemplate());
    }
}
