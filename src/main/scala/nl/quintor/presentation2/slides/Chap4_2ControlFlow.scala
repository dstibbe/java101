package nl.quintor.presentation2.slides

import nl.quintor.presentation.Section
import nl.quintor.reveal._

import scalatags.Text.all._

object Chap4_2ControlFlow extends Section {
  override def content =
    section("Control Flow")(
      subsection("")(
        p("if-then-else, doe iets als een conditie waar is, zo niet, do iets anders"),
        prettyCode(java,
          """
            | if( {TESTWAARDE} ){
            |   .. doe als waar ..
            | } else {
            |   .. doe als niet waar ..
            | }
          """.
            stripMargin
        ),
        prettyCode(java,
          """
            | int testWaarde = 12;
            |
            | if( testWaarde < 15 ){
            |   System.out.println("testWaarde binnen bereik");
            | } else {
            |   System.out.println("testWaarde buiten bereik");
            | }
          """.
            stripMargin
        )(fragment)
      ),
      subsection("")(
        ul("Equality and Relational Operators")(
          li("== gelijk aan"),
          li("!= ONgelijk aan"),
          li(">  groter dan"),
          li(">= groter dan of gelijk aan"),
          li("< kleiner dan"),
          li("<= kleiner dan of gelijk aan")
        )
      ),
      subsection("")(
        p(
          ul("Arithmetic Operators")(
            li("* : vermenigvuldigen"),
            li("/ : delen"),
            li("- : aftrekken"),
            li("+ : optellen"),
            li("% : modulo")
          )
        ),
        p(
          ul("Unary Arithmetic Operators")(
            li("++ : verhoog waarde met 1"),
            li("-- : verlaag waarde met 1"),
            li("! : logisch complement")
          )
        )
      ),
      subsection("")(
        p("while, doe iets zolang de conditie waar is"),
        prettyCode(java,
          """
            | while( {TESTWAARDE} ){
            |   .. doe zolang het waar is ..
            | }
          """.
            stripMargin
        ),
        prettyCode(java,
          """
            | int testWaarde = 12;
            |
            | while( testWaarde < 15 ){
            |   System.out.println("We gaan door");
            |   testWaarde = testWaarde + 1;
            | }
          """.
            stripMargin
        )(fragment)
      ),
      subsection("")(
        p("for, compacte manier om over range van waarden te itereren"),
        prettyCode(java,
          """
            | for( {INITIALISATIE}; {TESTWAARDE}; {INCREMENT}){
            |   ... statements ...
            | }
          """.
            stripMargin
        ),
        prettyCode(java,
          """
            | for( int testWaarde = 12; testWaarde < 15 ; testWaarde++ ){
            |   System.out.println("We gaan door");
            | }
          """.
            stripMargin
        )(fragment)
      ),
      subsection("")(
        p("for, kan ook over een array itereren"),
        prettyCode(java,
          """
            | for( TYPE naam : ARRAY){
            |   ... statements ...
            | }
          """.
            stripMargin
        ),
        prettyCode(java,
          """
            | int [] mijnWaarden = { 3,4,5 };
            |
            | for( int waarde : mijnWaarden ){
            |   System.out.println(waarde);
            | }
          """.
            stripMargin
        )(fragment)
      ),
      subsection("")(
        p("Tel de waarden 1 t/m 10 op en druk deze af")

      ),
      subsection("")(
        p("Druk alle input waarden van de applicatie af.")
      )
    )
}
