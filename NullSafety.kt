fun main() {

  // kotlinでは基本的にnullはnot null
  // nullpointerExceptionを起こさせない
  var neverNull: String = "This can't be null"            // 1

  neverNull = null                                        // 2

  // ？をつけるとnullが入る可能性がある
  var nullable: String? = "You can keep a null here"      // 3　

  nullable = null                                         // 4

  // 型宣言がなくてもnot null
  var inferredNonNull = "The compiler assumes non-null"   // 5

  inferredNonNull = null                                  // 6

  fun strLength(notNull: String): Int {                   // 7
      return notNull.length
  }

  strLength(neverNull)                                    // 8
  strLength(nullable)                                     // 9

}

/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */

fun main() {
  println("Hello, world!!!")
  println(describeString("hwello"))

}
// nullableでない型に対してnullチェックを書いていると、コンパイラが注意してくれる
fun describeString(maybeString: String): String {              // 1
  if (maybeString != null && maybeString.length > 0) {        // 2
      return "String of length ${maybeString.length}"
  } else {
      return "Empty or null string"                           // 3
  }
}