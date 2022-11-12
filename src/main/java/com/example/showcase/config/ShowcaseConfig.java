package com.example.showcase.config;

import com.example.showcase.properties.ShowcaseProperties;
import com.example.showcase.service.ShowcaseService;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(ShowcaseProperties.class)
public class ShowcaseConfig {
    @Bean(initMethod = "hello")
    public ShowcaseService showcaseService(){
        return new ShowcaseService();
    }
}
