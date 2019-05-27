package com.example.tddalgorithm

import org.hamcrest.CoreMatchers
import org.junit.Assert
import org.junit.Test

class Fibonacci {
    @Test
    fun test() {
        Assert.assertThat(fibo(0), CoreMatchers.`is`(0))
        Assert.assertThat(fibo(1), CoreMatchers.`is`(1))
        Assert.assertThat(fibo(2), CoreMatchers.`is`(1))
        Assert.assertThat(fibo(3), CoreMatchers.`is`(2))
        Assert.assertThat(fibo(4), CoreMatchers.`is`(3))
        Assert.assertThat(fibo(5), CoreMatchers.`is`(5))
        Assert.assertThat(fibo(6), CoreMatchers.`is`(8))
        Assert.assertThat(fibo(7), CoreMatchers.`is`(13))
        Assert.assertThat(fibo(8), CoreMatchers.`is`(21))
        Assert.assertThat(fibo(9), CoreMatchers.`is`(34))
        Assert.assertThat(fibo(10), CoreMatchers.`is`(55))
        Assert.assertThat(fibo(20), CoreMatchers.`is`(6765))
        Assert.assertThat(fibo(30), CoreMatchers.`is`(832040))
    }

    private fun fibo(input: Int): Int {
        if(input >= 2)
            return fibo(input - 1) + fibo(input -2 )
        return input
    }
}