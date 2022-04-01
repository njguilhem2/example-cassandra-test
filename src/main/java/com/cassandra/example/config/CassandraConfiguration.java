package com.cassandra.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.config.CqlSessionFactoryBean;


@Configuration
public class CassandraConfiguration {

    @Bean
    public CqlSessionFactoryBean session() {
        CqlSessionFactoryBean session = new CqlSessionFactoryBean();
        session.setContactPoints("localhost");
        session.setKeyspaceName("testKeySpace");
        session.setPort(9042);
        session.setLocalDatacenter("datacenter1");
        return session;
    }
}
