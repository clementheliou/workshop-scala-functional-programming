package fr.xebia.workshop.scala.functionalprogramming

sealed trait Option[A] {}

case object None extends Option[Nothing]

case class Some[A](value: A) extends Option[A]