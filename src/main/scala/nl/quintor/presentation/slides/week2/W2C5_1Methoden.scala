package nl.quintor.presentation.slides.week2

import nl.quintor.presentation.Section
import nl.quintor.reveal.{subsection, _}

import scalatags.Text.all._

object W2C5_1Methoden extends Section {
  override def content =
    section("Review: Classes - methoden")(
      subsection()(
        p("methode, wat is dit en hoe definieer je deze?"),
        ul(
          li("zichtbaarheid"),
          li("return type"),
          li("naam"),
          li("parameter lijst"),
          li("het lichaam/codeblock van de methode (method body)")
        )(fragment)
      ),
      subsection()(
        p("Hoe retourneer je iets vanuit een methode?"),
        p("return")(fragment)
      ),
      subsection()(
        p("Voorbeeld"),
        prettyCode(java,
          """
            |class Hond{
            |   public int getAantalPoten(){
            |     return 4;
            |   }
            |   ...
            |}
          """.
            stripMargin
        )
      ),
      subsection()(
        p("Hoe geef je aan dat een methode niets teruggeeft?"),
        p("void")(fragment)
      ),
      subsection()(
        p("Wat is de (static) 'main' methode? "),
        p("Een methode die als startpunt dient voor je applicatie. Gebruik je maar in 1 klasse.")(fragment)
      ),
      subsection()(
        p("Een methode kan parameters hebben."),
        p("Parameter lijst tussen (...) ")(fragment),
        p("Elke parameter wordt gedefinieerd op zelfde manier als variabele.")(fragment),
        p("Parameters kun je zien als zijnde variabelen waar je de waarde voor meegeeft bij aanroep van een methode")(fragment),
        p("Parameters bestaan enkel in het bereik van de methode.")(fragment)
      ),
      subsection()(
        p("Voorbeeld"),
        prettyCode(java,
          """
            |class Hond{
            |   public String consumeert(String voer, String drinken){
            |     return "De hond eet " + voer + " en drinkt " + drinken;
            |   }
            |   ...
            |}
          """.
            stripMargin
        ),
        prettyCode(java,
          """
            |class MyMain{
            |  public void static main(String[] args){
            |    Hond fikkie = new Hond();
            |    String boodschap = fikkie.consumeert("hondenvoer", "water");
            |    System.out.println(boodschap);
            |  }
            |}
          """.
            stripMargin
        )
      ),
      subsection()(
        p("Meerder methoden mogelijk met zelfde naam"),
        p("Maar, dan moeten ze wel andere parameters hebben!")(fragment),
        p("Return type mag verschillen, maar hoeft niet")(fragment)
      ),
      subsection()(
        p("Goed"),
        prettyCode(java,
          """
            |class Hond{
            |  public String consumeert(String voedsel){
            |    return "De hond eet " + voer;
            |  }
            |
            |  public String consumeert(String voer, String drinken){
            |    return "De hond eet " + voer + " en drinkt " + drinken;
            |  }
            |
            |  public int consumeert(int aantal){
            |    //dit is dus toegestaan
            |    return 42;
            |  }
            |}
          """.
            stripMargin
        )
      ),
      subsection()(
        p("Fout"),
        prettyCode(java,
          """
            |class Hond{
            |  public String consumeert(String voedsel){
            |    return "De hond eet " + voer;
            |  }
            |
            |  public String consumeert(String drinken){
            |    return "De hond drinkt " + drinken;
            |  }
            |}
          """.
            stripMargin
        )
      ),
      subsection()(
        p("THIS"),
        p("speciaal keyword om in een klasse aan te geven dat je naar zijn eigen velden en/of methoden" +
          "verwijst")(fragment),
        prettyCode(java,
          """
            |class Hond{
            |  private int aantalPoten;
            |
            |  public void setAantalPoten(int aantalPoten){
            |     this.aantalPoten = aantalPoten;
            |  }
            |   ...
            |}
          """.
            stripMargin
        )(fragment)
      )
    )
}
