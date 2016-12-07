package nl.quintor.presentation.slides.week2

import nl.quintor.presentation.Section
import nl.quintor.reveal.{subsection, _}

import scalatags.Text.all._

object W2C7Scope extends Section {
  override def content =
    section("Variabele scope")(
      subsection()(
        p("Scope is de reikwijdte van een variabele"),
        p("Deze gaat nooit verder dan het codeblock {..} waarin hij gedefinieerd is.")(fragment),
        p("Bereikbaar in geneste codeblocks.")(fragment),
        p("Niet bereikbaar in codeblocks erbuiten.")(fragment)
      ),
      subsection()(
        p("Onder codeblocks valt alles met {...}, dus ook if, while, for, methode definities etc.")
      )
    )
}
