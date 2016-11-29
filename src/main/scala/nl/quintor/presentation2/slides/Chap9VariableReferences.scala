package nl.quintor.presentation2.slides

import nl.quintor.presentation.Section
import nl.quintor.reveal._

import scalatags.Text.all._

object Chap9VariableReferences extends Section {
  override def content =
    section("Variable References")(
      subsection("")(
        ul("Primitieve variabelen")(
          li("int, float, double, char, byte, long, short, byte"),
          li("Waarde wordt opgeslagen in variabele."),
          li("Zijn geen objecten")
        ),
        prettyCode(java,
          """
            | int a = 12;
            | System.out.println( a );
          """.stripMargin
        )
      ),
      subsection("")(
        ul("Referentie variabelen")(
          li("Refereert naar object"),
          li("Variabele bevat adres (de referentie naar) van het object")
        ),
        prettyCode(java,
          """
            |...
            |Klant jakie = new Klant("Jakie", "ChocolateFactory", "Munchen");
            |System.out.println( jakie ); // output: Klant@28d93b30
            |...
          """.stripMargin
        )
      ),
      subsection("")(
        ul("NullPointerException")(
          li("Wanneer men methode/variabele wil benaderen bij een niet geinstantieerde variabele")
        ),
        prettyCode(java,
          """
            |...
            |Klant jakie ; //Let op! Roep hier geen constructor aan.
            |jakie.getNaam(); // NullPointerException. 'jakie' wijst
            |                 // niet naar een bestaand object.
            |...
          """.stripMargin
        )
      )
    )

}
