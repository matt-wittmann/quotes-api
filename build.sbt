organization := "com.mattwittmann.quotes"

name := "quotes-api"

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.11.8"

scalacOptions ++= Seq("-feature", "-deprecation")

libraryDependencies ++= Seq("org.scalatest" %% "scalatest" % "3.0.0" % Test)

enablePlugins(JavaAppPackaging)

enablePlugins(DockerPlugin)
