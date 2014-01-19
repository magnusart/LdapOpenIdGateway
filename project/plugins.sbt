import sbt._

import Defaults._

// Comment to get more information during initialization
logLevel := Level.Warn

resolvers += Classpaths.typesafeReleases

resolvers += "Sonatype snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/"

// JS/Coffee Script Closure Compiler
addSbtPlugin("com.untyped" % "sbt-js"   % "0.6")

// Less compiler/minifier
addSbtPlugin("com.untyped" % "sbt-less" % "0.6")

// Revolver
addSbtPlugin("io.spray" % "sbt-revolver" % "0.7.1")

// SBT-Assembly
addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.10.1")

// Sublime Scala source download (gen-sublime)
addSbtPlugin("com.orrsella" % "sbt-sublime" % "1.0.9")

// Code formatting
addSbtPlugin("com.typesafe.sbt" % "sbt-scalariform" % "1.2.1")

// SBT Dependency Graph
addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.7.4")