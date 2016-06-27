package com.uacity.admin.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Ted on 16/4/23.
 */

@Configuration
@EnableConfigurationProperties({ JdbcConnectionSettings.class })
public class ApplicationConfigurations {
}
