import AssemblyKeys._

assemblySettings

name := "pio-template-text-similarity"

scalaVersion := "2.11.8"

organization := "com.kolibero"

libraryDependencies ++= Seq(
  "org.apache.predictionio" %% "apache-predictionio-core" % "0.12.0-incubating" % "provided",
  "org.apache.spark"        %% "spark-core"               % "2.1.1" % "provided",
  "org.apache.spark"        %% "spark-mllib"              % "2.1.1" % "provided",
  "org.scalatest"           %% "scalatest"                % "2.2.1" % "test")

libraryDependencies += "org.glassfish.jersey.containers" % "jersey-container-grizzly2-http" % "2.5.1" exclude("org.glassfish.hk2", "hk2-utils") exclude("org.glassfish.hk2", "hk2-locator") exclude("javax.validation", "validation-api")

//http://search.maven.org/#browse%7C703203458
libraryDependencies += "org.glassfish.hk2" % "hk2-utils" % "2.2.0-b27"

//http://search.maven.org/#search%7Cga%7C1%7Ca%3A%22hk2-locator%22
libraryDependencies += "org.glassfish.hk2" % "hk2-locator" % "2.2.0-b27"

//http://search.maven.org/#artifactdetails%7Cjavax.validation%7Cvalidation-api%7C1.1.0.Final%7Cjar
libraryDependencies += "javax.validation" % "validation-api" % "1.1.0.Final"

parallelExecution in Test := false

