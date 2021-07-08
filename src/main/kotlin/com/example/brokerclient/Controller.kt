package com.example.brokerclient

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller(private val messageSender: MessageSender) {

    @PostMapping("/")
    fun send(@RequestBody message: String) = messageSender.send(message)
}