class Dog : Animal("Dog") { //Class Dog inherit from Animal.
    init {
        println("I'm a animal with $legCount legs") //the heir class have the same attributes from mother class (Animal)
    }

    //fun bark(){
    //    println("WUFF!!")
    //}

    //Override -> This function overwrite the behavior of the parent class
    override fun makeSound() {
        println("WUFF!!")
    }
}