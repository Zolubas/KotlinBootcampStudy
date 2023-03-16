fun main(){
        //Arithmetic operators
    val x = 3*4
    val x1 = 3/4
    val x2 = 3+4
    val x3 = 3-4
    val x4 = 3f/4f
    println("The value of x is $x")
    println("The value of x1 is $x1") //not that the answer is ZERO because Kotlin throwaway the decimal part of 0.75
    println("The value of x4 is $x4") //Now we have the expected result
            //Modulos
    val x5 = 10 % 3 //This is called Modulos operator. It provides the ramin of division of 10 by 3 in this case
    println("The value of x4 is $x5")

        // Logical Operators
    val amIAnAdult = true
    val amIAProgrammer = true
    val amIAnAdultProgrammer = amIAnAdult && amIAProgrammer
    val amIAnAdultOrAProgrammer = amIAnAdult || amIAProgrammer
    println("Am I an Adult and a Programmer ? $amIAnAdultProgrammer")
    //println("Am I an Adult or a Programmer ? $(amIAnAdult || amIAProgrammer)") -> Doesn't works
    println("Am I an Adult or a Programmer ? $amIAnAdultOrAProgrammer")
      
      //Comparasions
    val isThisEqual = amIAnAdult == amIAProgrammer
    val isThisDifferent =  amIAnAdult != amIAProgrammer

            //Inverter
    val isThisEqual_1 = !(amIAnAdult == amIAProgrammer)

}
