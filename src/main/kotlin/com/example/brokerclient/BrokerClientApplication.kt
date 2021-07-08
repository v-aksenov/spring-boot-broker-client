package com.example.brokerclient

import org.apache.activemq.command.ActiveMQQueue
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.jms.annotation.EnableJms
import org.springframework.scheduling.annotation.EnableScheduling
import javax.jms.Queue

@EnableScheduling
@EnableJms
@SpringBootApplication
class BrokerClientApplication {

    @Bean
    fun queue(): Queue {
        return ActiveMQQueue("super.queue")
    }
}

fun main(args: Array<String>) {
    runApplication<BrokerClientApplication>(*args)
}
