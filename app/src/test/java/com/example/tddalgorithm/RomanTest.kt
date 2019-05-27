package com.example.tddalgorithm

import org.hamcrest.CoreMatchers
import org.junit.Assert
import org.junit.Assert.*
import org.junit.Test
import java.lang.StringBuilder

class RomanTest {
    @Test
    fun test() {
        assertThat(roman(1), CoreMatchers.`is`("I"))
        assertThat(roman(2), CoreMatchers.`is`("II"))
        assertThat(roman(3), CoreMatchers.`is`("III"))
        assertThat(roman(4), CoreMatchers.`is`("IV"))
        assertThat(roman(5), CoreMatchers.`is`("V"))
        assertThat(roman(6), CoreMatchers.`is`("VI"))
        assertThat(roman(7), CoreMatchers.`is`("VII"))
        assertThat(roman(8), CoreMatchers.`is`("VIII"))
        assertThat(roman(9), CoreMatchers.`is`("IX"))
        assertThat(roman(10), CoreMatchers.`is`("X"))
        assertThat(roman(11), CoreMatchers.`is`("XI"))
        assertThat(roman(13), CoreMatchers.`is`("XIII"))
        assertThat(roman(14), CoreMatchers.`is`("XIV"))
        assertThat(roman(15), CoreMatchers.`is`("XV"))
        assertThat(roman(16), CoreMatchers.`is`("XVI"))
        assertThat(roman(17), CoreMatchers.`is`("XVII"))
        assertThat(roman(19), CoreMatchers.`is`("XIX"))
        assertThat(roman(20), CoreMatchers.`is`("XX"))
        assertThat(roman(21), CoreMatchers.`is`("XXI"))
        assertThat(roman(22), CoreMatchers.`is`("XXII"))
        assertThat(roman(24), CoreMatchers.`is`("XXIV"))
        assertThat(roman(25), CoreMatchers.`is`("XXV"))
        assertThat(roman(29), CoreMatchers.`is`("XXIX"))
        assertThat(roman(30), CoreMatchers.`is`("XXX"))
        assertThat(roman(40), CoreMatchers.`is`("XL"))
        assertThat(roman(41), CoreMatchers.`is`("XLI"))
        assertThat(roman(45), CoreMatchers.`is`("XLV"))
        assertThat(roman(49), CoreMatchers.`is`("XLIX"))
        assertThat(roman(50), CoreMatchers.`is`("L"))
        assertThat(roman(51), CoreMatchers.`is`("LI"))
        assertThat(roman(55), CoreMatchers.`is`("LV"))
        assertThat(roman(60), CoreMatchers.`is`("LX"))
        assertThat(roman(90), CoreMatchers.`is`("XC"))
        assertThat(roman(99), CoreMatchers.`is`("XCIX"))
        assertThat(roman(100), CoreMatchers.`is`("C"))
        assertThat(roman(115), CoreMatchers.`is`("CXV"))
        assertThat(roman(140), CoreMatchers.`is`("CXL"))
        assertThat(roman(195), CoreMatchers.`is`("CXCV"))
        assertThat(roman(200), CoreMatchers.`is`("CC"))
        assertThat(roman(500), CoreMatchers.`is`("D"))
        assertThat(roman(400), CoreMatchers.`is`("CD"))
        assertThat(roman(900), CoreMatchers.`is`("CM"))
        assertThat(roman(1000), CoreMatchers.`is`("M"))
        assertThat(roman(1903), CoreMatchers.`is`("MCMIII"))
        assertThat(roman(1999), CoreMatchers.`is`("MCMXCIX"))
        assertThat(roman(2000), CoreMatchers.`is`("MM"))
    }

    private fun roman(i: Int): String? {
        var remainder = i
        val string = StringBuilder()

        val digitalNumbers = arrayOf(1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1)
        val romanStrings = arrayOf("M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I")

        for ( index in digitalNumbers.indices){
            while(remainder >= digitalNumbers[index]){
                string.append(romanStrings[index])
                remainder -= digitalNumbers[index]
            }
        }

        return string.toString()
    }
}