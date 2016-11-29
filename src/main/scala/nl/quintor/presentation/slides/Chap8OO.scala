package nl.quintor.presentation.slides

import nl.quintor.presentation.Section
import nl.quintor.reveal._

import scalatags.Text.all._

object Chap8OO extends Section {
  override def content =
    section("Object Orientatie")(
      subsection("")(
        ul("information hiding")(
          li("Beschermen van interne gegevens klasse"),
          li("Door de velden 'private' te maken."),
          li("Interne werking kan wijzigen zonder dat andere klassen kapot gaan.")
        )
      ),
      subsection("")(
        prettyCode(java,
          """
            |public class Klant{
            |   private String naam;
            |   private String adres;
            |   private String plaats;
            |
            |   ....
            |}
          """.stripMargin
        ),
        ul(
          li("'private' - enkel de klasse zelf kan er bij")
        ),
        prettyCode(java,
          """
            |...
            |Klant jakie = new Klant("Jakie", "ChocolateFactory", "Munchen");
            |jakie.naam = "Test" ; //FAALT
            |...
          """.stripMargin
        )
      ),
      subsection("")(
        p("Conventie voor het lezen en schrijven naar velden:"),
        p("Getters en Setters")
      ),
      subsection("")(
        p("Getter"),
        p("Methode voor het opvragen van de waarde van een veld"),
        blockquote("public TYPE get{Field}()"),
        prettyCode(java,
          """
            |public class Klant{
            |  ...
            |  public String getNaam(){
            |     return naam;
            |  }
            |  ...
            |}
          """.stripMargin
        ),
        prettyCode(java,
          """
            | System.out.println(jakie.getNaam());
          """.stripMargin
        )
      ),
      subsection("")(
        p("Setter"),
        p("Methode voor het veranderen van de waarde van een veld"),
        blockquote("public void set{Field}(TYPE waarde)"),
        prettyCode(java,
          """
            |public class Klant{
            |  ...
            |  public void setNaam(String nieuweNaam){
            |     naam = nieuweNaam;
            |  }
            |  ...
            |}
          """.stripMargin
        ),
        prettyCode(java,
          """
            | jakie.setNaam("Willie");
            | System.out.println(jakie.getNaam());
          """.stripMargin
        )
      )
    )

}
