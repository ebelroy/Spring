package com.springdemo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc//this is instead of <mvc:annotation-driven />
@ComponentScan("com.springdemo")
public class DemoAppConfig {

}
