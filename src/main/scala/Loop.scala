package scala
class Loop {
 def triParSelection(tab:  Array[Int]): Array[Int] = {
  for (i <- 0 until tab.length - 1) {
   var minIndex = i
   for (j <- i + 1 until tab.length) {
    if (tab(j) < tab(minIndex)) {
     minIndex = j
    }
   }
   val temp = tab(minIndex)
   tab(minIndex) = tab(i)
   tab(i) = temp
  }
  tab
 }

 def bis(year: Int): Boolean = {
  (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)
 }

 def max(a: Int, b: Int): Boolean ={
    (a>b)
 }

 def identifierJour(jour: String): String = {
  jour match {
   case "Lundi" | "Mardi" | "Mercredi" | "Jeudi" | "Vendredi" => "C'est un jour ouvré."
   case "Samedi" | "Dimanche" => "C'est le week-end !"
   case "Noël" | "Nouvel An" => "C'est un jour spécial !"
   case _ => "Jour inconnu."
  }
 }

 def categoriserNombre(nombre: Int): String = {
  nombre match {
   case x if x > 0 && x % 2 == 0 => "Nombre positif et pair"
   case x if x > 0 && x % 2 != 0 => "Nombre positif et impair"
   case x if x < 0 && x % 2 == 0 => "Nombre négatif et pair"
   case x if x < 0 && x % 2 != 0 => "Nombre négatif et impair"
   case 0 => "Le nombre est zéro"
   case _ => "Nombre inconnu"
  }
 }

}
