package fr.xebia.workshop.scala.functionalprogramming

import org.scalatest.{Matchers, FlatSpec}

class OptionSpec extends FlatSpec with Matchers{

  "An Option" can "be empty" in {
    None
  }

  it can "have an element" in {
    Some(7)
  }

  "An empty Option" should "return the default value when getOrElse is called" in {
    // Arrange
    val emptyOption = None

    // Act
    val result = emptyOption.getOrElse(2)

    // Assert
    result shouldEqual 2
  }

  it should "return the alternative evaluation when orElse is called" in {
    // Arrange
    val anAlternative = Some(6)
    val emptyOption = None

    // Act
    val result = emptyOption.orElse(anAlternative)

    // Assert
    result shouldEqual Some(6)
  }

//  it should "return None when filter is called" in {
//    // Arrange
//    val emptyOption: Option[Int] = None
//
//    // Act
//    val result = emptyOption.filter(_ % 2 == 0)
//
//    // Assert
//    result shouldEqual None
//  }

  "A non-empty Option" should "return its value when getOrElse is called" in {
    // Arrange
    val anOption = Some(6)

    // Act
    val result = anOption.getOrElse(2)

    // Assert
    result shouldEqual 6
  }

  it should "return its value when orElse is called" in {
    // Arrange
    val anOption = Some(6)

    // Act
    val result = anOption.orElse(Some(4))

    // Assert
    result shouldEqual anOption
  }
//
//  it should "return None when filter with a predicate that does not match it" in {
//    // Arrange
//    val anOption = Some(7)
//
//    // Act
//    val result = anOption.filter(_ % 2 == 0)
//
//    // Assert
//    result shouldEqual None
//  }
//
//  it should "return its value when filtered with a predicate matching it" in {
//    // Arrange
//    val anOption = Some(6)
//
//    // Act
//    val result = anOption.filter(_ % 2 == 0)
//
//    // Assert
//    result shouldEqual anOption
//  }
}
