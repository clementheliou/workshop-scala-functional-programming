package fr.xebia.workshop.scala.functionalprogramming

sealed trait List[+A] {}

case object Nil extends List[Nothing]

case class Cons[A](head: A, tail: List[A] = Nil) extends List[A]