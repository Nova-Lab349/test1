//A Top level vaiable is variable that not in a fun command. This variable can be used anywhere under it
//(it for both var & val)
val name = "nova"
var age: Int = 1





fun variables() {
    //variables
    //A variable Allow to change during the process
    var vars: String = "var"
    println(vars)
    vars = "vars"
    println(vars)
    
    //A variable that cannot be changed during the process
    val vals: String = "val"
    println(vals)
}






fun IfAndElse() {
    //this is a if and else command
    //(this is if something meet the conduct of it, it will run everything in the "if {}"
    //or run everything in the "else {}")
    if(age != 0) {
        println(age)
    } else {
        println("no batter")
    }
    
    
    //you can command for different input(it not limited to two different output)
    when(age) {
        0 -> println("when low batter")
        1 -> println("idk")
        else -> println(age)
    }
}






// where the main command out area
fun main() {
    //to write anything inside the ""
    println("nova")
    
    //uses the variable process
    println(name)
    
    // will run the commands in fun valandvar
    variables()
    IfAndElse()
    
}
