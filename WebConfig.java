package com.example.projectsc;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
@Configuration
@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler(
                "/images/**",
                "/css/**",
                "/fonts/**",
                "/js/**")
                .addResourceLocations(
                        "classpath:/static/images/",
                        "classpath:/static/css/",
                        "classpath:/static/fonts/",
                        "classpath:/static/js/");
    }
}
