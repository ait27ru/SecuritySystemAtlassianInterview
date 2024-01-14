package org.example

/*
* We are working on a security system for a badged-access room in our company's building.
* Given an ordered list of employees who used their badge to enter or exit the room, write a function that returns two collections:
* 1. All employees who didn't use their badge while exiting the room - they recorded an enter without a matching exit.
*    (All employees are required to leave the room before the log ends.)
* 2. All employees who didn't use their badge while entering the room - they recorded an exit without a matching enter.
*    (The room is empty when the log begins.)
* Each collection should contain no duplicates, regardless of how many times a given employee matches the criteria for belonging to it.
*
* * */
class MySolution01 {
    fun findNonMatchingRecords(records: Array<Array<String>>): Pair<List<String>, List<String>> {

        val listOfMissingExits = mutableListOf<String>()
        val listOfMissingEntries = mutableListOf<String>()

        val map = mutableMapOf<String, String>()

        records.forEach {

            val name = it[0]
            val event = it[1]

            val currMap = map[name]

            if (event == "enter") {
                if (currMap != null && currMap != "exit") {
                    // Non-matching entry
                    if (!listOfMissingExits.contains(name)) {
                        listOfMissingExits.add(name)
                    }
                }
                // Indicate last event was an "enter"
                map[name] = "enter"
            } else {
                if (currMap == null || currMap != "enter") {
                    // Non-matching exit
                    if (!listOfMissingEntries.contains(name)) {
                        listOfMissingEntries.add(name)
                    }
                }
                map[name] = "exit"
            }
        }

        // let's catch those who entered and never exited, thus left map entries hanging with 1
        map.forEach { (name, value) ->
            if (value == "enter") {
                if (!listOfMissingExits.contains(name)) {
                    listOfMissingExits.add(name)
                }
            }
        }

        return Pair(listOfMissingExits, listOfMissingEntries)
    }
}