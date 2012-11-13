import sbt._

object ScaldingBuild extends Build {
  lazy val root = Project("root", file("."))
                    .dependsOn(RootProject(uri("http://github.com/twitter/algebird.git#master")))
                    .dependsOn(RootProject(uri("http://github.com/twitter/chill.git#master")))
}
