package classe

class Director(nom: String, date: Int, tail: Int,  salary: Double, var title: String) extends Employee(nom, date, tail,  salary) {
  def iam(titre: String): Unit = {
    println(s"im am $titre")
  }
}
