package com.example.tddalgorithm

import org.hamcrest.CoreMatchers.`is`
import org.junit.Assert.assertThat
import org.junit.Test

class ReverseRomanTest {
    @Test
    fun test() {
        assertThat(input("I"), `is`(1))
        assertThat(input("II"), `is`(2))
        assertThat(input("III"), `is`(3))
        assertThat(input("IV"), `is`(4))
        assertThat(input("V"), `is`(5))
        assertThat(input("VI"), `is`(6))
        assertThat(input("VII"), `is`(7))
        assertThat(input("IX"), `is`(9))
        assertThat(input("X"), `is`(10))
        assertThat(input("XIV"), `is`(14))
        assertThat(input("XV"), `is`(15))
        assertThat(input("XVI"), `is`(16))
        assertThat(input("XIX"), `is`(19))
        assertThat(input("XX"), `is`(20))
        assertThat(input("XXI"), `is`(21))
        assertThat(input("XXIV"), `is`(24))
        assertThat(input("XXV"), `is`(25))
        assertThat(input("XXIX"), `is`(29))
        assertThat(input("XL"), `is`(40))
        assertThat(input("XLI"), `is`(41))
        assertThat(input("XLV"), `is`(45))
        assertThat(input("XLIX"), `is`(49))
        assertThat(input("L"), `is`(50))
        assertThat(input("LI"), `is`(51))
        assertThat(input("LV"), `is`(55))
        assertThat(input("LX"), `is`(60))
        assertThat(input("XC"), `is`(90))
        assertThat(input("XCIX"), `is`(99))
        assertThat(input("C"), `is`(100))
        assertThat(input("CD"), `is`(400))
        assertThat(input("D"), `is`(500))
        assertThat(input("CM"), `is`(900))
        assertThat(input("M"), `is`(1000))
        assertThat(input("MCMIII"), `is`(1903))
        assertThat(input("MCMXCIX"), `is`(1999))
        assertThat(input("MMDCLXXXIX"), `is`(2689))
    }

    private fun input(romanStr: String): Int? {
        var number = 0
        val remainder = StringBuilder(romanStr)

        val romans = arrayOf('I','V','X','L','C','D','M')
        val digitalNumbers = arrayOf(1,5,10,50,100,500,1000)

        val map = mutableMapOf<Char, Int>()

        for( index in romans.indices){
            map[romans[index]] = digitalNumbers[index]

            while (remainder.isNotEmpty()) {
                if (remainder.last() == romans[index]){
                    remainder.deleteCharAt(remainder.lastIndex)
                    number += digitalNumbers[index]
                    continue
                }

                if(map.containsKey(remainder.last())){
                    number -= map[remainder.last()]!!
                    remainder.deleteCharAt(remainder.lastIndex)
                    continue
                }

                break
            }
        }

        return number
    }
}