package fr.xebia.workshop.scala.functionalprogramming

sealed trait List[+A] {
  def tail: List[A] = this match {
    case Cons(_, tail) => tail
    case _ => Nil
  }
}

case object Nil extends List[Nothing]

case class Cons[A](head: A, initialTail: List[A] = Nil) extends List[A]