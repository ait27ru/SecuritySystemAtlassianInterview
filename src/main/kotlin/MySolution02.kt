package org.example

/*
* We are working on a security system for a badged-access room in our company’s building.
* We want to find employees who badged into our secured room unusually often.
* We have an unordered list of names and entry times over a single day.
* Access times are given as numbers up to four digits in length using 24-hour time, such as “800” or “2250”.
* Write a function that finds anyone who badged into the room three or more times in a one-hour period.
* Your function should return each of the employees who fit that criteria, plus the times that they badged in during the one-hour period.
* If there are multiple one-hour periods where this was true for an employee, just return the earliest one for that employee.
*
* */

class MySolution02 {
    fun findUsersWhoBadgeOften(records: Array<Array<String>>): Map<String, Array<String>> {
        val map = mutableMapOf<String, Array<String>>()
        return map
    }
}