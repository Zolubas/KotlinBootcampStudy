//Class Definition

    //This is an open class because it has inheritance.

//open class Animal( -> It allows you to instantiate an animal, without a specific type like Dog or Cat
abstract class Animal( //-> It allows you to only instantiate heir classes like Dog or Cat. You cannot creat a generic animal using "Abstract Command"
        //Attributes
    val name: String,
    val legCount: Int = 4 // You can define who many legs the animal has. By default it has 4 legs
) {

    //Function that runs when an instance of this class is created
    init {
        println("Hello, my name is $name")
    }

    abstract fun makeSound() //This is a common method for all heiress classes. It must be implemented in all heiress classes. The implementation is different for each heiress class.
}