package fr.xebia.workshop.scala.functionalprogramming

import org.scalatest.{Matchers, FlatSpec}

class ListSpec extends FlatSpec with Matchers{

  // Exercise 1

  "A List" should "provide a single-argument constructor" in {
    Cons(1)
  }

  it should "provide a bi-argument constructor" in {
    Cons(2, Nil)
  }

  // Exercise 2

//  it should "return an empty list when tail is called on empty list" in {
//    // Arrange
//    val emptyList = Nil
//
//    // Act
//    val result = emptyList.tail
//
//    // Assert
//    result shouldEqual Nil
//  }
//
//  it should "return an empty list when tail is called on a single-element list" in {
//    // Arrange
//    val aList = Cons(1)
//
//    // Act
//    val result = aList.tail
//
//    // Assert
//    result shouldEqual Nil
//  }
//
//  it should "return all elements except the first one when tail is called on multi-elements list" in {
//    // Arrange
//    val aList = Cons(2, Cons(4, Cons(3)))
//
//    // Act
//    val result = aList.tail
//
//    // Assert
//    result shouldEqual Cons(4, Cons(3))
//  }
}
