package nl.quintor.presentation.slides

import nl.quintor.presentation.Section
import nl.quintor.reveal._

import scalatags.Text.all._

object Chap4_1Arrays extends Section {
  override def content =
    section("Arrays")(
      subsection("")(
        p("Een array is een container object dat een vast aantal waarden van eenzelfde type bevat."),
        p(
          revealImg("objects-tenElementArray.gif")
        )
      ),
      subsection("")(
        p("Variabele declaratie dmv '[]', bijvoorbeeld"),
        prettyCode(java,
          """
            |int [] mijnGetallen;
          """.
            stripMargin
        ),
        p("Een variabele die een array bevat van integers (hele getallen)")
      ),
      subsection("")(
        p("Initialisatie door geheugen toe te wijzen: "),
        prettyCode(java,
          """
            |mijnGetallen = new int[3]; //reserveer geheugen voor 3 elementen
          """.
            stripMargin
        ),
        p("Resulteert in een array met plek voor 3 integers (hele getallen)")
      ),
      subsection("")(
        p("Initialisatie tijdens declatie door direct de inhoud toe te kennen: "),
        prettyCode(java,
          """
            |int [] mijnGetallen = { 9, 8, 7}; //initialiseer array met 3 specifieke elementen
          """.
            stripMargin
        ),
        p("Resulteert in een array met plek voor 3 integers (hele getallen). De drie plekken " +
          "zijn gevuld met de waarden 9, 8 en 7")

      ),
      subsection("")(
        p("Waarde toekennen aan specifieke index"),
        p(
          revealImg("objects-tenElementArray.gif")
        ),
        prettyCode(java,
          """
            |mijnGetallen[1] = 12;
          """.
            stripMargin
        ),
        ul(
          li("index: 1  (2e positie in de array)"),
          li("waarde op deze plek: 12")
        )
      ),
      subsection("")(
        p(
          revealImg("objects-tenElementArray.gif")
        ),
        p("Opvragen element met specifieke index"),
        prettyCode(java,
          """
            |int getalOp2ePlek = mijnGetallen[1];
          """.
            stripMargin
        ),
        ul(
          li("index: 1  (2e positie in de array)"),
          li("kent deze waarde toe aan 'getalOp2ePlek' variabele")
        )
      ),
      subsection("")(
        p(
          "De lengte van een array verkrijg je door het 'length' veld op te vragen."
        ),
        prettyCode(java,
          """
            |mijnGetallen.length; // geeft 3
          """.
            stripMargin
        )
      ),
      subsection("")(
        p("Creeer array van 3 elementen en druk deze vervolgens af"),
        p("Wat gebeurt er als je een 'verkeerde' index gebruikt?")

      ),
      subsection("")(
        p("Druk input argumenten af. ")
      )
    )
}
