package com.example.skillwillproject24;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class Config {

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
                return http.
                authorizeHttpRequests(customization -> customization.anyRequest().permitAll())
                        .build();
    }

}
