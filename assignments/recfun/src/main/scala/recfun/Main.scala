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
    
    def isTip(): Boolean =
      c == 0 && r == 0
      
    def isEdge(): Boolean =
      c == 0 || c == r
      
    def isOne(): Boolean =
      isTip() || isEdge()
      
    if (isOne()) 1 else pascal(c-1, r-1) + pascal(c, r-1)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    var numOpens = 0
    var unOpens = 0
    
    def isOpen(ch: Char): Boolean =
      ch == '('
        
    def isClose(ch: Char): Boolean =
      ch == ')'
    
    def analyze(chs: List[Char]): Int = {
      if(chs.isEmpty) {
        0
      } else {
        if(isOpen(chs.head)) numOpens += 1
        if(isClose(chs.head)) {
          if(numOpens > 0) numOpens -= 1 else unOpens += 1
        }
        analyze(chs.tail)
        0
      }
    }
    analyze(chars)
    numOpens == 0 && unOpens == 0
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    if(money == 0) {
     1
    } else if(money < 0 || coins.isEmpty) {
      0
    } else {
      countChange(money, coins.tail) + countChange(money-coins.head, coins)
    }
  }
}
