// Common settings
lazy val commonSettings = Seq(
  libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.1",
  libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test",
  organization := "com.upax-research",
  version := "1.0.0",
  scalacOptions := Seq("-feature"),
  scalaVersion := "2.12.1")

lazy val files = (project in file("."))
  .settings(commonSettings: _*)
  .settings(name := "FileFuncs")
