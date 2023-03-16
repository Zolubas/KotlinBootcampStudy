fun main() {
    val x = isEven(6)
    println(x)

    val y = isEven(number = 7)
    println(y)

    val z= isEvenWithDefault()
    println(z)

    val w = isEvenWithDefault(6)
    println(w)

    val k = 3
    println(k.isOdd())
}

    //Functions

        //Simple Function

fun print10Numbers(){
    for(i in 1..10){
        println(i)
    }
}


        //Functions with parameters and returnables

fun isEven(number: Int): Boolean{
    //Function.Name = isEven
    //Function.Input = number of type Integer
    //Function.Output.Type = boolean
    //Function.Output.Return = Even or not even
    return number%2 == 0
}

        //Functions with default parameter

fun isEvenWithDefault(number: Int = 10): Boolean{
    //This function uses 10 as default number if nothing is passed as a parameter
    return number%2 == 0
}

        //Extendable Functions

fun Int.isOdd(): Boolean{
    //Function.Name = isOdd
    //Function.Input.Type = Integer
    //Function.Output.Type = Boolan
    //Function.Output.Return Odd or not odd
    //Function.ExtandableParameter = this
    return this % 2 == 0
}
