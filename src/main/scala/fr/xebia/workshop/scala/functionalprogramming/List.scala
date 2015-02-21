package fr.xebia.workshop.scala.functionalprogramming

sealed trait List[+A] {
  def drop(n: Int): List[A] = this match {
    case Cons(_, _) if n == 0 => this
    case Cons(_, tail) => tail.drop(n - 1)
    case _ => Nil
  }

  def init(): List[A] = this match {
    case Cons(_, Nil) => Nil
    case Cons(head, tail) => Cons(head, tail.init())
    case _ => Nil
  }

  def tail: List[A] = drop(1)
}

case object Nil extends List[Nothing]

case class Cons[A](head: A, initialTail: List[A] = Nil) extends List[A]