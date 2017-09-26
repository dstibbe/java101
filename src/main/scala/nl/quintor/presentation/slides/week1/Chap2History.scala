package nl.quintor.presentation.slides.week1

import nl.quintor.presentation.Section
import nl.quintor.reveal._

import scalatags.Text.all._

object Chap2History extends Section {
  override def content =
    section("History")(
      ul(
        li("Intended for television"),
        li("Developed by Sun"),
        li("'Oak' -> 'Green' -> 'Java'"),
        li("1991: Start of development"),
        li("1995: Java 1.0"),
        li("2010: Sun bought by Oracle"),
        li("2014: Java 8"),
        li("2017: (21-09) Java 9")
      )
    )
}
