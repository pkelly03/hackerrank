package com.hackerRankQuestions

/**
  * paul kelly.
  * Question: https://www.hackerrank.com/challenges/fp-list-replication/problem
  */

object listReplication extends App {

  val arr = List(1, 2, 3, 4)
  val num = 3
  println(arr.flatMap(List.fill(num)(_)))
}
