import scala.language.postfixOps
import scala.math.pow
class ListComprehension {
  def pair(list: Array[Int]): Array[Int] ={
   val ret = for (
      n <- list
      if n%2 == 0
    ) yield n
    ret
  }
  def square(list: Array[Double], tab: Array[Double]): Array[Double] = {
    val ret = for {
      n <- list
      m<- tab
    } yield pow((n + m), 2)
    ret
  }
}
