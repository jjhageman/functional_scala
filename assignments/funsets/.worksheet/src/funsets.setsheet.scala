package funsets

object setsheet {
  import FunSets._;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(98); 

  println("Welcome to the Scala worksheet");$skip(19); 
  var x = Set(1,3);System.out.println("""x  : scala.collection.immutable.Set[Int] = """ + $show(x ));$skip(17); 
  var y = Set(2);System.out.println("""y  : scala.collection.immutable.Set[Int] = """ + $show(y ));$skip(21); 
  var z = Set(1,2,3);System.out.println("""z  : scala.collection.immutable.Set[Int] = """ + $show(z ));$skip(9); val res$0 = 
  x ++ y;System.out.println("""res0: scala.collection.immutable.Set[Int] = """ + $show(res$0));$skip(4); val res$1 = 
  y;System.out.println("""res1: scala.collection.immutable.Set[Int] = """ + $show(res$1));$skip(26); 
  var z = singletonSet(1);System.out.println("""z  : Int => Boolean = """ + $show(z ));$skip(4); val res$2 = 
  z;System.out.println("""res2: scala.collection.immutable.Set[Int] = """ + $show(res$2))}
}
