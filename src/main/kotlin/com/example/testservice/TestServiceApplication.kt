package com.example.testservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class TestServiceApplication

fun main(args: Array<String>) {
    runApplication<TestServiceApplication>(*args)
}

@RestController
@RequestMapping("api/v1")
class TestServiceController {

    @GetMapping
    fun hello(): String = "Hello"
}
