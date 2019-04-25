import java.util.*

fun main() {

    // ranges

        // numeric ascending
            val numericRangeAscending = 1..10
                var numericRangeAscendingRangeTo = 1.rangeTo(10)

        // alphabetical ascending
            val alphabeticalRangeAscending = 'A'..'Z'

        // numeric descending
            val numericRangeDescending = 10.downTo(1)

        // alphabetical descending
            val alphabeticalRangeDescending = 'Z'.downTo('A')

        // stepping a range (returns the same range but now with a stepped progression)
            val steppedRange = numericRangeAscending.step(5)

        // reversing a range
            val reversedRange = numericRangeAscending.reversed()


          println("\nRanges within arrays:" +
                    "\n\tNumeric ascending: $numericRangeAscending" +
                    "\n\tAlphabetical ascending: $alphabeticalRangeAscending" +
                    "\n\tNumeric descending: $numericRangeDescending  " +
                    "\n\tAlphabetical descending: $alphabeticalRangeDescending" +
                    "\n\tStepped range: $steppedRange" +
                    "\n\tReversed range: $reversedRange" +
                    "\n\tChecking if element is in the range, true: ${1 in numericRangeAscendingRangeTo}" +
                    " \n\ttChecking if element is in the range, false: ${12 in numericRangeAscendingRangeTo}\" " +
                    "\n\n")


        // printing out a range and all of it's elements in it's entirety
             for( x in steppedRange) print("$x ")

}