ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "zio-realworld-app"
  )
libraryDependencies ++= Seq(
    "dev.zio" %% "zio" % "2.0.5",
    "dev.zio" %% "zio-streams" % "2.0.5"
  )

