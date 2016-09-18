organization := "com.mattwittmann.quotes"

name := "quotes-api"

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.11.8"

scalacOptions ++= Seq("-feature", "-deprecation")

val akkaVersion = "2.4.10"

libraryDependencies ++= Seq("com.typesafe.akka" %% "akka-actor" % akkaVersion,
                            "com.typesafe.akka" %% "akka-http-core" % akkaVersion,
                            "com.typesafe.akka" %% "akka-http-experimental" % akkaVersion,
                            "com.typesafe.akka" %% "akka-http-spray-json-experimental" % akkaVersion,
                            "io.spray" %% "spray-json" % "1.3.2",
                            "org.scalatest" %% "scalatest" % "3.0.0" % Test)

enablePlugins(JavaAppPackaging)

enablePlugins(DockerPlugin)

mainClass in Compile := Some("com.mattwittmann.quotes.WebMain")

dockerExposedPorts := Seq(8080)
