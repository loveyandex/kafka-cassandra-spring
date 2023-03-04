package com.kcs.kafkacassandraspring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.datastax.oss.driver.api.core.CqlSession;

@Configuration
public class CassConfig {
      
      public @Bean CqlSession session() {
            return CqlSession.builder().withKeyspace("ecom").build();
         }
}
