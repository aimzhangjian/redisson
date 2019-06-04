package com.aim.redisson.config;

import org.redisson.config.Config;
import org.redisson.config.TransportMode;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RedissonConfig {
    @Bean(name = "redissonConfig")
    public Config redissonConfig(){
        Config config = new Config();
        config.setTransportMode(TransportMode.EPOLL);
        config.useClusterServers()
                .addNodeAddress("redis://127.0.0.1:6379");
        return config;
    }

}
