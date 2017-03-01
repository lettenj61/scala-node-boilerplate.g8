lazy val root = (project in file("."))
  .enablePlugins(ScalaJSPlugin)
  .settings(
    organization  := "com.example",
    scalaVersion  := "2.12.1",
    version       := "0.1.0-SNAPSHOT",
    name          := "$name;format="norm"$",
    libraryDependencies ++= Seq(
      "io.scalajs" %%% "nodejs" % "0.3.0.5",
      "org.scalatest" %%% "scalatest" % "3.0.1" % Test
    ),
    scalaJSModuleKind := ModuleKind.CommonJSModule
  )
