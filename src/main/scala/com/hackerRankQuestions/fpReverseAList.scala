package com.hackerRankQuestions

/**
  * Created by anmol.kapoor on 07/04/16.
  * Question : https://www.hackerrank.com/challenges/fp-reverse-a-list
  */
object fpReverseAList {


  def f(arr: List[Int]): List[Int] = {
    arr.foldLeft(List[Int]()) { (list, value) => value :: list }
  }

  def main(args: Array[String]) {

    val newList = f(List(1, 2, 3))
    println(newList)
  }


}
