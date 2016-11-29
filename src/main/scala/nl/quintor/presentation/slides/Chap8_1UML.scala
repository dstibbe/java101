package nl.quintor.presentation.slides

import nl.quintor.presentation.Section
import nl.quintor.reveal._

import scalatags.Text.all._

object Chap8_1UML extends Section {
  override def content =
    section("UML")(
      subsection(""){
        p("Unified Modelling Language")
      },
      subsection("")(
        revealImg("uml-base.png")(attr("width") := "200")
      ),
      subsection("")(
        p(
          revealImg("uml-filled.png")(attr("width") := "200")
        ),
        ul(
          li("- : private"),
          li("+ : public")
        )
      )
    )

}
