package nl.quintor.presentation.slides.week2

import nl.quintor.presentation.Section
import nl.quintor.reveal.{subsection, _}

import scalatags.Text.all.{p, _}

object W2C12Cucumber extends Section {
  override def content =
    section("Cucumber")(
      subsection()(
        p("A framework for behavior driven testing"),
        p(a(href := "https://cucumber.io/")("https://cucumber.io/"))
      )
  )


}
