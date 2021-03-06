organization := "com.github.biopet"
organizationName := "Biopet"
name := "test-utils"

biopetUrlName := "test-utils"

startYear := Some(2014)

biopetIsTool := false

developers += Developer(id = "ffinfo",
                        name = "Peter van 't Hof",
                        email = "pjrvanthof@gmail.com",
                        url = url("https://github.com/ffinfo"))

crossScalaVersions := Seq("2.11.12", "2.12.5")

scalaVersion := "2.11.12"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5"
libraryDependencies += "org.mockito" % "mockito-all" % "1.10.19"
libraryDependencies += "org.testng" % "testng" % "6.14.3"

parallelExecution in Test := false
