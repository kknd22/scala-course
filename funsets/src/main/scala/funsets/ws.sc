package funsets

object ws {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  def f = FunSets.intersect( ((x:Int) =>(x < 10) && (x > 0)), ((x:Int) =>x%2 == 0) )
                                                  //> f: => Int => Boolean
  FunSets.printSet(f)                             //> {2,4,6,8}
  
 def m = FunSets.map(((x:Int) => x < 8 && x > 0), ((x: Int) => x*x*x) )
                                                  //> m: => Int => Boolean
 FunSets.printSet(m)                              //> {1,8,27,64,125,216,343}
}