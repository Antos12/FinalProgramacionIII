package com.ecommerce.Ecommerce;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ResourceWebConfiguration implements WebMvcConfigurer{

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/C:/Users/Sofy/Desktop/Nueva carpeta (2)/FinalProgramacionIII/Ecommerce/Ecommerce/images/**").addResourceLocations("file:C:/Users/Sofy/Desktop/Nueva carpeta (2)/FinalProgramacionIII/Ecommerce/Ecommerce/images/");
    }
}