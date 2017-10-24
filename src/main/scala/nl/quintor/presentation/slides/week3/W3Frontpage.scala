package nl.quintor.presentation.slides.week3

import nl.quintor.presentation.Section
import nl.quintor.reveal._

import scalatags.Text.all._

object W3Frontpage extends Section {
  override def content =
    frontpage("Week3: Testing")(
      revealImg("duke.png")(attr("width") := "200"),
      p(
        small("Created by ",
          a(href := "http://dstibbe.nl")("David Stibbe"),
          " (",
          a(href := "https://twitter.com/dstibbe")("@dstibbe"),
          ")"

        )
      ),
      p(
        revealImg("quintor.png")
      )
    )
}
