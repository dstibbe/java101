package nl.quintor.presentation.slides.week2

import nl.quintor.presentation.Section
import nl.quintor.reveal.{subsection, _}

import scalatags.Text.all._

object W2C6ControlFlow extends Section {
  override def content =
    section("Review: Control Flow")(
      subsection()(
        p("3 type control flows behandeld"),
        ol(
          li("if-else"),
          li("while"),
          li("for")
        )(fragment)
      ),
      subsection()(
        p("if"),
        p("Als conditie waar voor eerste codeblock uit. Zo niet, voor optionele 'else' codeblock uit")(fragment),
        prettyCode(java,
          """
            | if( {TESTWAARDE} ){
            |   .. doe als waar ..
            | } else {
            |   .. doe als niet waar ..
            | }
          """.
            stripMargin
        )(fragment)
      ),
      subsection()(
        p("while"),
        p("Doe iets zoalng conditie waar is")(fragment),
        prettyCode(java,
          """
            | while( {TESTWAARDE} ){
            |   .. blijf dit herhalen tot TESTWAARDE onwaar is ..
            | }
          """.
            stripMargin
        )(fragment)
      ),
      subsection()(
        p("for"),
        p("Compacte manier om een while loop te schrijven met incrementor")(fragment),
        prettyCode(java,
          """
            | for( {start-conditie}; {TESTWAARDE}; {increment} ){
            |   .. blijf dit herhalen tot TESTWAARDE onwaar is ..
            | }
          """.
            stripMargin
        )(fragment),
        prettyCode(java,
          """
            | for( int teller=0; teller<10; teller++ ){
            |   .. blijf dit herhalen tot TESTWAARDE onwaar is ..
            | }
          """.
            stripMargin
        )(fragment)
      )
    )
}
