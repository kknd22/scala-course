package funsets

object ws {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(72); 
  println("Welcome to the Scala worksheet");$skip(85); 
  def f = FunSets.intersect( ((x:Int) =>(x < 10) && (x > 0)), ((x:Int) =>x%2 == 0) );System.out.println("""f: => Int => Boolean""");$skip(22); 
  FunSets.printSet(f);$skip(75); 
  
 def m = FunSets.map(((x:Int) => x < 8 && x > 0), ((x: Int) => x*x*x) );System.out.println("""m: => Int => Boolean""");$skip(21); 
 FunSets.printSet(m)}
}
