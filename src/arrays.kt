import java.util.Arrays

fun main() {

    var arrayOneDimensional = arrayOf(0 , 2, 3)


    //changing or returning elements

        arrayOneDimensional[0] = 1
            println("\nFirst element is ${arrayOneDimensional[0]}")

    // fill array with elements that are result of a function

    var functionElementArray: Array<Int> =  Array(5, {x -> x * x})

    //.size

        println("\n.size" +
                "\nSize of arrazOneDimensional is: ${arrayOneDimensional.size}")

    //.contains()

        println("\n.contains():" +
                "\n\tTrue: ${arrayOneDimensional.contains(2)}" +
                "\n\tFalse: ${arrayOneDimensional.contains(4)}")

    //.copyOfRange() [Extracting a specific part of the array's range]

        val copyOfRangearrayOneDimensional = arrayOneDimensional.copyOfRange(0,1)

        println("\n.copyOfRange" +
                "\n\tCopy of range is: ${Arrays.toString(arrayOneDimensional)}")



}