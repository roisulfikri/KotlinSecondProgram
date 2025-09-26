fun main(args: Array<String>) {
    println(MyFunction("Rekayasa Perangkat Lunak"))

    val mylambda :(String)->Unit = {s:String->print(s)}
    val v:String = "Jurusan Teknik Informatika"
    mylambda(v)

    myFun(v,mylambda)
}
fun MyFunction(x: String): String {
    var c:String = "Hey!! Welcome To ---"
    return (c+x)
}
fun myFun(a:String, action:(String)->Unit) {
    print("\nHeyyy!!!")
    action(a)
}