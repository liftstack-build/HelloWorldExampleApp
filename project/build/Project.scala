import sbt._

class LiftProject(info: ProjectInfo) extends DefaultWebProject(info) {
  // val mavenLocal = "Local Maven Repository" at "file://"+Path.userHome+"/.m2/repository"
  val scalatoolsSnapshot = "Scala Tools Snapshot" at "http://scala-tools.org/repo-snapshots/"
  // val scalatoolsRelease = "Scala Tools Release" at "http://scala-tools.org/repo-releases/"
  val bubblefoundry = "Bubble Foundry Maven Repo" at "http://maven.bubblefoundry.com"

  val liftVersion = "2.3-SNAPSHOT"

  override def libraryDependencies = Set(
    "net.liftweb" %% "lift-webkit" % liftVersion % "compile->default",
    "net.liftweb" %% "lift-testkit" % liftVersion % "compile->default",
    "org.mortbay.jetty" % "jetty" % "6.1.22" % "test->default",
    "junit" % "junit" % "4.5" % "test->default",
    "org.scala-tools.testing" % "specs" % "1.6.1" % "test->default",
    "net.liftmodules" %% "helloworld" % "1.0"
  ) ++ super.libraryDependencies  
}
