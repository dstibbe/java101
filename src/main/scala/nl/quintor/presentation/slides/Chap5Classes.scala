package nl.quintor.presentation.slides

import nl.quintor.presentation.Section
import nl.quintor.reveal._

import scalatags.Text.all._

object Chap5Classes extends Section {
  override def content =
    section("Klassen")(
      subsection("")(
        ul(
          li("Klasse is een Bouwtekening"),
          li("object is het bouwwerk")
        )
      ),
      subsection("")(
        ul("Klasse heeft ")(
          li("naam, begint altijd met een hoofdletter"),
          li("attributen (gegevensvelden)"),
          li("methoden (operaties)"),
          li("eigen bestand met overeenkomende naam")
        )
      ),
      subsection("")(
        prettyCode(java,
          """
            |public class Klant {
            |    public String naam;
            |    public String adres;
            |    public String plaats;
            |}
          """.stripMargin
        ),
        ul(
          li("Klasse naam : 'Klant'")(fragment),
          li("3 attributen (gegevensvelden)")(fragment),
          li("alle attributen 'public' = toegankelijk voor iederen")(fragment),
          li("zit in een bestand genaamd 'Klant.java'")(fragment)
        )
      ),
      subsection("")(
        prettyCode(java,
          """
            |Klant jakie = new Klant();
          """.stripMargin
        ),
        ul(
          li("Aanmaken van een object van type Klant"),
          li("keyword 'new' gevolgd door constructor"),
          li("Constructor in dit geval:  'Klant()'")
        )

      ),
      subsection("")(
        prettyCode(java,
          """
            |Klant jakie = new Klant();
          """.stripMargin
        ),
        ul("variabele gedefinieerd: ")(
          li("TYPE = Klant class"),
          li("naam = jakie"),
          li("WAARDE = een Klant object")
        )(fragment)
      ),

      subsection("")(
        p("Benaderen van velden en methoden van een object dmv '.' operator:"),
        prettyCode(java,
          """
            |jakie.naam = "Jakie"; // schrijven
            |System.out.println(jakie.naam); //lezen
          """.stripMargin
        ),
        ul(
          li("Eerst wordt 'Jakie' naar het 'naam' veld geschreven."),
          li("Vervolgens wordt 'naam' veld gelezen.")
        )
      ),
      subsection("")(
        prettyCode(java,
          """
            |Klant jakie = new Klant();
            |
            |jakie.naam = "Jakie";
            |jakie.adres = "Chocoladefabriek";
            |jakie.plaats = "Munchen";
          """.stripMargin
        )
      )
    )

}
