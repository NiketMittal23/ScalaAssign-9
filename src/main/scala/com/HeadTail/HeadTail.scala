package com.HeadTail

class HeadTail {

  def isort(list: List[Int]): List[Int] =
    if (list.isEmpty) List()
    else insert(list.head, isort(list.tail))

  def insert(value: Int, list: List[Int]): List[Int] =
    if (list.isEmpty || value < list.head) value :: list
    else list.head :: insert(value, list.tail)
}

object run extends App{
  val n = new HeadTail
 println(n.isort(n.insert(6,List(1,2,5,4))))
}

