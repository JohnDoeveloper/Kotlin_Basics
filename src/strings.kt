fun main() {

    val stringOne: String = "This one does not have a twin"
    val stringTwo: String = "This one does have a twin"
    val stringThree: String = "This one does have a twin"


    //length
    println("\n.length:" +
            "\nLength of stringOne is: ${stringOne.length}")

    //==
    println("\n.equals:" +
            "\nCase of uneqivalency: ${stringOne==stringTwo}" +
            "\nCase of uneqivalency: ${stringTwo==stringThree}")

    //equals
    println("\n.equals:" +
            "\nCase of uneqivalency: ${stringOne.equals(stringTwo)}" +
            "\nCase of uneqivalency: ${stringTwo.equals(stringThree)}")

    //comparesTo
    println("\n.compareTo:\nCase of uneqivalency: ${stringOne.compareTo(stringTwo)}" +
            "\nCase of uneqivalency: ${stringTwo.compareTo(stringThree)}")

    //.get(index) to get a character at a certain index
    println("\nCharacter at the 2nd index of string one is: ${stringOne.get(2)}" )

    //string[index] to get a character at a certain index
    println("\nCharacter at the 2nd index of string one is: ${stringOne[2]}" )

    //.subSequence(i , k) to print a substring
    println("\nThe substring of stringOne from index 5 to index 8 is: ${stringOne.subSequence(5 , 8)}" +
            "\nIt includes characters at indexes 5, 6 and 7 but not 8")

    //.contains(string) to se if given string contains another string
    println("\nDoes contain: ${stringOne.contains("one")}" +
            "\nDoes not contain: ${stringOne.contains("universe")}")
}