package com.uacity.admin;

import com.uacity.admin.filter.SecurityFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.boot.context.embedded.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;

import javax.servlet.Filter;
import javax.servlet.MultipartConfigElement;

/**
 * Created by Ted on 16/4/21.
 */

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Application {

    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        characterEncodingFilter.setEncoding("UTF-8");
        characterEncodingFilter.setForceEncoding(true);
        registrationBean.setFilter(characterEncodingFilter);
        return registrationBean;
    }

//    @Bean
//    public MultipartConfigElement multipartConfigElement() {
//        MultipartConfigFactory factory = new MultipartConfigFactory();
//        factory.setMaxFileSize("128KB");
//        factory.setMaxRequestSize("128KB");
//        factory.setLocation("/usr/local/tomcat/webapps/upload");
//        return factory.createMultipartConfig();
//    }

//    @Bean
//    public FilterRegistrationBean securityFilterRegistrationBean() {
//        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
//        registrationBean.setFilter(securityFilter());
//        return registrationBean;
//    }
//
//    @Bean(name = "securityFilter")
//    public Filter securityFilter() {
//        return new SecurityFilter();
//    }


    public static void main( String[] args ) {
        SpringApplication.run(Application.class, args);
    }
}
