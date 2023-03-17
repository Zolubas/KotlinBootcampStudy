fun main() {

        //Classes
            //Class instantiation

    //val dog = Animal("Dog")
    val dog = Dog()
    //dog.bark()
    dog.makeSound()

    val cat = Cat()
    //cat.meow()
    cat.makeSound()

        //Anonymous Class
            //It used when I just want to creat an object and use it only in the main function
    val bear = object : Animal("Camembear"){
        override fun makeSound() {
            println("ROOOAR!!!!")
        }
    }

    bear.makeSound()

}
