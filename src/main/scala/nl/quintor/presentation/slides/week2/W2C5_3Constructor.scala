package nl.quintor.presentation.slides.week2

import nl.quintor.presentation.Section
import nl.quintor.reveal.{subsection, _}

import scalatags.Text.all._

object W2C5_3Constructor extends Section {
  override def content =
    section("Review: Classes - constructor")(
      subsection()(
        p("Wat zijn constructors"),
        p("Speciale methoden voor het initialiseren van een object.")(fragment)
      ),
      subsection()(
        p("Default constructor bestaat als je niets hebt gedefinieerd.")
      ),
      subsection()(
        p("Hoe definieer je constructor"),
        ul(
          li("Zelfde als methode"),
          li("Geen return type"),
          li("Zelfde naam als klasse")
        )(fragment)
      ),
      subsection()(
        p("Meerdere constructors mogelijk"),
        p("Net als methoden, vereist wel verschil in parameters")
      )
    )
}
