import AssemblyKeys._

assemblySettings

name := "pio-template-text-similarity"

scalaVersion := "2.11.8"

organization := "com.kolibero"


// SparkContext is shared between all tests via SharedSingletonContext
parallelExecution in Test := false
