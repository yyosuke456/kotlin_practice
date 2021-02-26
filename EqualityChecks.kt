// https://play.kotlinlang.org/byExample/02_control_flow/04_Equality%20Checks
fun main(args: Array<String>) {
// ==で構造の等価判定
// ===で参照の比較
// あんまり違いがわかってない。わかったらこのコメント書き換える。
// 構造が一致→同じ型の長さ同じsetならイコールってこと？
  val authors = setOf("Shakespeare", "Hemingway", "Twain")
  val writers = setOf("Twain", "Shakespeare", "Hemingway")

  println(authors == writers)   // true
  println(authors === writers)  // false
}