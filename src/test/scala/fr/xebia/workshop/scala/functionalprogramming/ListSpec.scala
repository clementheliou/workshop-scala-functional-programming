package fr.xebia.workshop.scala.functionalprogramming

import org.scalatest.{FlatSpec, Matchers}

class ListSpec extends FlatSpec with Matchers {

  // Exercise 1

  "A List" should "provide a single-argument constructor" in {
    Cons(1)
  }

  it should "provide a bi-argument constructor" in {
    Cons(2, Nil)
  }

  // Exercise 2

  it should "return an empty list when tail is called on empty list" in {
    // Arrange
    val emptyList = Nil

    // Act
    val result = emptyList.tail

    // Assert
    result shouldEqual Nil
  }

  it should "return an empty list when tail is called on a single-element list" in {
    // Arrange
    val aList = Cons(1)

    // Act
    val result = aList.tail

    // Assert
    result shouldEqual Nil
  }

  it should "return all elements except the first one when tail is called on multi-elements list" in {
    // Arrange
    val aList = Cons(2, Cons(4, Cons(3)))

    // Act
    val result = aList.tail

    // Assert
    result shouldEqual Cons(4, Cons(3))
  }

  // Exercise 3

  it should "return an empty list when drop is called on empty list" in {
    // Arrange
    val emptyList = Nil

    // Act
    val result = emptyList.drop(10)

    // Assert
    result shouldEqual Nil
  }

  it should "return an empty list when drop size is greater than the list length" in {
    // Arrange
    val aList = Cons(4, Cons(3, Cons(2)))

    // Act
    val result = aList.drop(6)

    // Assert
    result shouldEqual Nil
  }

  it should "return all elements except the first n ones when drop is called" in {
    // Arrange
    val aList = Cons(4, Cons(3, Cons(2)))

    // Act
    val result = aList.drop(2)

    // Assert
    result shouldEqual Cons(2)
  }

  // Exercise 4

  it should "return Nil when init is called on empty list" in {
    // Arrange
    val emptyList = Nil

    // Act
    val result = emptyList.init()

    // Assert
    result shouldEqual Nil
  }

  it should "return all elements but the last one when init is called on non-empty list" in {
    // Arrange
    val aList = Cons(4, Cons(5, Cons(6)))

    // Act
    val result = aList.init()

    // Assert
    result shouldEqual Cons(4, Cons(5))
  }

  // Exercise 5

  it should "return 0 when sum is called on empty list" in {
    // Arrange
    val emptyList = Nil

    // Act
    val sum = List.sum(emptyList)

    // Assert
    sum shouldEqual 0
  }

  it should "return the sum of integers when sum is called on non-empty list" in {
    // Arrange
    val aList = Cons(4, Cons(5, Cons(12)))

    // Act
    val sum = List.sum(aList)

    // Assert
    sum shouldEqual 21
  }

  // Exercise 6

  it should "return 1 when product is called on empty list" in {
    // Arrange
    val emptyList = Nil

    // Act
    val product = List.product(emptyList)

    // Assert
    product shouldEqual 1
  }

  it should "return the product of integers when product is called on non-empty list" in {
    // Arrange
    val aList = Cons(4, Cons(5, Cons(12)))

    // Act
    val product = List.product(aList)

    // Assert
    product shouldEqual 240
  }

  // Exercise 8

  it should "return 0 when length is called on empty list" in {
    // Arrange
    val emptyList = Nil

    // Act
    val result = emptyList.length

    // Assert
    result shouldEqual 0
  }

  it should "return the list's size when length is called on non-empty list" in {
    // Arrange
    val aList = Cons(4, Cons(5))

    // Act
    val result = aList.length

    // Assert
    result shouldEqual 2
  }
}
