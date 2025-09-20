fun main(args: Array<String>) {
    var mayNumber: Int? = 15
    mayNumber = null
    println("mayNumber: $mayNumber ${mayNumber?.hashCode()}")
}