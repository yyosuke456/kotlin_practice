// https://play.kotlinlang.org/byExample/02_control_flow/02_Loops

fun main(args: Array<String>) {
  val cakes = listOf("carrot", "cheese", "chocolate")

  for (cake in cakes) {                               // cakes の要素cakeに処理
      println("Yummy, it's a $cake cake!")
  }

  var cakesEaten = 0
  var cakesBaked = 0

  while (cakesEaten < 5){// while, do whileは普通
    println("eat cake")
    cakesEaten++
  }

  do{
    println("bake cake")
    cakesBaked++
  }while(cakesBaked < cakesEaten)
  
}