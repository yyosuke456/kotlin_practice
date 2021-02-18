class Customer                                  // 1

class Contact(val id: Int, var email: String)   // 2
// class Contact(val id: Int, var email: String = "hoge@gmail.com") // コンストラクタにデフォルトの値も設定可能

fun main() {

    val customer = Customer()                   // 3
    
    val contact = Contact(1, "mary@gmail.com")  // 4

    println(contact.id)                         // 5 setメソッドは自動で生成されている
    contact.email = "jane@gmail.com"            // 6 
    println(contact.email) //getメソッドは自動で生成されている
}
