package nl.quintor.presentation2.slides

import nl.quintor.presentation.Section
import nl.quintor.reveal._

import scalatags.Text.all._

object Chap4_1Arrays extends Section {
  override def content =
    section("Arrays")(
      subsection("")(
        p(
          revealImg("objects-tenElementArray.gif")
        ),
        p("Variabele declaratie dmv '[]', bijvoorbeeld"),
        prettyCode(java,
          """
            |int [] mijnGetallen;
          """.
            stripMargin
        ),
        p("Twee manieren van initialisatie"),
        prettyCode(java,
          """
            |mijnGetallen = new int[3]; //reserveer geheugen voor 3 elementen
          """.
            stripMargin
        ),
        prettyCode(java,
          """
            |mijnGetallen = { 9, 8, 7}; //initialiseer array met 3 specifieke elementen
          """.
            stripMargin
        )

      ),
      subsection("")(
        p(
          "De lengte van een array verkrijg je door het 'length' veld op te vragen."
        ),
        prettyCode(java,
          """
            |int aantalGetallen = mijnGetallen.length; // geeft 3
          """.
            stripMargin
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
        p("Waarde toekennen aan specifieke index"),
        prettyCode(java,
          """
            |mijnGetallen[1] = 12;
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
