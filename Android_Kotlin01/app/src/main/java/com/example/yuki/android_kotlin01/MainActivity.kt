package com.example.yuki.android_kotlin01

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

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
        Log.d("outputLog", "$char")

        for (char in "Kotlin") {
            Log.d("outputLog", "$char")
        }

        val string1 = "Hello, Kotlin"
        Log.d("outputLog", "$string1")

        val string2 = """
            初めての
            　Kotlin
            　　プロジェクト。
            """
        Log.d("outputLog", "$string2")

        val string3 = """
            |
            |初めての
            |Kotlin
            |プロジェクト。
            """.trimMargin()
        Log.d("outputLog", "$string3")

        val string4 = "text"
        Log.d("outputLog", "string4: $string4 length: ${string4.length}")
    }

    /**
     * 基本的な数値型を使用して、ログ出力をする
     */
    private fun outputLogUsingNumerics() {

        // Double
        val doubleValue = 1234
        Log.d("outputLogUsingNumerics", "doubleValue: ${doubleValue}")

        // Double(浮動小数点数)
        val doubleValue2 = 123.4
        Log.d("outputLogUsingNumerics", "doubleValue2: $doubleValue2")


        // Long
        val longValue = 1234L
        Log.d("outputLogUsingNumerics", "longValue: $longValue")

        // Float
        val floatValue = 123.4f
        Log.d("outputLogUsingNumerics", "floatValue: $floatValue")

        // Int
        val intValue: Int = 10
        Log.d("outputLogUsingNumerics", "intValue: $intValue")
    }

    /**
     * Booleanを使用して、ログ出力をする
     */
    private fun outputLogUsingBoolean() {

        var isVisible = true

        if (isVisible) {
            Log.d("outputLogUsingBoolean", "isVisible: true")
        }

        isVisible = false

        if (!isVisible) {
            Log.d("outputLogUsingBoolean", "isVisible: false")
        }

        // 条件式に応じてresultTextに代入する値を決定する
        val resultText = if (isVisible) "isVisible: true" else "isVisible: false"
        Log.d("outputLogUsingBoolean", "$resultText")
    }
}
