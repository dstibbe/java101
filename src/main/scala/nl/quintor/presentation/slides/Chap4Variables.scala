package nl.quintor.presentation.slides

import nl.quintor.presentation.Section
import nl.quintor.reveal._

import scalatags.Text.all._

object Chap4Variables extends Section {
  override def content =
    section("Variabelen")(
      subsection("")(
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
        )
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
        ul("Primitieven")(
          li("char - 'a'"),
          li("double - 123.0"),
          li("float - 12.0"),
          li("long - 1112"),
          li("int - 112"),
          li("short - 12"),
          li("byte - 0b0010_0101")
        ),
        p(" "),
        ul("Overig"){
          li("String - \"Hello world\"")
        }
      )
    )
}
