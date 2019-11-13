package com.sumutella.basicspringsecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @author sumutella
 * @time 1:33 PM
 * @since 11/12/2019, Tue
 */


@Configuration
@EnableWebMvc  //annotation driven. formatting, conversion, ...
@ComponentScan(basePackages = "com.sumutella.basicspringsecurity")
public class SecurityDemoAppConfig {


    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver viewResolver1 = new InternalResourceViewResolver();
        viewResolver1.setPrefix("/WEB-INF/view/");
        viewResolver1.setSuffix(".jsp");
        return viewResolver1;
    }


}
