package nl.quintor.presentation.slides.week2

import nl.quintor.presentation.Section
import nl.quintor.reveal._

import scalatags.Text.all._

object W2C1Overview extends Section {
  override def content =
    section("Week2 - Overview")(
      ul(
        li("Review"),
        li("Homework assignment"),
        li("Scope"),
        li("String"),
        li("Maven"),
        li("Unit testing")
      )
    )
}
