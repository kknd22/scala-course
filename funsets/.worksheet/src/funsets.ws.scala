package funsets

import FunSets._

object ws {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(90); 
  println("Welcome to the Scala worksheet");$skip(81); 
  def f = intersect(((x: Int) => (x < 10) && (x > 0)), ((x: Int) => x % 2 == 0));System.out.println("""f: => Int => Boolean""");$skip(14); 
  printSet(f);$skip(78); 

  def m = FunSets.map(((x: Int) => x < 8 && x > 0), ((x: Int) => x * x * x));System.out.println("""m: => Int => Boolean""");$skip(66); 
  //FunSets.printSet(m)

  val t1 = ((x: Int) => x > 0 && x < 10);System.out.println("""t1  : Int => Boolean = """ + $show(t1 ));$skip(72); 
  val t2 = ((x: Int) => x == 1 || x == 3 || x == 5 || x == 7 || x == 9);System.out.println("""t2  : Int => Boolean = """ + $show(t2 ));$skip(62); 
  val t3 = ((x: Int) => x == 2 || x == 4 || x == 6 || x == 8);System.out.println("""t3  : Int => Boolean = """ + $show(t3 ));$skip(16); 

  printSet(t1);$skip(15); 
  printSet(t2);$skip(15); 
  printSet(t3);$skip(44); val res$0 = 
  
  
  forall(t3, ((x:Int) => x % 2 == 0));System.out.println("""res0: Boolean = """ + $show(res$0));$skip(39); 
  val mm = map(t2, ((x:Int) => x * x));System.out.println("""mm  : Int => Boolean = """ + $show(mm ));$skip(15); 
  printSet(mm)}
  
}
