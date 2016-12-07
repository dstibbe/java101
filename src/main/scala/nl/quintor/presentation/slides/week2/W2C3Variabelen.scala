package nl.quintor.presentation.slides.week2

import nl.quintor.presentation.Section
import nl.quintor.reveal._

import scalatags.Text.all._

object W2C3Variabelen extends Section {
  override def content =
    section("Review: veriabelen")(
      ul(
        li("Primitieven vs referenties"),
        li("Declaratie"),
        li("Initialisatie")
      )
    )
}
