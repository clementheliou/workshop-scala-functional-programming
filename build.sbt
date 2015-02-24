name := "functional-programming"

organization := "fr.xebia.workshop.scala"

scalaVersion := "2.11.5"

version := "1.0-SNAPSHOT"

libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.3" % "test" exclude("scala-library", "scala-reflect")
