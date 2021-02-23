class Animal(val name: String)

class Zoo(val animals: List<Animal>) {
  operator fun iterator() : Iterator<Animal> {// iteratorで宣言
    return animals.iterator()
  }
}// iteratorはnext(), hasNext()を持つ。

fun main (){
  val zoo = Zoo(listOf(Animal("zebra"), Animal("lion")))

  println(zoo.iterator().next().name)// zebra
  for(animal in zoo){
    println("Watch out, it's a ${animal.name}")
  }
}