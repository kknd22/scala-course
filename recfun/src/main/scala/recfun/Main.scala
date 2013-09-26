package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || c == r) 1
    else pascal(c - 1, r - 1) + pascal(c, r - 1)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def countP(xs: List[Char], acc: Int): Int = {
      if (xs.isEmpty || acc < 0) acc
      else {
        xs.head match {
          case '(' => countP(xs.tail, acc + 1)
          case ')' => countP(xs.tail, acc - 1)
          case _ => countP(xs.tail, acc)
        }
      }
    }
    countP(chars, 0) == 0
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = (money, coins) match {
    case (0, _) => 1
    case (m, _) if (m < 0) => 0
    case (_, List()) => 0
    case (m, x::xs) => countChange(m-x, coins) + countChange(m, xs)
  }
}
