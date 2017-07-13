lazy val root = (project in file("."))
  .enablePlugins(ScalaJSPlugin)
  .settings(
    organization  := "com.example",
    scalaVersion  := "2.12.2",
    version       := "0.1.0-SNAPSHOT",
    name          := "$name$",
    libraryDependencies ++= Seq(
      "io.scalajs" %%% "nodejs" % "0.4.0",
      "org.scalatest" %%% "scalatest" % "3.0.1" % Test
    ),
    scalaJSModuleKind := ModuleKind.CommonJSModule
  )
