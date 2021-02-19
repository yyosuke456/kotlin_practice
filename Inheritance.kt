// kotlinではJavaのfinalがデフォルト。基本的には継承せずに作ろうという思想？
open class Dog {                // 1 継承するには、openが付いている必要がある。
  open fun sayHello() {       // 2 overrideするにもopenが必要
      println("wow wow!")
  }
}

class Yorkshire : Dog() {       // 3
  override fun sayHello() {   // 4 sayHelloをoverride
      println("wif wif!")
  }
}

fun main() {
  val dog: Dog = Yorkshire()
  dog.sayHello()
}