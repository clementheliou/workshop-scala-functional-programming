package fr.xebia.workshop.scala.functionalprogramming

sealed trait Option[+A] {

  def filter(p: A => Boolean): Option[A] = this match {
    case Some(value) if p(value) => this
    case _ => None
  }

  def getOrElse[B >: A](default: B): B = this match {
    case Some(value) => value
    case _ => default
  }

  def map[B](f: A => B): Option[B] = this match {
    case Some(value) => Some(f(value))
    case _ => None
  }

  def orElse[B >: A](alternative: Option[B]): Option[B] = this match {
    case Some(_) => this
    case _ => alternative
  }
}

case object None extends Option[Nothing]

case class Some[A](value: A) extends Option[A]