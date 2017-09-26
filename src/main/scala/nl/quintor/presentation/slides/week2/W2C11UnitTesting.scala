package nl.quintor.presentation.slides.week2

import nl.quintor.presentation.Section
import nl.quintor.reveal.{subsection, _}

import scalatags.Text.all.{p, _}

object W2C11UnitTesting extends Section {
  override def content =
    section("Unit Testing")(
      subsection()(
        p("What is unit testing?"),
        blockquote("In computer programming, unit testing is a software testing method by which individual units of source code, sets of one or more computer program modules together with associated control data, usage procedures, and operating procedures, are tested to determine whether they are fit for use."),
        p("Basically, you test each component (class) individually")
      ),
      subsection()(
        p("To get started, we need to add a dependency to maven to include junit library: "),

        prettyCode(java,
          """
            |<dependencies>
            | <dependency>
            |   {dependency here}
            | </dependency>
            |</dependencies>
          """.
            stripMargin
        ),
        p("You can find dependency at ", a(href:="https://mvnrepository.com")("https://mvnrepository.com")),
        p("Search for junit")
      ),
      subsection()(
        ul(
          li("Tests are located in src/test/java"),
          li("End each test class with 'Test'")
        )
      ),
      subsection()(
        prettyCode(java,
          """
            |package nl.quintor.demo;
            |
            |import org.junit.Before;
            |import org.junit.Test;
            |
            |public class FizzBuzzTest {
            |    @Before
            |    public void mySetupMethod(){ ... }
            |
            |    @After
            |    public void myTearDownMethod(){ ... }
            |
            |    @Test
            |    public void myTestMethod(){ ... }
            |}
          """.
            stripMargin
        )
    ),
    subsection()(
        ul(
          li("@Before - run before each test"),
          li("@After - run after each test"),
          li("@Test - the test, there can be mutliple")
        )
    ),
    subsection()(
      p("assertion\nəˈsəːʃ(ə)n/Submit\nnoun"),
      p("A confident and forceful statement of fact or belief."),
      p("The essence of unit tests")(fragment)
    ),
    subsection()(
      prettyCode(java,
        """
          |@Test
          |public void myTestMethod(){
          |   Assert.assertEquals("They shouldn't be equal", "Apples", "Oranges");
          |}
          |
        """.
          stripMargin
      ),
      p("This test asserts that 'Apples' is equal to 'Oranges'"),
      p("This is, of course, false")(fragment)
    ),
    subsection()(
        p("Unit assertions usually have the following form:"),
        ul(
          li("assert{TYPE}(message,a[,b])"),
          li("message - shown when assertion is incorrect"),
          li("{TYPE} - type of assertion, eg 'Equals' or 'True'"),
          li("a[,b] - the one or two objects that we are asserting about")
        )
    ),
    subsection()(
        p("Create unit tests for FizzBuzz"),
        ul(
          li("What is the main issue when testing the 'play' method? "),
          li("Test happy path"),
          li("Test edge cases")
        )
    )
  )


}
