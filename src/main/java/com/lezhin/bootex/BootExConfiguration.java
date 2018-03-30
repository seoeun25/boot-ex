package com.lezhin.bootex;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @author seoeun
 * @since 2018.03.30
 */
@Configuration
public class BootExConfiguration {

    private @Value("${spring.datasource.url}")
    String datasourceUrl;
    private @Value("${spring.datasource.username}")
    String datasourceUsername;
    private @Value("${spring.datasource.password}")
    String datasourcePassword;
    private @Value("${spring.datasource.driver-class-name}")
    String datasourceDriver;


}
