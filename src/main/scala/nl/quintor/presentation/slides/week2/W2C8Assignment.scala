package nl.quintor.presentation.slides.week2

import nl.quintor.presentation.Section
import nl.quintor.reveal.{subsection, _}

import scalatags.Text.all._

object W2C8Assignment extends Section {
  override def content =
    section("Opdracht - soccer")(
      subsection()(
        p("Implement the following: "),
        revealImg("voetballer.png")(attr("width") := "600start"),
        p("And print the soccer player (=Voetballer)")
      ),
      subsection()(
        p("Implement the following: "),
        revealImg("elftal.png")(attr("width") := "600"),
        p("toString returns  a String representing the whole soccer team (=elftal)."),
        p("Create a soccer team and print this.")
      )
    )
}
