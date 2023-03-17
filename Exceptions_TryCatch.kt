fun main() {

    //Exceptions
        //Exceptions are events that occur before or when our program actually craches
        //Solution: Try and Catch blocks

        //Without Exceptions Treatment
    println("Digit a positive number:")
    val numberPositive0 = readLine() ?: "0"  //it ask for a user to give a numnber.
    numberPositive0.toInt()                  // If the awnser is null than "zero" is used. But the user puts "%" or "Hello" as an awnser.
                                    //Then the program brakes trying to convert it to Integer and an exception occurs

        //With Exceptions Treatment
    println("Digit a positive number:")
    val numberPositive = readLine() ?: "0"
    val parsedNumber = try {
        numberPositive.toInt()
    } catch (e: Exception){
        -1
    }

    if(parsedNumber == -1){
        println("You provide an invalid number")
    } else {
        println(parsedNumber)
    }
}
