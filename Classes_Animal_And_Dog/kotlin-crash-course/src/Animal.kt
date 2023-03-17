//Class Definition

    //This is an open class because it has inheritance.

open class Animal(
        //Attributes
    val name: String,
    val legCount: Int = 4 // You can define who many legs the animal has. By default it has 4 legs
) {

    //Function that runs when an instance of this class is created
    init {
        println("Hello, my name is $name")
    }
}