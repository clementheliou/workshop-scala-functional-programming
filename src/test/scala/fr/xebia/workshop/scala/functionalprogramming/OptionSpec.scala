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

//  it should "return the alternative evaluation when orElse is called" in {
//    // Arrange
//    val anAlternative = Some(6)
//    val emptyOption = None
//
//    // Act
//    val result = emptyOption.orElse(anAlternative)
//
//    // Assert
//    result shouldEqual Some(6)
//  }

  "A non-empty Option" should "return its value when getOrElse is called" in {
    // Arrange
    val anOption = Some(6)

    // Act
    val result = anOption.getOrElse(2)

    // Assert
    result shouldEqual 6
  }

//  it should "return its value when orElse is called" in {
//    // Arrange
//    val anOption = Some(6)
//
//    // Act
//    val result = anOption.orElse(Some(4))
//
//    // Assert
//    result shouldEqual anOption
//  }

}
