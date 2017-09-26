package nl.quintor.presentation.slides.week2

import nl.quintor.presentation.Section
import nl.quintor.reveal.{subsection, _}

import scalatags.Text.all.{p, _}

object W2C10Maven extends Section {
  override def content =
    section("Maven")(
      subsection()(
        p("What is maven?"),
        blockquote("Apache Maven is a software project management and comprehension tool. Based on the concept of a project object model (POM), Maven can manage a project's build, reporting and documentation from a central piece of information."),
        ul(
          li("Dependency handling"),
          li("Build framework"),
          li( a(href := "https://maven.apache.org/guides/introduction/introduction-to-the-standard-directory-layout.html")("Forces project structure"))
        )
      ),
      subsection()(
        p("Check whether Maven is configured correctly"),
        prettyCode(java,
          """
            |mvn -version
          """.
            stripMargin
        ),
        ul(
          li("Create new project -> Maven"),
          li("Check Maven path in Intellij configuration")
        )
      ),
      subsection()(
        prettyCode(java,
          """
            |<?xml version="1.0" encoding="UTF-8"?>
            |<project xmlns="http://maven.apache.org/POM/4.0.0"
            |         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
            |         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
            |    <modelVersion>4.0.0</modelVersion>
            |
            |    <groupId>nl.quintor.demo</groupId>
            |    <artifactId>fizzbuzz</artifactId>
            |    <version>1.0-SNAPSHOT</version>
            |
            |
            |</project>
          """.
            stripMargin
        ),
        ul(
          li("groupId - will identify your project uniquely across all projects"),
          li("artifactId -  the name of the jar without version"),
          li("version - application version")
        )
      ),
      subsection()(
        ul(
          li("Copy FizzBuzz to this project"),
          li("Build project: ")
        ),
        prettyCode(java,
          """
            |mvn clean install
          """.
            stripMargin
        ),
        ul(
          li("clean - remove previous builds"),
          li("install - install the package into the local repository, for use as a dependency in other projects locally"),
          li("result in target directory")
        )
      ),
      subsection("Jar")(
        p("Jar file is a Java ARchive file. Little more than a zip file containing your compiled classes"),
        p("Unzip and see")
      ),
      subsection()(
        p("Try to run FizzBuzz from the command line: "),

        prettyCode(java,
          """
            |#Apple/Linux
            |java -jar target/fizzbuzz-1.0-SNAPSHOT.jar
            |
            |#Windows
            |java -jar target\fizzbuzz-1.0-SNAPSHOT.jar
          """.
            stripMargin
        ),
        p("What is the result?"),
        prettyCode(java,
          """
            |no main manifest attribute, in target/fizzbuzz-1.0-SNAPSHOT.jar
          """.
            stripMargin
        )(fragment)
      ),
      subsection("Making the jar runnable")(
        p("When running a jar, java needs to know where the 'main' class is"),
        p("That is configured in its Manifest.mf file")(fragment)
      ),
      subsection()(
        p("Maven can add this for us, by adding: ")(fragment),

        prettyCode(java,
          """
            |<build>
            |	<plugins>
            |		<plugin>
            |			<!-- Build an executable JAR -->
            |			<groupId>org.apache.maven.plugins</groupId>
            |			<artifactId>maven-jar-plugin</artifactId>
            |			<version>2.4</version>
            |			<configuration>
            |				<archive>
            |					<manifest>
            |						<mainClass>nl.quintor.demo.FizzBuzzApp</mainClass>
            |					</manifest>
            |				</archive>
            |			</configuration>
            |		</plugin>
            |	</plugins>
            |</build>
            |
          """.
            stripMargin
        )(fragment),
        p("Add, rebuild, run")(fragment)
      )
    )


}
