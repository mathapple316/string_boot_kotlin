package com.test.apple

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AppleApplication

// 시작점 함수
fun main(args: Array<String>) {
	runApplication<AppleApplication>(*args)
}
