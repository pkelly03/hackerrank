package com.hackerRankQuestions

/**
  * paul kelly.
  * Question: https://www.hackerrank.com/challenges/prefix-compression
  */
object prefixCompression {

  def perfix(x: List[Char], y: List[Char]): List[Char] = {
    x match {
      case List() => List()
      case x1 :: x => y match {
        case List() => List()
        case y1 :: y => {
          if (x1 == y1) {
            x1 :: perfix(x, y)
          } else {
            List()
          }
        }
      }

    }
  }

  def printAsFormat(p: List[Char]) = {
    p match {
      case List() => println(0)
      case _ => println(p.size + " " + p.mkString(""))

    }
  }

  def main(args: Array[String]) {
    val xAsString = io.StdIn.readLine()
    val yAsString = io.StdIn.readLine()
    val x = xAsString.toList
    val y = yAsString.toList
    val p = perfix(x, y)
    printAsFormat(p)
    printAsFormat(x.drop(p.size))
    printAsFormat(y.drop(p.size))


  }


}
