lazy val pickling = "org.scala-lang.modules" %% "scala-pickling" % "0.10.0"

lazy val root = (project in file(".")).
  settings(
    name := "sbt-pickling-example",
    scalaVersion := "2.11.5",
    libraryDependencies += pickling,
    resolvers += Resolver.sonatypeRepo("snapshots")
  )
