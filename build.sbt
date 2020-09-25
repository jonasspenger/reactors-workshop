scalaVersion := "2.11.8"
organization:= "RISE"
name := "reactors-workshop"
version := "1.0"

resolvers ++= Seq(
  "Sonatype OSS Snapshots" at
    "https://oss.sonatype.org/content/repositories/snapshots",
  "Sonatype OSS Releases" at
    "https://oss.sonatype.org/content/repositories/releases"
)

libraryDependencies ++= Seq(
  "io.reactors" %% "reactors" % "0.8")
