package com.south.oly.mock.dao;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.EntityManagerFactory;

@Configurable
@EnableJpaRepositories(basePackages = "com.south.olu.mock.dao")
public class JpaConfiguration {
    @Bean
    public EntityManagerFactory entityManagerFactory() {
        return null;
    }
}
