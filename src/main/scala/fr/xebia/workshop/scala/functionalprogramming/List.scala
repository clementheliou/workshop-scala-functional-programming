package fr.xebia.workshop.scala.functionalprogramming

import scala.annotation.tailrec

sealed trait List[+A] {
  def drop(n: Int): List[A] = this match {
    case Cons(_, _) if n == 0 => this
    case Cons(_, tail) => tail.drop(n - 1)
    case _ => Nil
  }

  @tailrec
  final def foldLeft[B](z: B)(f: (B, A) => B): B = this match {
    case Cons(head, tail) => tail.foldLeft(f(z, head))(f)
    case _ => z
  }

  def foldRight[B](z: B)(f: (A, B) => B): B = this match {
    case Cons(head, tail) => f(head, tail.foldRight(z)(f))
    case _ => z
  }

  def init(): List[A] = this match {
    case Cons(_, Nil) => Nil
    case Cons(head, tail) => Cons(head, tail.init())
    case _ => Nil
  }

  def length: Int = foldLeft(0)((total, _) => total + 1)

  def tail: List[A] = drop(1)
}

object List {

  def addOne(values: List[Int]): List[Int] = values match {
    case Cons(head, tail) => new Cons(head + 1, addOne(tail))
    case _ => Nil
  }

  def product(values: List[Int]): Int = values.foldLeft(1)(_ * _)

  def sum(values: List[Int]): Int = values.foldLeft(0)(_ + _)

  def toString(values: List[_]): List[String] = values match {
    case Cons(head, tail) => new Cons(head.toString, toString(tail))
    case _ => Nil
  }
}

case object Nil extends List[Nothing]

case class Cons[A](head: A, initialTail: List[A] = Nil) extends List[A]