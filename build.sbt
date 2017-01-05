organization := "com.mattwittmann.quotes"

name := "quotes-api"

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.12.1"

scalacOptions ++= Seq("-feature", "-deprecation")

val akkaVersion = "2.4.16"

val akkaHttp = "10.0.1"

libraryDependencies ++= Seq("com.typesafe.akka" %% "akka-actor" % akkaVersion,
                            "com.typesafe.akka" %% "akka-http-core" % akkaHttp,
                            "com.typesafe.akka" %% "akka-http" % akkaHttp,
                            "com.typesafe.akka" %% "akka-http-spray-json" % akkaHttp,
                            "io.spray" %% "spray-json" % "1.3.3",
                            "org.scalatest" %% "scalatest" % "3.0.1" % Test)

enablePlugins(JavaAppPackaging)

enablePlugins(DockerPlugin)

mainClass in Compile := Some("com.mattwittmann.quotes.WebMain")

dockerExposedPorts := Seq(8080)
