/*
 * RWA CONFIDENTIAL INFORMATION
 *
 *
 * Copyright (c) 2019 RWA LLC
 *
 * All Rights Reserved.  Unauthorized reproduction, transmission, or
 * distribution of this software is a violation of applicable laws.
 *
 *
 */
package com.rwa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.velocity.VelocityAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@ComponentScan(basePackages={"com.rwa"})
@EnableAutoConfiguration(exclude = {SecurityAutoConfiguration.class,VelocityAutoConfiguration.class})
@ImportResource({"classpath:spring/*-context.xml"})
public class RwaApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(RwaApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ParconApplication.class);
    }
}
