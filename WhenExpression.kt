fun main() {
  println(whenAssign("Hello"))
  println(whenAssign(3.4))
  println(whenAssign(1))
  println(whenAssign(MyClass()))
}

fun whenAssign(obj: Any) : Any{
  var result = when(obj){// 型が何であってもreturn できる
    1 -> "one"
    "Hello" -> 1
    is Long -> false
    else -> 42
  }
  return result
}

class MyClass