import org.example.MySolution01
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class MySolution01Test {

    var solution = MySolution01()

    @BeforeEach
    fun setUp() {
        solution = MySolution01()
    }

    @Test
    fun handleRecords_ShouldSatisfyExample1() {
        // arrange
        val expectedList1 = listOf("Paul", "Joe", "Steve", "Curtis")
        val expectedList2 = listOf("Pauline", "Martha", "Curtis", "Joe")
        // act
        val actual = solution.findNonMatchingRecords(TestData.records1)
        // assert
        assertIterableEquals(expectedList1, actual.first)
        assertIterableEquals(expectedList2, actual.second)
    }

    @Test
    fun handleRecords_ShouldSatisfyExample2() {
        // arrange
        val expectedList1 = emptyList<String>()
        val expectedList2 = emptyList<String>()
        // act
        val actual = solution.findNonMatchingRecords(TestData.records2)
        // assert
        assertIterableEquals(expectedList1, actual.first)
        assertIterableEquals(expectedList2, actual.second)
    }

    @Test
    fun handleRecords_ShouldSatisfyExample3() {
        // arrange
        val expectedList1 = listOf("Paul")
        val expectedList2 = listOf("Paul")
        // act
        val actual = solution.findNonMatchingRecords(TestData.records3)
        // assert
        assertIterableEquals(expectedList1, actual.first)
        assertIterableEquals(expectedList2, actual.second)
    }

    @Test
    fun handleRecords_ShouldSatisfyExample4() {
        // arrange
        val expectedList1 = listOf("Raj", "Paul")
        val expectedList2 = listOf("Paul")
        // act
        val actual = solution.findNonMatchingRecords(TestData.records4)
        // assert
        assertIterableEquals(expectedList1, actual.first)
        assertIterableEquals(expectedList2, actual.second)
    }
}

class TestData {
    companion object {
        val records1 = arrayOf(
            arrayOf("Paul", "enter"),
            arrayOf("Pauline", "exit"),
            arrayOf("Paul", "enter"),
            arrayOf("Paul", "exit"),
            arrayOf("Martha", "exit"),
            arrayOf("Joe", "enter"),
            arrayOf("Martha", "enter"),
            arrayOf("Steve", "enter"),
            arrayOf("Martha", "exit"),
            arrayOf("Jennifer", "enter"),
            arrayOf("Joe", "enter"),
            arrayOf("Curtis", "exit"),
            arrayOf("Curtis", "enter"),
            arrayOf("Joe", "exit"),
            arrayOf("Martha", "enter"),
            arrayOf("Martha", "exit"),
            arrayOf("Jennifer", "exit"),
            arrayOf("Joe", "enter"),
            arrayOf("Joe", "enter"),
            arrayOf("Martha", "exit"),
            arrayOf("Joe", "exit"),
            arrayOf("Joe", "exit")
        )

        val records2 = arrayOf(
            arrayOf("Paul", "enter"),
            arrayOf("Paul", "exit")
        )

        val records3 = arrayOf(
            arrayOf("Paul", "enter"),
            arrayOf("Paul", "enter"),
            arrayOf("Paul", "exit"),
            arrayOf("Paul", "exit")
        )

        val records4 = arrayOf(
            arrayOf("Raj", "enter"),
            arrayOf("Paul", "enter"),
            arrayOf("Paul", "exit"),
            arrayOf("Paul", "exit"),
            arrayOf("Paul", "enter"),
            arrayOf("Raj", "enter")
        )
    }
}