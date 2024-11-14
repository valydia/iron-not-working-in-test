
lazy val root = project
  .in(file("."))
  .settings(
    name := "iron-not-working-in-test",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := "3.5.2",

    libraryDependencies ++= Seq(
      "io.github.iltotore" %% "iron" % "2.6.0",
      "com.disneystreaming" %% "weaver-cats"  % "0.8.4" % Test
    ),

  )
