fun main(){

        //if conditions

    val x = 1 +  1

    if(x == 2){
        println("x is 2")
    } else if( x == 3){
        println("x is 3")
    } else {
        println("x is not 2 or 3")
    }

                //other way to use if
    val y = if (x == 2) 2 else 3
    println("$y")
    
        //When-expression

    val z = 3
    when(z){
        in 1..2 -> println("z is between 1 and 2")
        in 3..10 -> println("z is between 3 and 10")
        else -> {
            println("z is not in the range of 1 to 10")
        }
    }
}
