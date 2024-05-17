package classe

abstract class Employee(nom: String, date: Int, tail: Int, var salary: Double) extends Person(nom, date , tail  ) {
  override def display(): Unit ={
    super.display()
    println(s"Salary is $salary")
  }

  def iam(titre: String): Unit
}
