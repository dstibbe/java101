package nl.quintor.presentation.slides.week2

import nl.quintor.presentation.Section
import nl.quintor.reveal.{subsection, _}

import scalatags.Text.all._

object W2C9String extends Section {
  override def content =
    section("String")(
      subsection()(
        p("String is een immutable klasse"),
        p("Immutable houdt in dat de inhoud van een object van deze klasse nooit meer wijzigt nadat deze is geinstantieerd.")(fragment)
      ),
      subsection()(
        p("Alle operaties die je uitvoert op een string die deze zou wijzigen, creeren een nieuwe String. Het origineel blijft onaangetast.")
      ),
      subsection()(
        prettyCode(java,
          """
            |String mijnNaam = "John";
            |String mijnAchternaam = "Doe";
            |// Dit creert een nieuwe string.
            |String mijnHeleNaam = mijnNaam + " " + mijnAchternaam;
          """.
            stripMargin
        )
      )
    )
}
