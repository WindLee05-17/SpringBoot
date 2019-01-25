package com.rabbitmq.springboot_rabbitmq.rabbitmq.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName RabbitConfig
 * @Author Smith
 * @Date 2019/1/25 13:44
 * @Description Defining Queue
 * @Version 4.1
 */
@Configuration
public class RabbitConfig {
    @Bean
    public Queue Queue() {
        return new Queue("hello");
    }

}
