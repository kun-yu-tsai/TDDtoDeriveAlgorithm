package com.example.tddalgorithm

import org.hamcrest.CoreMatchers.`is`
import org.junit.Assert.assertThat
import org.junit.Test
import java.util.*

class Sort {
    @Test
    fun test() {
        assertThat(input(arrayOf(1)), `is`(arrayOf(1)))

        assertThat(input(arrayOf(1, 2)), `is`(arrayOf(1, 2)))
        assertThat(input(arrayOf(2, 1)), `is`(arrayOf(1, 2)))

        assertThat(input(arrayOf(1, 2, 3)), `is`(arrayOf(1, 2, 3)))
        assertThat(input(arrayOf(3, 2, 1)), `is`(arrayOf(1, 2, 3)))
        assertThat(input(arrayOf(2, 1, 3)), `is`(arrayOf(1, 2, 3)))
        assertThat(input(arrayOf(3, 1, 2)), `is`(arrayOf(1, 2, 3)))
        assertThat(input(arrayOf(1, 3, 2)), `is`(arrayOf(1, 2, 3)))
        assertThat(input(arrayOf(3, 2, 1)), `is`(arrayOf(1, 2, 3)))

        assertThat(input(arrayOf(1, 2, 3, 4)), `is`(arrayOf(1, 2, 3, 4)))
        assertThat(input(arrayOf(2, 1, 3, 4)), `is`(arrayOf(1, 2, 3, 4)))
        assertThat(input(arrayOf(1, 3, 2, 4)), `is`(arrayOf(1, 2, 3, 4)))
        assertThat(input(arrayOf(3, 1, 2, 4)), `is`(arrayOf(1, 2, 3, 4)))
        assertThat(input(arrayOf(3, 2, 1, 4)), `is`(arrayOf(1, 2, 3, 4)))

        assertThat(input(arrayOf(1, 2, 4, 3)), `is`(arrayOf(1, 2, 3, 4)))
        assertThat(input(arrayOf(1, 3, 4, 2)), `is`(arrayOf(1, 2, 3, 4)))

        assertThat(input(arrayOf(2, 1, 4, 3)), `is`(arrayOf(1, 2, 3, 4)))
        assertThat(input(arrayOf(2, 3, 4, 1)), `is`(arrayOf(1, 2, 3, 4)))

        assertThat(input(arrayOf(3, 1, 4, 2)), `is`(arrayOf(1, 2, 3, 4)))
        assertThat(input(arrayOf(3, 2, 4, 1)), `is`(arrayOf(1, 2, 3, 4)))


        assertThat(input(arrayOf(1, 4, 2, 3)), `is`(arrayOf(1, 2, 3, 4)))
        assertThat(input(arrayOf(1, 4, 3, 2)), `is`(arrayOf(1, 2, 3, 4)))

        assertThat(input(arrayOf(2, 4, 1, 3)), `is`(arrayOf(1, 2, 3, 4)))
        assertThat(input(arrayOf(2, 4, 3, 1)), `is`(arrayOf(1, 2, 3, 4)))

        assertThat(input(arrayOf(3, 4, 1, 2)), `is`(arrayOf(1, 2, 3, 4)))
        assertThat(input(arrayOf(3, 4, 2, 1)), `is`(arrayOf(1, 2, 3, 4)))

        assertThat(input(arrayOf(4, 1, 2, 3)), `is`(arrayOf(1, 2, 3, 4)))
        assertThat(input(arrayOf(4, 1, 3, 2)), `is`(arrayOf(1, 2, 3, 4)))

        assertThat(input(arrayOf(4, 2, 1, 3)), `is`(arrayOf(1, 2, 3, 4)))
        assertThat(input(arrayOf(4, 2, 3, 1)), `is`(arrayOf(1, 2, 3, 4)))

        assertThat(input(arrayOf(4, 3, 1, 2)), `is`(arrayOf(1, 2, 3, 4)))
        assertThat(input(arrayOf(4, 3, 2, 1)), `is`(arrayOf(1, 2, 3, 4)))

        assertThat(input(arrayOf(1, 2, 3, 4, 5)), `is`(arrayOf(1, 2, 3, 4, 5)))
        assertThat(input(arrayOf(2, 1, 3, 4, 5)), `is`(arrayOf(1, 2, 3, 4, 5)))
        assertThat(input(arrayOf(1, 3, 2, 4, 5)), `is`(arrayOf(1, 2, 3, 4, 5)))
        assertThat(input(arrayOf(1, 2, 4, 3, 5)), `is`(arrayOf(1, 2, 3, 4, 5)))
        assertThat(input(arrayOf(1, 4, 3, 2, 5)), `is`(arrayOf(1, 2, 3, 4, 5)))

        assertThat(input(arrayOf(1, 2, 3, 5, 4)), `is`(arrayOf(1, 2, 3, 4, 5)))
        assertThat(input(arrayOf(5, 2, 1, 4, 3)), `is`(arrayOf(1, 2, 3, 4, 5)))
        assertThat(input(arrayOf(2, 5, 3, 1, 4)), `is`(arrayOf(1, 2, 3, 4, 5)))

        assertThat(
            input(arrayOf(45, 12, 85, 32, 89, 39, 69, 44, 42, 1, 6, 8)),
            `is`(arrayOf(1, 6, 8, 12, 32, 39, 42, 44, 45, 69, 85, 89))
        )
    }

