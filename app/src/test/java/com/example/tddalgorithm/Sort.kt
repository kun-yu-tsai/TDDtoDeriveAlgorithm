package com.example.tddalgorithm

import org.hamcrest.CoreMatchers
import org.junit.Assert.assertThat
import org.junit.Test

class Sort {
    @Test
    fun test() {
        assertThat(input(arrayOf(1)), CoreMatchers.`is`(arrayOf(1)))

        assertThat(input(arrayOf(1, 2)), CoreMatchers.`is`(arrayOf(1, 2)))
        assertThat(input(arrayOf(2, 1)), CoreMatchers.`is`(arrayOf(1, 2)))

        assertThat("1", input(arrayOf(1, 2, 3)), CoreMatchers.`is`(arrayOf(1, 2, 3)))
        assertThat(input(arrayOf(1, 3, 2)), CoreMatchers.`is`(arrayOf(1, 2, 3)))
        assertThat(input(arrayOf(2, 1, 3)), CoreMatchers.`is`(arrayOf(1, 2, 3)))
        assertThat("3", input(arrayOf(3, 1, 2)), CoreMatchers.`is`(arrayOf(1, 2, 3)))
        assertThat("2", input(arrayOf(3, 2, 1)), CoreMatchers.`is`(arrayOf(1, 2, 3)))

        assertThat(input(arrayOf(1, 2, 3, 4)), CoreMatchers.`is`(arrayOf(1, 2, 3, 4)))
        assertThat(input(arrayOf(2, 1, 3, 4)), CoreMatchers.`is`(arrayOf(1, 2, 3, 4)))
        assertThat(input(arrayOf(1, 3, 2, 4)), CoreMatchers.`is`(arrayOf(1, 2, 3, 4)))
        assertThat(input(arrayOf(3, 1, 2, 4)), CoreMatchers.`is`(arrayOf(1, 2, 3, 4)))
        assertThat(input(arrayOf(3, 2, 1, 4)), CoreMatchers.`is`(arrayOf(1, 2, 3, 4)))

        assertThat(input(arrayOf(1, 2, 4, 3)), CoreMatchers.`is`(arrayOf(1, 2, 3, 4)))
        assertThat(input(arrayOf(1, 3, 4, 2)), CoreMatchers.`is`(arrayOf(1, 2, 3, 4)))

        assertThat(input(arrayOf(2, 1, 4, 3)), CoreMatchers.`is`(arrayOf(1, 2, 3, 4)))
        assertThat(input(arrayOf(2, 3, 4, 1)), CoreMatchers.`is`(arrayOf(1, 2, 3, 4)))

        assertThat(input(arrayOf(3, 1, 4, 2)), CoreMatchers.`is`(arrayOf(1, 2, 3, 4)))
        assertThat(input(arrayOf(3, 2, 4, 1)), CoreMatchers.`is`(arrayOf(1, 2, 3, 4)))


        assertThat(input(arrayOf(1, 4, 2, 3)), CoreMatchers.`is`(arrayOf(1, 2, 3, 4)))
        assertThat(input(arrayOf(1, 4, 3, 2)), CoreMatchers.`is`(arrayOf(1, 2, 3, 4)))

        assertThat(input(arrayOf(2, 4, 1, 3)), CoreMatchers.`is`(arrayOf(1, 2, 3, 4)))
        assertThat(input(arrayOf(2, 4, 3, 1)), CoreMatchers.`is`(arrayOf(1, 2, 3, 4)))

        assertThat(input(arrayOf(3, 4, 1, 2)), CoreMatchers.`is`(arrayOf(1, 2, 3, 4)))
        assertThat(input(arrayOf(3, 4, 2, 1)), CoreMatchers.`is`(arrayOf(1, 2, 3, 4)))

        assertThat(input(arrayOf(4, 1, 2, 3)), CoreMatchers.`is`(arrayOf(1, 2, 3, 4)))
        assertThat(input(arrayOf(4, 1, 3, 2)), CoreMatchers.`is`(arrayOf(1, 2, 3, 4)))

        assertThat(input(arrayOf(4, 2, 1, 3)), CoreMatchers.`is`(arrayOf(1, 2, 3, 4)))
        assertThat(input(arrayOf(4, 2, 3, 1)), CoreMatchers.`is`(arrayOf(1, 2, 3, 4)))

        assertThat(input(arrayOf(4, 3, 1, 2)), CoreMatchers.`is`(arrayOf(1, 2, 3, 4)))
        assertThat(input(arrayOf(4, 3, 2, 1)), CoreMatchers.`is`(arrayOf(1, 2, 3, 4)))

        assertThat(input(arrayOf(1, 2, 3, 4, 5)), CoreMatchers.`is`(arrayOf(1, 2, 3, 4, 5)))
        assertThat(input(arrayOf(2, 1, 3, 4, 5)), CoreMatchers.`is`(arrayOf(1, 2, 3, 4, 5)))
        assertThat(input(arrayOf(1, 3, 2, 4, 5)), CoreMatchers.`is`(arrayOf(1, 2, 3, 4, 5)))
        assertThat(input(arrayOf(1, 2, 4, 3, 5)), CoreMatchers.`is`(arrayOf(1, 2, 3, 4, 5)))
        assertThat(input(arrayOf(1, 4, 3, 2, 5)), CoreMatchers.`is`(arrayOf(1, 2, 3, 4, 5)))

        assertThat(input(arrayOf(1, 2, 3, 5, 4)), CoreMatchers.`is`(arrayOf(1, 2, 3, 4, 5)))
        assertThat(input(arrayOf(5, 2, 1, 4, 3)), CoreMatchers.`is`(arrayOf(1, 2, 3, 4, 5)))
        assertThat(input(arrayOf(2, 5, 3, 1, 4)), CoreMatchers.`is`(arrayOf(1, 2, 3, 4, 5)))
    }

    private fun input(array: Array<Int>): Array<Int>? {

//        if (array[0] > array[array.lastIndex])
//            swap(array, 0, array.lastIndex)

        if (array.size >= 2) {
            if (array[0] > array[1]) {
                swap(array, 0, 1)
            }
        }

        if (array.size >= 3) {
            if (array[1] > array[2]) {
                swap(array, 1, 2)
            }

            if (array[0] > array[1]) {
                swap(array, 0, 1)
            }
        }

        if (array.size >= 4) {
            if (array[2] > array[3]) {
                swap(array, 2, 3)
            }

            if (array[1] > array[2]) {
                swap(array, 1, 2)
            }

            if (array[0] > array[1]) {
                swap(array, 0, 1)
            }
        }
        if (array.size >= 5) {
            if (array[3] > array[4]) {
                swap(array, 3, 4)
            }

            if (array[2] > array[3]) {
                swap(array, 2, 3)
            }

            if (array[1] > array[2]) {
                swap(array, 1, 2)
            }

            if (array[0] > array[1]) {
                swap(array, 0, 1)
            }
        }

        return array
    }

    private fun swap(array: Array<Int>, a: Int, b: Int): Array<Int> {
        val temp = array[a]
        array[a] = array[b]
        array[b] = temp
        return array
    }

    @Test
    fun testSwap() {
        assertThat(swap(arrayOf(1, 2), 0, 1), CoreMatchers.`is`(arrayOf(2, 1)))
        assertThat(swap(arrayOf(1, 2, 3), 1, 2), CoreMatchers.`is`(arrayOf(1, 3, 2)))
    }
}