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
          li("public - toegankelijk voor iederen\""),
          li("String - methode geeft een String object terug"),
          li("'buildString' - methode naam")
        )
      ),
      subsection("")(
        prettyCode(java,
          """
            |public class Klant{
            |  ...
            |  public String buildString(){
            |     String bericht = naam + " woont op " + adres + " in " + plaats;
            |     return bericht;
            |  }
            |  ...
            |}
          """.stripMargin
        ),
        ul(
          li("'+' - operatie voor het samenvoegen van String objecten"),
          li("return - verlaat de methode en geef de waarde mee terug")
        )
      ),
      subsection("")(

        p("Ook methoden van een object benadert men dmv '.' operator:"),
        prettyCode(java,
          """
            |jakie.buildString();
          """.stripMargin
        ),
        p("Dit roept de methode 'buildString()' aan van het object waar 'jakie' naar verwijst.")
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
        p("Methode kan meerdere argumenten ontvangen, deze worden tussen de " +
          "'()' gespecificieerd. Bijvoorbeeld:"),
        prettyCode(java,
          """
            |public String xyz(int arg1, String arg2){
            |  ...
            |}
          """.stripMargin
        ),
        p("Deze methode ontvangt twee argumenten, een int en een String, met de namen" +
          "'arg1' en 'arg2'.")
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
        ul(
          li("'void' - betekent dar deze methode geen return waarde heeft"),
          li("De methode verwacht 2 argumenten, van het type String"),
          li("De argumenten worden toegekend aan twee velden van de Klant klasse")
        )
      ),
      subsection("")(
        prettyCode(java,
          """
            |jakie.verhuistNaar("twixFactory", "Left town");
          """.stripMargin
        ),
        ul(
          li("'roept de methode 'verhuistNaar' aan met twee strings")
        )
      )
    )

}
