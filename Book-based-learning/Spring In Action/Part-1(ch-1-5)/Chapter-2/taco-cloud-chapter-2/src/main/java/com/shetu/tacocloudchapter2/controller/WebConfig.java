package com.shetu.tacocloudchapter2.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
 /*
 * In case when there is no custom controller logic,
 * we can use addViewControllers() method in our JavaConfig
 * that will map URLs to views and hence there is no need to create
  * actual controller class. We need to pre-define URLs and their
  * mapping views with HTTP status code using ViewControllerRegistry class
  * within addViewControllers() method in our JavaConfig
 * */

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("home");
    }
}
