package ru.inbox.foreman.springjsp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;


    @Configuration
    @EnableWebMvc
    public class MVCConfig {
        @Bean
        public InternalResourceViewResolver resourceViewResolver() {
            InternalResourceViewResolver resolver = new InternalResourceViewResolver();
            resolver.setSuffix(".jsp");
            resolver.setPrefix("WEB-INF/pages/");
            resolver.setViewClass(JstlView.class);
            return resolver;
        }
    }