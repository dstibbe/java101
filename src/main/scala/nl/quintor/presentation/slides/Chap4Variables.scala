package nl.quintor.presentation.slides

import nl.quintor.presentation.Section
import nl.quintor.reveal._

import scalatags.Text.all._

object Chap4Variables extends Section {
  override def content =
    section("Variabelen")(
      subsection("")(
        p("Een variabele is dus een benoemde geheugenlocatie waar gegevens opgeslagen kunnen worden."),
        prettyCode(java,
          """
            |public class HelloWorld {
            |    public static void main(String[] args){
            |        String myMesssage = "Hello World";
            |        System.out.println(myMessage);
            |    }
            |}
          """.
            stripMargin
        ),
        p("De variabele hier heet 'myMessage' en bevat een String.")
      ),
      subsection("")(
        p("variabele declaratie"),
        blockquote(
          "TYPE NAAM = WAARDE"
        ),
        fragment(
          ul(
            li("TYPE = String class"),
            li("NAAM = myMessage"),
            li("WAARDE = \"Hello World\""),
            li("variabele naame begint altijd met kleine letter")
          )
        )
      ),
      subsection("")(
        p("Primitieven"),
        table(
          tr(td("char"), td("een karakter"), td("'a'")),
          tr(td("float"), td("reeel (komma) getal"), td("12.0")),
          tr(td("double"), td("grote float"), td("123.0")),
          tr(td("int"), td("geheel getal"), td("112")),
          tr(td("long"), td("grote int"), td("1112")),
          tr(td("short"), td("kleine int"), td("12")),
          tr(td("byte"), td("8 bits"), td("0b0010_0101")),
          tr(td("boolean"), td("waar/vals"), td("true"))
        )
      ),
      subsection("")(
        p("Objecten"),
        table(
          tr(td("String"), td("tekst"), td(""))
        )
      )
    )
}
