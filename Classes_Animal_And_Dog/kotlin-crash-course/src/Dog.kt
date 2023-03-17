class Dog : Animal("Dog") {
    init {
        println("I'm a animal with $legCount legs") //the heir class have the same attributes from mother class (Animal)
    }

    fun bark(){
        println("WUUF!!")
    }
}