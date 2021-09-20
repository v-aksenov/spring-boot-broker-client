package com.example.brokerclient

import org.springframework.jms.core.JmsMessagingTemplate
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component
import java.time.Instant
import javax.jms.Queue

@Component
class MessageSender(
    private val jmsMessagingTemplate: JmsMessagingTemplate,
    private val queue: Queue
) {

    @Scheduled(cron = "* * * * * *")
    fun schedule() {
        send(Instant.now().toString())
        println("sending...")
    }

    fun send(message: String) {
        jmsMessagingTemplate.convertAndSend(queue, message)
    }
}