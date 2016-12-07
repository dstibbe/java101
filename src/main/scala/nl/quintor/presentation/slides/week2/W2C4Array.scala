package nl.quintor.presentation.slides.week2

import nl.quintor.presentation.Section
import nl.quintor.reveal.{prettyCode, subsection, _}

import scalatags.Text.all._

object W2C4Array extends Section {
  override def content =
    section("Review: Arrays")(
      subsection()(
        p("Speciale container objecten"),
        p(
          revealImg("objects-tenElementArray.gif")
        )(fragment)
      ),
      subsection()(
        p("Declaratie"),
        prettyCode(java,
          """
            | String [] mijnRijtje;
          """)(fragment)
      ),
      subsection()(
        p("Initialisatie - 2 manieren"),
        prettyCode(java,
          """
            | String [] mijnRijtje;
            | mijnRijtje = new String[10];
          """)(fragment),
        prettyCode(java,
          """
            | String [] mijnRijtje = {"a", "b", "c"};
          """)(fragment)
      ),
      subsection()(
        p("Indices - lezen en schrijven"),
        p(
          revealImg("objects-tenElementArray.gif")
        ),
        prettyCode(java,
          """
            | System.out.println( mijnRijtje[1] );
          """)(fragment),
        prettyCode(java,
          """
            | mijnRijtje[1] = "z"; );
          """)(fragment)
      ),
      subsection()(
        p("Als je een index kiest buiten het geheugenbereik van array?"),
        p("ArrayIndexOutOfBoundsException")(fragment)
      )
    )
}
