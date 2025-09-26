fun main(args: Array<String>) {
    connectToDb()
    println()

    connectToDb("sqlserver", "depandi")
}
fun connectToDb(hostname: String = "localhost",
                username: String = "mysql",
                password:String = "secret") {
    println("hostname : $hostname")
    println("username : $username")
    println("password : $password")
}