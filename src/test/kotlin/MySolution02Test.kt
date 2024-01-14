import org.example.MySolution02
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class MySolution02Test {

    var solution = MySolution02()

    @BeforeEach
    fun setUp() {
        solution = MySolution02()
    }

    @Test
    fun findUsersWhoBadgeOften_ShouldSatisfyExample1() {
        // arrange
        val records = getTestData()
        val expected = mapOf(
            "Paul" to arrayOf("1315", "1355", "1405"),
            "Jose" to arrayOf("830", "835", "855", "915", "930"),
            "Zhang" to arrayOf("10", "109", "110"),
            "Amos" to arrayOf("500", "503", "504")
        )
        // act
        val actual = solution.findUsersWhoBadgeOften(records)
        // assert
        assertEquals(4, actual.size)
        assertArrayEquals(expected["Paul"], actual["Paul"])
        assertArrayEquals(expected["Jose"], actual["Jose"])
        assertArrayEquals(expected["Zhang"], actual["Zhang"])
        assertArrayEquals(expected["Amos"], actual["Amos"])
    }

    private fun getTestData(): Array<Array<String>> {
        val records = arrayOf(
            arrayOf("Paul", "1355"),
            arrayOf("Jennifer", "1910"),
            arrayOf("Jose", "835"),
            arrayOf("Jose", "830"),
            arrayOf("Paul", "1315"),
            arrayOf("Chloe", "0"),
            arrayOf("Chloe", "1910"),
            arrayOf("Jose", "1615"),
            arrayOf("Jose", "1640"),
            arrayOf("Paul", "1405"),
            arrayOf("Jose", "855"),
            arrayOf("Jose", "930"),
            arrayOf("Jose", "915"),
            arrayOf("Jose", "730"),
            arrayOf("Jose", "940"),
            arrayOf("Jennifer", "1335"),
            arrayOf("Jennifer", "730"),
            arrayOf("Jose", "1630"),
            arrayOf("Jennifer", "5"),
            arrayOf("Chloe", "1909"),
            arrayOf("Zhang", "1"),
            arrayOf("Zhang", "10"),
            arrayOf("Zhang", "109"),
            arrayOf("Zhang", "110"),
            arrayOf("Amos", "1"),
            arrayOf("Amos", "2"),
            arrayOf("Amos", "400"),
            arrayOf("Amos", "500"),
            arrayOf("Amos", "503"),
            arrayOf("Amos", "504"),
            arrayOf("Amos", "601"),
            arrayOf("Amos", "602"),
            arrayOf("Paul", "1416")
        )
        return records
    }
}
