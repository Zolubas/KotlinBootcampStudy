fun main(){

        //Null values

            //In kotlin we can create variables that can be null. However we must to create these variables
            //as nullable type. By default the varible types are non-nullable. The way to creat nullable variables
            // is adding "?" in the final. For example:
    val x0: Int = 3 //non-nullable Integer
    val x: Int? = null //nullable Integer

        //An application of potential null values
            //In the following programme a user inputs two numbers. The programme returns the sum of these to numbers
            //But the user can accidentally provides a null number. Using the ?: "<>" codification the programme can
            //handle this situation assuming that an empty input is equal to a zero input.

        val number1 = readLine() ?: "0"
        val number2 = readLine() ?: "0"
        val result = number1.toInt() + number2.toInt()
        println(result)
}