    private fun quickSort(array: Array<Int>){
        quickSortSpecificPart(array, 0 , array.lastIndex)
    }

    private fun quickSortSpecificPart(array: Array<Int>, startingFrom: Int, pivot: Int) {
        var processingIndex2 = startingFrom
        var nextAllocationIndex2 = startingFrom

        while (processingIndex2 < pivot) {
            if (array[processingIndex2] < array[pivot]) {
                swap(array, processingIndex2, nextAllocationIndex2)
                nextAllocationIndex2++
            }
            processingIndex2++
        }

        swap(array, pivot, nextAllocationIndex2)

        if (nextAllocationIndex2 + 1 < pivot) {
            quickSortSpecificPart(array, nextAllocationIndex2 + 1, pivot)
        }

        if(nextAllocationIndex2 - 1 > startingFrom) {
            quickSortSpecificPart(array, startingFrom, nextAllocationIndex2 - 1)
        }
    }

    private fun input(array: Array<Int>): Array<Int>? {
        quickSort(array)

        return array
    }

    private fun anotherSort(array: Array<Int>) {
        var movingForwardCursor = 0

        while (movingForwardCursor < array.lastIndex) {
            var movingBackWardCursor = array.lastIndex
            while (movingBackWardCursor != movingForwardCursor) {
                if (array[movingForwardCursor] > array[movingBackWardCursor])
                    swap(array, movingForwardCursor, movingBackWardCursor)
                movingBackWardCursor--
            }
            movingForwardCursor++
        }
    }

    private fun bubbleSort(array: Array<Int>) {
        var anchorKeepMovingToFinalIndex = 1
        while (anchorKeepMovingToFinalIndex <= array.lastIndex) {
            var anchorSwapWithPreviousPosition = anchorKeepMovingToFinalIndex
            while (anchorSwapWithPreviousPosition >= 1 && array[anchorSwapWithPreviousPosition] < array[anchorSwapWithPreviousPosition - 1]) {
                swap(array, anchorSwapWithPreviousPosition, anchorSwapWithPreviousPosition - 1)
                anchorSwapWithPreviousPosition--
            }
            anchorKeepMovingToFinalIndex++
        }
    }

    private fun swap(array: Array<Int>, a: Int, b: Int): Array<Int> {
        val temp = array[a]
        array[a] = array[b]
        array[b] = temp
        return array
    }

    @Test
    fun testSwap() {
        assertThat(swap(arrayOf(1, 2), 0, 1), `is`(arrayOf(2, 1)))
        assertThat(swap(arrayOf(1, 2, 3), 1, 2), `is`(arrayOf(1, 3, 2)))
    }
}