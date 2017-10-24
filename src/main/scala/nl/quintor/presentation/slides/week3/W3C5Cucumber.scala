package nl.quintor.presentation.slides.week3

import nl.quintor.presentation.Section
import nl.quintor.reveal.{subsection, _}

import scalatags.Text.all.{p, _}

object W3C5Cucumber extends Section {
  override def content =
    section("Cucumber")(
      subsection()(
        p("Automated testing framework: https://cucumber.io/")
      ),
      subsection()(
        p("Check out 'cucumber' branch")
      ),
      subsection()(
        p("Maven setup consists of multiple modules. Seperate module for the app and automated tests."),
        p("Automated test module has dependencies on cucumber and the app module")
      ),
      subsection()(
        p("Three main components for cucumber"),
        ul(
          li("runner - execute the tests with a specific configuration"),
          li("features - the test scenarios"),
          li("glue - the connection between the test scenarios and the java code")
        )
      ),
      subsection()(
        p("Install intellij 'Cucumber for Java' and 'Gherkin' plugin"),
        p("Run the tests")
      ),
      subsection()(
        p("4 types of step definitions"),
        ul(
          li("Given - setup statement"),
          li("when - action"),
          li("then - the test scenarios"),
          li("and - extend a step"),
          li("but - extend a step")
        ),
        p("e.g. Given that I am on a certain page, When I press this button, Then a popup should occur")
      ),
      subsection()(
        p("Feature file corresponds to annotations in glue"),
        p("Step definitions are defined using 'Gherkin'"),
        p("Not very strict on the name of the annotation"),
        p("Add step definitions to make the Fizz Buzz tests more complete")
      ),
      subsection()(
        p("Step definitions support pattern matching"),
        p("e.g. ^Result has value [a-zA-Z]+$"),
        p("http://agileforall.com/wp-content/uploads/2011/08/Cucumber-Regular-Expressions-Che")
      ),
      subsection()(
        p("Grouping can be used to capture arguments: () "),
        prettyCode(java,
          """
            |@When("^FizzBuzz called for round ([0-9]+)$")
            |public void fizzBuzzCalledWith(int round) throws Throwable {
            |        result = new FizzBuzz().play(round);
            |}
            |
        """.
            stripMargin
        )

      ),
      subsection()(
        p("Refactor the tests to use arguments")
      )
    )


}
