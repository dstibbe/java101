package nl.quintor.presentation2.slides

import nl.quintor.presentation.Section
import nl.quintor.reveal._

import scalatags.Text.all._

object Chap2History extends Section {
  override def content =
    section("History")(
      ul(
        li("Oorsprokelijk voor digitale televisie"),
        li("Ontwikkeld door Sun"),
        li("'Oak' -> 'Green' -> 'Java'"),
        li("1991: Start van de ontwikkeling"),
        li("1995: Java 1.0"),
        li("2010: Sun gekocht door Oracle"),
        li("2014: Java 8")
      )
    )
}
