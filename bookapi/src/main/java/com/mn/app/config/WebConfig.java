package com.mn.app.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author Md Nazish
 *
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "com.mn.app.controller" })
public class WebConfig extends WebMvcConfigurerAdapter {

}
