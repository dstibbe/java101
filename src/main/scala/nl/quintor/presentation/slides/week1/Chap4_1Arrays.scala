package nl.quintor.presentation.slides.week1

import nl.quintor.presentation.Section
import nl.quintor.reveal._

import scalatags.Text.all._

object Chap4_1Arrays extends Section {
  override def content =
    section("Arrays")(
      subsection("")(
        p("An array is a container object that contains a set amount of values of the same type."),
        p(
          revealImg("objects-tenElementArray.gif")
        )
      ),
      subsection("")(
        p("Declaration of array variable using '[]', e.g."),
        prettyCode(java,
          """
            |int [] myNumbers;
          """.
            stripMargin
        ),
        p("A variable called 'myNumbers' that contains an array of integers (whole numbers)")
      ),
      subsection("")(
        p("Initialisation by assigning memory: "),
        prettyCode(java,
          """
            |myNumbers= new int[3];
          """.
            stripMargin
        ),
        p("Results in an array with space for 3 integers (whole numbers)")
      ),
      subsection("")(
        p("Initialisation during declaration by immediatly assigning its content "),
        prettyCode(java,
          """
            |int [] myNumbers = { 9, 8, 7};
          """.
            stripMargin
        ),
        p("Results in an array with space for 3 numbers, which is occupied by the values 9, 8 and 7.")

      ),
      subsection("")(
        p("Assigning a value to a specific index."),
        p(
          revealImg("objects-tenElementArray.gif")
        ),
        prettyCode(java,
          """
            |myNumbers[1] = 12;
          """.
            stripMargin
        ),
        ul(
          li("index: 1  (2nd position in the array, counting starts at 0)"),
          li("value at this location: 12")
        )
      ),
      subsection("")(
        p(
          revealImg("objects-tenElementArray.gif")
        ),
        p("Request values at a specific index"),
        prettyCode(java,
          """
            |int numberAtThe2ndPlace = myNumbers[1];
          """.
            stripMargin
        ),
        ul(
          li("assign value from index 1 to the variable 'numberAtThe2ndPLace' variable")
        )
      ),
      subsection("")(
        p(
          "The length of an array can be obtained from the 'length' field"
        ),
        prettyCode(java,
          """
            |myNumbers.length;
          """.
            stripMargin
        )
      ),
      subsection("")(
        p("Create an array of 3 elements and print these to screen"),
        p("What happens if you use an incorrect index?")

      ),
      subsection("")(
        p("Input arguments are passed to the 'main' method as: "),
        prettyCode(java,
          """
            |String[] args
          """.
            stripMargin
        ),
        p("Assignment: Print 1st argument. ")(fragment)
      )
    )
}
