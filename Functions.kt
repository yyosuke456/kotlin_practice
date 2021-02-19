// 関数宣言はfun
fun printMessage(message: String): Unit {                               // 1
  println(message)
}

// 引数にデフォルト値も設定可
fun printMessageWithPrefix(message: String, prefix: String = "Info") {  // 2
  println("[$prefix] $message")
}

// 戻り値はDelphiっぽい。後ろに書く形式
fun sum(x: Int, y: Int): Int {                                          // 3
  return x + y
}

// 1行なら｛も省略可
fun multiply(x: Int, y: Int) = x * y                                    // 4

fun main() {
  printMessage("Hello")                                               // 5                    
  printMessageWithPrefix("Hello", "Log")                              // 6
  printMessageWithPrefix("Hello")                                     // 7
  printMessageWithPrefix(prefix = "Log", message = "Hello")           // 8
  println(sum(1, 2))                                                  // 9
  println(multiply(2, 4))                                             // 10
}