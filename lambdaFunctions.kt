fun main() {

    //Lambda Functions
        //Are functions that are passed as a parameter in other functions.

        //First Way
            //.count is a function. We passed as parameter other function that maps a string called currentString
            //into a boolean that is the result of operation currentString.length >= 3

    val list = listOf<String>("Kotlin","is","fun")
    val count0 = list.count { currentString -> currentString.length >= 3}
    println(count0)

        //Secound Way
            //Here we used a custom function to count. The implement the counter as usal but we put a conditional
            //statement depending on a unknow function that maps a <T> type data into a Boolean. Note that <T> is the
            //generic type. In this case we should be interested in to count any type of lists, for example a list of
            //integer instead of a list of Strings. Than is useful defines the type of the input as generic.

    val count = list.customCount { currentString -> currentString.length >=3 }
    println(count)
}

//The bellow line means:
//function.name = customCount
//function.input = List of type <T> of <T> elements type
//function.output = Integer
//function.parameter =  other function called generically as "function" that recives a <T> type input and returns a boolean
fun <T> List<T>.customCount(function: (T) -> Boolean): Int{
    var counter = 0
    for(string in this){
        if(function(string)){
            counter++
        }
    }
    return counter
}
