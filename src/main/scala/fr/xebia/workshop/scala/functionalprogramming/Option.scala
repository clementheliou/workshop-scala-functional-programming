package fr.xebia.workshop.scala.functionalprogramming

sealed trait Option[A] {
  def getOrElse[B >: A](default: B): B = this match {
    case Some(value) => value
    case _ => default
  }
}

case object None extends Option[Nothing]

case class Some[A](value: A) extends Option[A]