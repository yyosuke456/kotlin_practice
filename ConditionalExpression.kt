// https://play.kotlinlang.org/byExample/02_control_flow/05_Conditional%20expression

fun main() {
  // kotlinだと三項演算子は不要。条件、trueのときの返り値、elseのときの返り値の順に書ける

  fun max(a: Int, b: Int) = if (a > b) a else b
  fun min(a: Int, b: Int) = if (a < b) a else b

  println(max(99, -42))
  println(min(99, -42))
}