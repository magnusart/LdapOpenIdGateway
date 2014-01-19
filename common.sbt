import scalariform.formatter.preferences._

net.virtualvoid.sbt.graph.Plugin.graphSettings

// compile options
scalacOptions ++= Seq( 
  "-encoding", 
  "UTF-8", 
  "-optimise", 
  "-deprecation", 
  "-unchecked", 
  "-feature", 
  "-Yinline-warnings"
)

javacOptions  ++= Seq( 
  "-Xlint:unchecked", 
  "-Xlint:deprecation" 
)

resolvers += Classpaths.typesafeReleases

resolvers ++= Seq(
  "ForgeRock Release Repository" at "http://maven.forgerock.org/repo/releases",
  "ForgeRock Snapshot Repository" at "http://maven.forgerock.org/repo/snapshots",
  "Sonatype Snapshot Repo" at "http://oss.sonatype.org/content/repositories/snapshots/"
)

publishArtifact in Test := false

publishMavenStyle := true

pomIncludeRepository := { _ => false }

publishTo <<= version { (v: String) =>
  val mollyware = "http://office.mollyware.net:8081/"
  if (v.trim.endsWith("SNAPSHOT"))
    Some("snapshots" at mollyware + "repository/mollyware-snapshots")
  else
    Some("releases"  at mollyware + "repository/mollyware-releases")
}

credentials += Credentials(Path.userHome / ".deploy" / ".credentials-snapshots")

credentials += Credentials(Path.userHome / ".deploy" / ".credentials-releases")

scalariformSettings

ScalariformKeys.preferences := FormattingPreferences()
    .setPreference( RewriteArrowSymbols, true )
    .setPreference( AlignParameters, true )
    .setPreference( AlignSingleLineCaseStatements, true )
    .setPreference( SpaceInsideParentheses, true )
    .setPreference( DoubleIndentClassDeclaration, true )
    .setPreference( PreserveDanglingCloseParenthesis, true )
