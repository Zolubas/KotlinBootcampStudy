fun main(){

        //Classical begining
    println("Hello World!")


        //Creating a changeable variable
    var x: Int = 3 //it's an Integer: 32-bit number
    println("The value of x is $x")
    x = 4
    println("The value of x is now $x")


        //Creating a non-changeable variable (i.e, a constant)
            //Explicit way
    val c: Int = 6
            //Implicit way
    val wholeNumber = 3 //Integer 32-bit number
    val bigNumber = 3L //Long 64-bit number
    val preciseDecimal = 3.33 //Double number
    val decimal= 3.33f // Float number
    val iLoveFruits = true
    val iHateLinearAlgebra = false
    val iAmALetter = 'a'

    println("An Integer 32-bit number is $c")
    println("An Integer 32-bit number is $wholeNumber")
    println("A Long 64-bit number is $bigNumber")
    println("A Double number is $preciseDecimal")
    println("A Float number is $decimal")
    println("A Boolean is $iLoveFruits")
    println("A Letter is $iAmALetter")

}
