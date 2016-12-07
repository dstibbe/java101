package nl.quintor.presentation.slides.week2

import nl.quintor.presentation.Section
import nl.quintor.reveal._

import scalatags.Text.all._

object W2C2Tekens extends Section {
  override def content =
    section("Review: Speciale tekens")(
      table(
        tr(
          td(";"),td("Afsluiting van een opdracht")
        )(fragment),
        tr(
          td("{...}", td("Aanduiding van een codeblock (groep van opdrachten)"))
        )(fragment),
        tr(
          td("(...)"), td("Aanduiding van method argumenten.")
        )(fragment),
        tr(
          td("[] / [n]"), td("Indicatie van array/array index.")
        )(fragment)
      )
    )
}
