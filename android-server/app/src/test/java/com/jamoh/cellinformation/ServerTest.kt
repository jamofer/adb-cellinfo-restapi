package com.jamoh.cellinformation

import io.kotlintest.TestCase
import io.kotlintest.TestResult
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec


class ServerTest : StringSpec() {

    override fun beforeTest(testCase: TestCase) {
        println("Starting test")
    }

    override fun afterTest(testCase: TestCase, result: TestResult) {
        super.afterTest(testCase, result)
        println("Ending test")
    }

    init {
        "it does nothing" {
            2 shouldBe 2
        }
    }
}
