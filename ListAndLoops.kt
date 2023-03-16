fun main() {

    //Lists
    println("=======Lists=======")

    //Immutable List
    //Lists are data containers we can use to save a bunch of variables in.
    //Imutable Lists are lists that we can add or remove items from it.

    val shoppingList_1 = listOf<String>("AAA", "BBB", "CCC")
    println(shoppingList_1[0])

    //Mutable List
    //Mutable Lists are lists that we can add/remove items.

    val shoppingList = mutableListOf("Lamburghini", "Penthouse", "Rolex")
    shoppingList.add("Ferrari")
    println(shoppingList[3])


    //Loops

    //While
    println("=======While loop=======")

    var counter = 0

    while (counter < shoppingList.size) {
        println(shoppingList[counter])
        counter++
    }

    //For

    println("=======For loop=======")

    for (shoppingItem in shoppingList) {
        println(shoppingItem)
    }

    for (i in 1..100) {
        println(i)
    }
}
