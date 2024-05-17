import  scala.*
object Main {
  def main(args: Array[String]) = {
    var loop: Loop = new Loop()
    println(loop.triParSelection(Array(1, 5, -1, 9, 19, 3)).mkString("Array(", ", ", ")"))
    println(loop.bis(2020).toString)
    println(loop.categoriserNombre(10))

    // Liste Comprehension
    var list: ListComprehension = new ListComprehension()
    println(list.pair(Array(1, 5, 10, 8, 19, 3)).mkString("Array(", ", ", ")"))
    println(list.square(Array(1, 5, 3), Array(1, -1)).mkString("Array(", ", ", ")"))

  }
}
