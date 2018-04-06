package com.example.yuki.android_kotlin01

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        outputLog()
        outputLogUsingNumerics()
        outputLogUsingBoolean()

    }

    /**
     * Char, Stringを使用して、ログ出力をする
     */
    private fun outputLog() {

        val char = 'A'
        println(char)

        for (char in "Kotlin") {
            println(char)
        }

        val string1 = "Hello, Kotlin"
        println(string1)

        val string2 = """
            初めての
            　Kotlin
            　　プロジェクト。
            """
        println(string2)

        val string3 = """
            |
            |初めての
            |Kotlin
            |プロジェクト。
            """.trimMargin()
        println(string3)

        val string4 = "text"
        println("string4: $string4 length: ${string4.length}")
    }

    /**
     * 基本的な数値型を使用して、ログ出力をする
     */
    private fun outputLogUsingNumerics() {

        // Double
        val doubleValue = 1234
        println("doubleValue: ${doubleValue}")

        // Double(浮動小数点数)
        val doubleValue2 = 123.4
        println("doubleValue2: $doubleValue2")

        // Long
        val longValue = 1234L
        println("longValue: $longValue")

        // Float
        val floatValue = 123.4f
        println("floatValue: $floatValue")

        // Int
        val intValue: Int = 10
        println("intValue: $intValue")
    }

    /**
     * Booleanを使用して、ログ出力をする
     */
    private fun outputLogUsingBoolean() {

        var isVisible = true

        if (isVisible) {
            println("isVisible: true")
        }

        isVisible = false

        if (!isVisible) {
            println("isVisible: false")
        }

        // 条件式に応じてresultTextに代入する値を決定する
        val resultText = if (isVisible) "isVisible: true" else "isVisible: false"
        println(resultText)
    }
}
