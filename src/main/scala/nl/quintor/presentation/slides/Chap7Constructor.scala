package nl.quintor.presentation.slides

import nl.quintor.presentation.Section
import nl.quintor.reveal._

import scalatags.Text.all._

object Chap7Constructor extends Section {
  override def content =
    section("Constructor")(
      p( "Speciale methode voor het initializeren van een object."),
      subsection("")(
        prettyCode(java,
          """
            |Klant jakie = new Klant();
          """.stripMargin
        ),
        ul(
          li("Constructor heeft altijd zelfde naam als klasse ('Klant')"),
          li("Constructor zonder argumenten is 'default constructor'"),
          li("'default constructor' bestaat altijd als er geen andere constructor bestaat.")
        )
      ),
      subsection("")(
        prettyCode(java,
          """
            |public class Klant{
            |   ...
            |   public Klant(){
            |     System.out.println("Een nieuwe klant is gebouwd");
            |   }
            |}
          """.stripMargin
        ),
        ul(
          li("Constructor specificeer je op zelfde manier als methode."),
          li("MAAR constructor heeft geen return waarde."),
          li("Bij aanroep van de constructor zal nu een bericht worden geprint.")
        )
      ),
      subsection("")(
        p("We vervangen de constructor met: "),
        prettyCode(java,
          """
            |public class Klant{
            |   ...
            |   public Klant(String nieuweNaam, String nieuwAdres, String nieuwePlaats){
            |     naam = nieuweNaam;
            |     adres = nieuwAdres;
            |     plaats = nieuwePlaats;
            |   }
            |}
          """.stripMargin
        ),
        ul(
          li("Een constructor met 3 argumenten."),
          li("De argumenten worden aan de velden van de Klant klasse toegekend.")
        )
      ),
      subsection("")(
        prettyCode(java,
          """
            |Klant jakie = new Klant(); // FAALT
          """.stripMargin
        ),
        p("Want de default constructor 'Klant()' is vervangen."),
        prettyCode(java,
          """
            |Klant jakie = new Klant("Jakie", "ChocolateFactory", "Munchen");
          """.stripMargin
        )
      )
    )

}
