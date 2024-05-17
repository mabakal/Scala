class DataStructure {
 def sort(list: List[Int]): List[Int] = {
   list.sorted
 }

 def filter(list: List[Int]): List[Int] = {
   list.filter(num => num%2!=0)
 }


 def diff(set1: Set[String],set2: Set[String]): Set[String] = {
   set1.diff(set2)
 }

 def recherche(map: Map[Int, String]): Boolean = {
    map.contains(7)
  }
}
