package nl.quintor.presentation.slides.week1

import nl.quintor.presentation.Section
import nl.quintor.reveal._

import scalatags.Text.all._

object Chap1Overview extends Section {
  override def content =
    section("Overview")(
      ul(
        li("Class"),
        li("Object"),
        li("Attributes"),
        li("Methods")
      )
    )
}
