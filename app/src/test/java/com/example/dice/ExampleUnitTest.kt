package com.example.dice

import org.junit.Test

import org.junit.Assert.*
import org.junit.Assert.assertTrue

class ExampleUnitTest {
    @Test
    fun generates_number(){
        //arrange
        val dice = Dice(6)
        //act
        val rollResult = dice.roll()
        //assert
        assertTrue("The value of rollResult was not between 1 and 6",rollResult in 1..6)
    }
}