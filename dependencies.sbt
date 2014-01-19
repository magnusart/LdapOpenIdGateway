libraryDependencies <<= scalaVersion { scala_version => 
  val opendj = "2.6.6"
  Seq(
    "org.forgerock.opendj" %  "opendj-ldap-sdk" % opendj,
    "org.scala-lang" % "scala-reflect" % scala_version
  )
}
