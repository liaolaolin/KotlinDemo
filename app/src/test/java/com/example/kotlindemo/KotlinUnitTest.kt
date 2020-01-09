package com.example.kotlindemo

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class KotlinUnitTest {

    val TAG = "KotlinUnitTest"

    fun print(s: Any) {
        println(TAG + ": " + s)
    }

    @Test
    fun testCoroutine() {
        print(0)
        runBlocking {
            print(1)

            suspend fun f(): String {
                delay(1000)
                print(2)
                return "content"
            }
            val content = f()
            print(3)
            assertEquals(content, "content")

        }
    }

}
