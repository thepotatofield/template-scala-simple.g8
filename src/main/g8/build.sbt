import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "$organization$",
      scalaVersion := "$scala_version$",
      version      := "$version$"
    )),
    name := "$name$",
    libraryDependencies += scalaTest % Test
  )
