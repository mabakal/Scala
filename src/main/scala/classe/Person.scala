package classe

class Person(
              var nom: String,
              var date: Int,
              private var tail: Int
              ) {
  def display(): Unit = {
    println(s"Mon nom est $nom et je  suis né en $date")
  }
  
  /*def this(
            nom: String,
            date: Int,
            tail: Int,
            nationality: String) = {
    this(nom, date, tail)
    this.nationality = nationnality
  }
   */
}
