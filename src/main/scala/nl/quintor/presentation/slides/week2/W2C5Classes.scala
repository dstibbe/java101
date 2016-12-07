package nl.quintor.presentation.slides.week2

import nl.quintor.presentation.Section
import nl.quintor.reveal.{prettyCode, subsection, _}

import scalatags.Text.all._

object W2C5Classes extends Section {
  override def content =
    section("Review: Classes")(
      subsection()(
        p("Klasse vs Object")
      ),
      subsection()(
        p("Bestandsnaam"),
        p("1 klasse per bestand")
      ),
      subsection()(
        p("Hoe definieer je een klasse?"),
        ul(
          li("zichtbaarheid"),
          li("'class' keyword"),
          li("naam"),
          li("het lichaam/codeblock van de klasse (method body)")
        )(fragment)
      ),
      subsection()(
        p("Hoe instantieer je een object?"),
        p("Je roept zijn constructor aan")(fragment),
        p("Wat is de constructor?")(fragment),
        p("Een speciale methode, met dezelfde naam als de klasse, " +
          "welke het object initialiseert")(fragment),
        p("Bestaat er een constructor, zelfs als je er geen hebt gemaakt?")(fragment),
        p("Ja, de default constructor")(fragment)

      )
    )
}
