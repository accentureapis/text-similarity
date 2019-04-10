import AssemblyKeys._

assemblySettings

name := "pio-template-text-similarity"

scalaVersion := "2.11.8"

organization := "com.kolibero"

libraryDependencies ++= Seq(
  "org.apache.predictionio" %% "apache-predictionio-core" % "0.10.0-incubating" % "provided",
  "org.apache.spark"        %% "spark-core"               % "1.6.1" % "provided",
  "org.apache.spark"        %% "spark-mllib"              % "1.6.1" % "provided",
  "org.scalatest"           %% "scalatest"                % "2.2.1" % "test")

// SparkContext is shared between all tests via SharedSingletonContext
parallelExecution in Test := false
