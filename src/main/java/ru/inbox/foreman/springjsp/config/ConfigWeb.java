package ru.inbox.foreman.springjsp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import ru.inbox.foreman.springjsp.service.UserDetailsServiceImpl;

@Configuration

@EnableWebMvc
public class ConfigWeb {

    @Bean
    public InternalResourceViewResolver resourceViewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setSuffix(".jsp");
        resolver.setPrefix("/pages/");
        resolver.setViewClass(JstlView.class);
        return resolver;
    }

    @Bean
    public UserDetailsServiceImpl getUserDetailsService(){
        return new UserDetailsServiceImpl();
    }
}
