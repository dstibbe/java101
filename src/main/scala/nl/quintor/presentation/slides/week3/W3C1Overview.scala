package nl.quintor.presentation.slides.week3

import nl.quintor.presentation.Section
import nl.quintor.reveal._

import scalatags.Text.all._

object W3C1Overview extends Section {
  override def content =
    section("Week3 - Overview")(
      ul(
        li("Review"),
        li("Homework assignment"),
        li("Maven"),
        li("Git"),
        li("Unit testing"),
        li("Cucumber")
      )
    )
}