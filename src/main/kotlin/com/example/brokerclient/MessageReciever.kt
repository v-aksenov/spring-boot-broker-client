package com.example.brokerclient

import org.springframework.jms.annotation.JmsListener
import org.springframework.stereotype.Component


@Component
class MessageReceiver {

    @JmsListener(destination = "super.queue")
    fun receiveQueue(text: String) {
        println("Message Received: $text")
    }
}