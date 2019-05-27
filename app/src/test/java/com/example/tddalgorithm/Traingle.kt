package com.example.tddalgorithm

import org.hamcrest.CoreMatchers
import org.junit.Assert
import org.junit.Test

class Traingle {
    @Test
    fun test(){
        Assert.assertThat(isItTriangle(2,2,2), CoreMatchers.`is`(true))
    }

    private fun isItTriangle(a: Int, b: Int, c: Int): Boolean? {
        return true
    }
}