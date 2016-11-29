package nl.quintor.presentation.slides

import nl.quintor.presentation.Section
import nl.quintor.reveal._

import scalatags.Text.all._

object Chap6Methoden extends Section {
  override def content =
    section("Methoden")(
      subsection("")(
        prettyCode(java,
          """
            |
            |public class Klant{
            |  ...
            |   public String buildString(){
            |      ...
            |   }
            |   ...
            |}
          """.stripMargin
        ),
        ul(
          li("'public' = toegankelijk voor iederen\""),
          li("String - methode geeft een String object terug"),
          li("toString - methode naam")
        )
      ),
      subsection("")(
        prettyCode(java,
          """
            |public String buildString(){
            |   String bericht = naam + " woont op " + adres + " in " + plaats;
            |   return bericht;
            |}
          """.stripMargin
        ),
        ul(
          li("'+' - operatie voor het samenvoegen van String objecten"),
          li("return - verlaat de methode en geef de waarde mee terug")
        )
      ),
      subsection("")(
        prettyCode(java,
          """
            |Klant jakie = new Klant();
            |jakie.naam = "Jakie";
            | ....
            |String jakieTekst = jakie.buildString();
            |System.out.println( jakieTekst );
          """.stripMargin
        )
      ),
      subsection("")(
        prettyCode(java,
          """
            |public class Klant{
            |   ...
            |   public void verhuistNaar(String nieuwAdres, String nieuwePlaats){
            |     adres = nieuwAdres;
            |     plaats = nieuwePlaats;
            |   }
            |   ...
            |}
          """.stripMargin
        ),
        prettyCode(java,
          """
            |jakie.verhuistNaar("twixFactory", "Left town");
          """.stripMargin
        ),
        ul(
          li("'void' - betekent dar deze methode geen return waarde heeft"),
          li("De methode verwacht 2 argumenten, van het type String"),
          li("De argumenten worden toegekend aan twee velden van de Klant klasse")
        )
      )
    )

}
