package funsets

import FunSets._

object ws {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  def f = intersect(((x: Int) => (x < 10) && (x > 0)), ((x: Int) => x % 2 == 0))
                                                  //> f: => Int => Boolean
  printSet(f)                                     //> {2,4,6,8}

  def m = FunSets.map(((x: Int) => x < 8 && x > 0), ((x: Int) => x * x * x))
                                                  //> m: => Int => Boolean
  //FunSets.printSet(m)

  val t1 = ((x: Int) => x > 0 && x < 10)          //> t1  : Int => Boolean = <function1>
  val t2 = ((x: Int) => x == 1 || x == 3 || x == 5 || x == 7 || x == 9)
                                                  //> t2  : Int => Boolean = <function1>
  val t3 = ((x: Int) => x == 2 || x == 4 || x == 6 || x == 8)
                                                  //> t3  : Int => Boolean = <function1>

  printSet(t1)                                    //> {1,2,3,4,5,6,7,8,9}
  printSet(t2)                                    //> {1,3,5,7,9}
  printSet(t3)                                    //> {2,4,6,8}
  
  
  forall(t3, ((x:Int) => x % 2 == 0))             //> res0: Boolean = true
  val mm = map(t2, ((x:Int) => x * x))            //> mm  : Int => Boolean = <function1>
  printSet(mm)                                    //> {1,9,25,49,81}
  
}