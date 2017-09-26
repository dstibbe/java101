package nl.quintor.presentation.slides.week1

import nl.quintor.presentation.Section
import nl.quintor.reveal._

import scalatags.Text.all._

object Chap4_2ControlFlow extends Section {
  override def content =
    section("Control Flow")(
      subsection("")(
        p("if-then-else, do something if a condition is true, if not, do something different"),
        prettyCode(java,
          """
            | if( {TEST-VALUE} ){
            |   .. do when true ..
            | } else {
            |   .. do otherwise..
            | }
          """.
            stripMargin
        ),
        prettyCode(java,
          """
            | int testValue = 12;
            |
            | if( testValue < 15 ){
            |   System.out.println("testValue within range");
            | } else {
            |   System.out.println("testValue outside range");
            | }
          """.
            stripMargin
        )
      ),
      subsection("")(
        ul("Equality and relational Operators")(
          li("== equal"),
          li("!= unequal"),
          li(">  larger than"),
          li(">= larger than or equal to"),
          li("< smaller than"),
          li("<= smaller than or equal to")
        )
      ),
      subsection("")(
        p(
          ul("Mathematical Operators")(
            li("* : multiply"),
            li("/ : divide"),
            li("- : subtract"),
            li("+ : add"),
            li("% : modulo")
          )
        ),
        p(
          ul("Unary Arithmetic Operators")(
            li("++ : increase value by 1"),
            li("-- : decrease value by 1"),
            li("! : logical complement")
          )
        )
      ),
      subsection("")(
        p("while: repeat as long as the condition holds true"),
        prettyCode(java,
          """
            | while( {TEST-VALUE} ){
            |   ... repeat while true ...
            | }
          """.
            stripMargin
        ),
        p("Assignment: print 1 to 10")(fragment)
      ),
      subsection("")(
        prettyCode(java,
          """
            | int testValue = 1;
            |
            | while( testValue <= 10 ){
            |   System.out.println(testValue);
            |   testValue = testValue + 1;
            | }
          """.
            stripMargin
        )
      ),
      subsection("")(
        p("for: a compact way to iterate over a range of values"),
        prettyCode(java,
          """
            | for( {INITIALISATION}; {TEST}; {INCREMENT}){
            |   ... statements ...
            | }
          """.
            stripMargin
        ),
        prettyCode(java,
          """
            | for( int testValue = 1; testValue <= 10 ; testValue++ ){
            |   System.out.println(testValue);
            | }
          """.
            stripMargin
          )(fragment),
        p("Equal to the previously mentioned 'while' loop")(fragment)
      ),
      subsection("")(
        p("for, can also iterate over the elements of an array"),
        prettyCode(java,
          """
            | for( TYPE name : ARRAY){
            |   ... statements ...
            | }
          """.
            stripMargin
        ),
        prettyCode(java,
          """
            | int [] myValues = { 3,4,5 };
            |
            | for( int value : myValues ){
            |   System.out.println(value);
            | }
          """.
            stripMargin
        )(fragment)
      ),
      subsection("")(
        p("Add the values 1 to 10 and print them.")

      ),
      subsection("")(
        p("Print all input values of the application.")
      )
    )
}
