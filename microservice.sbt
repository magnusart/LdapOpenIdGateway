import sbtassembly.Plugin._

import AssemblyKeys._

import spray.revolver.RevolverPlugin._

assemblySettings

artifact in (Compile, assembly) ~= { art =>
  art.copy(`classifier` = Some("assembly"))
}

addArtifact(artifact in (Compile, assembly), assembly)

artifact in (Compile, packageDependency) ~= { art =>
  art.copy(`classifier` = Some("deps"))
}

addArtifact(artifact in (Compile, packageDependency), packageDependency)

Revolver.settings