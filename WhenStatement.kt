fun main() {
  cases("Hello")
  cases(1)
  cases(0L)
  cases(MyClass())
  cases("hello")
}

// when で場合分け
fun cases(obj: Any){
  when(obj){
    1 -> println("One")
    "Hello" -> println("Greeting")
    is Long -> println("Long")// 型チェック
    !is String ->println("Not a string")
    else -> println("Unknown")// デフォルト
  }
}