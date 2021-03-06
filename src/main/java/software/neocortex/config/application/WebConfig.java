package software.neocortex.config.application;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan({"software.neocortex.config",
        "software.neocortex.controller.*", "software.neocortex.dao.*",
         "software.neocortex.service.*", "software.neocortex.*"})
public class WebConfig extends WebMvcConfigurerAdapter {

    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setViewClass(JstlView.class);
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
        viewResolver.setContentType("text/html; charset=utf-8");
        return viewResolver;
    }

//    @Bean
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/css/**").addResourceLocations("WEB-INF/views/css");
//        registry.addResourceHandler("/img/**").addResourceLocations("WEB-INF/views/img");
//        registry.addResourceHandler("/js/**").addResourceLocations("WEB-INF/views/js");
//        registry.addResourceHandler("/font/**").addResourceLocations("WEB-INF/views/font");
//    }


}