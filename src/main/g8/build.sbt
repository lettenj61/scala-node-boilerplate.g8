lazy val root = (project in file("."))
  .enablePlugins(ScalaJSPlugin)
  .settings(
    organization  := "$organization$",
    scalaVersion  := "$scalaVersion$",
    version       := "0.1.0-SNAPSHOT",
    name          := "$name$",
    scalacOptions in Compile += "-P:scalajs:sjsDefinedByDefault",
    libraryDependencies ++= Seq(
      "io.scalajs" %%% "nodejs" % "0.4.2",
      "com.lihaoyi" %%% "utest" % "0.6.3" % "test"
    ),
    scalaJSLinkerConfig ~= {
      _.withSourceMap(false).withModuleKind(ModuleKind.CommonJSModule)
    }
  )
