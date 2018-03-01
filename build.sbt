import AssemblyKeys._

assemblySettings

name := "pio-template-text-similarity"

scalaVersion := "2.11.8"

organization := "com.kolibero"

libraryDependencies ++= Seq(
  "org.apache.predictionio" %% "apache-predictionio-core" % "0.12.0-incubating" % "provided",
  "org.apache.spark"        %% "spark-core"               % "2.1.1"             % "provided",
  "org.apache.spark"        %% "spark-mllib"              % "2.1.1"             % "provided",
  "org.scalatest"           %% "scalatest"                % "2.2.1"             % "test", 
  "org.glassfish.hk2" % "hk2-utils" % "2.2.0-b27",
  "org.glassfish.hk2" % "hk2-locator" % "2.2.0-b27",
  "javax.validation" % "validation-api" % "1.1.0.Final"
).map(_.excludeAll(ExclusionRule("org.glassfish.hk2"),ExclusionRule("javax.validation")))

SharedSingletonContext parallelExecution in Test := false
