package com.example.spring_boot_hello_word

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringBootHelloWordApplication

fun main(args: Array<String>) {
    runApplication<SpringBootHelloWordApplication>(*args)
}
