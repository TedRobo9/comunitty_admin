package com.uacity.admin.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by Administrator on 2016/6/21 0021.
 */
@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.uacity.admin.domain"})
@EnableJpaRepositories(basePackages = {"com.uacity.admin.dao"})
@EnableTransactionManagement
public class RepositoryConfig {
}
