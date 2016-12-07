package nl.quintor.presentation.slides.week2

import nl.quintor.presentation.Section
import nl.quintor.reveal.{subsection, _}

import scalatags.Text.all._

object W2C5_1Velden extends Section {
  override def content =
    section("Review: Classes - velden")(
      subsection()(
        p("Ook wel 'attributen' genoemd."),
        p("Speciale variabelen die voor de hele klasse gelden")(fragment)
      ),
      subsection()(
        p("Hoe definieer je deze?"),
        ul(
          li("zichtbaarheid"),
          li("type"),
          li("naam"),
          li("optioneel: start waarde")
        )(fragment)
      ),
      subsection()(
        p("Voorbeeld"),
        prettyCode(java,
          """
            |class Hond{
            |   String naam;
            |   ...
            |}
          """.
            stripMargin
        )
      ),
      subsection()(
        p("Voorbeeld met initialisatie"),
        prettyCode(java,
          """
            |class Hond{
            |   String naam = "onbekende naam";
            |   ...
            |}
          """.
            stripMargin
        )
      )

    )
}
