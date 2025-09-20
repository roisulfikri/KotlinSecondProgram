fun main(args: Array<String>) {
    println("Example of Break dan Continue label")
    mylabel@ for (x in 1..10) {
        if (x == 5) {
            println("I am inside if block with value"+x+"\n-- hence it will close the operation")
            break@mylabel
        } else {
            println("I am inside else block with value"+x)
            continue@mylabel
        }
        println("Not Print")
    }
}