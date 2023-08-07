package com.examly.springapp.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.examly.springapp.model.Student;

@Configuration
@ComponentScan(basePackages = "com.examly.springapp")
public class AppConfig {

    @Bean
    public Student student() {
        return new Student();
    }
}
