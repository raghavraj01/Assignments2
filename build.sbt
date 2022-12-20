ThisBuild / version := "1.6.2-SNAPSHOT"

ThisBuild / scalaVersion := "2.12.12"
import sbt._
import Keys._

lazy val root = (project in file("."))
  .settings(
    name := "RaghavFirstSBT"
  )
  .aggregate(akka,play)

libraryDependencies ++= Seq("com.typesafe.akka" %% "akka-stream" % "2.7.0",
  "com.typesafe.akka" %% "akka-actor" % "2.7.0")



lazy val Utils = (project in file("Utils"))
  .settings(
    name := "Utils"
  )

lazy val akka = (project in file("akka_module"))
  .settings(
    name := "akka"
  ).dependsOn(Utils)

lazy val play = (project in file("play_module"))
  .settings(
    name := "play"
  ).dependsOn(Utils)

