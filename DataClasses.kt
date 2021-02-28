// https://play.kotlinlang.org/byExample/03_special_classes/01_Data%20classes
data class User(val name: String, val id: Int) // classの前にdata宣言

fun main() {
    val user = User("Alex", 1)
    println(user) // println時にtoStringは自動生成される

    val secondUser = User("Alex", 1)
    val thirdUser = User("Max", 2)

    println("user == secondUser: ${user == secondUser}")   // 3
    println("user == thirdUser: ${user == thirdUser}")

    println(user.hashCode())                               // 4
    println(secondUser.hashCode())

    // copy() function
    println(user.copy())                                   // 5
    println(user.copy("Max"))                              // 6
    println(user.copy(id = 2))                             // 7
    
    println("name = ${user.component1()}")                 // 8
    println("id = ${user.component2()}")
}