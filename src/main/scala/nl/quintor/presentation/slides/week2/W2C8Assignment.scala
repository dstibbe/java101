package nl.quintor.presentation.slides.week2

import nl.quintor.presentation.Section
import nl.quintor.reveal.{subsection, _}

import scalatags.Text.all._

object W2C8Assignment extends Section {
  override def content =
    section("Opdracht - voetbal")(
      subsection()(
        p("Implementeer het volgende: "),
        revealImg("voetballer.png")(attr("width") := "600start"),
        p("En print een voetballer")
      ),
      subsection()(
        p("Implementeer het volgende: "),
        revealImg("elftal.png")(attr("width") := "600"),
        p("toString geeft een String terug met het hele elftal erin."),
        p("Maak een elftal en druk deze af")
      )
    )
}
