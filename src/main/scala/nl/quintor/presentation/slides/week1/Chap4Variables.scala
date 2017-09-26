package nl.quintor.presentation.slides.week1

import nl.quintor.presentation.Section
import nl.quintor.reveal._

import scalatags.Text.all.{tr, _}

object Chap4Variables extends Section {
  override def content =
    section("Variables")(
      subsection("")(
        p("A variable is a named memory location where data can be stored.")
      ),
      subsection("")(
        ul(
          li("declaration - defining the name and data-type"),
          li("initialisation - assinging the first value to the variable")
        )
      ),
      subsection("")(
        h4("declaration"),
        prettyCode(java,
          """
            |String myMesssage;
          """.
            stripMargin
        ),
        blockquote(
          "TYPE NAME"
        ),
        ul(
          li("TYPE: String"),
          li("NAME: myMessage")
        )
      ),
      subsection("")(
        p("initialisation:"),
        prettyCode(java,
          """
            |myMesssage = "Hello World";
          """.
            stripMargin
        ),
        blockquote(
          "NAME = VALUE"
        ),
        ul(
          li("NAME: myMessage"),
          li("VALUE: \"Hello World\"")
        )
      ),
      subsection("")(
        p("declaration en initialisation:"),
        prettyCode(java,
          """
            |String myMesssage = "Hello World";
          """.
            stripMargin
        ),
        blockquote(
          "TYPE NAME = VALUE"
        ),
        ul(
          li("TYPE: String"),
          li("NAME: myMessage"),
          li("VALUE: \"Hello World\"")
        )
      ),
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
        p("Primitives"),
        table(
          tr(td("char"), td("a character"), td("'a'")),
          tr(td("float"), td("real number (with a comma)"), td("12.0")),
          tr(td("double"), td("large float"), td("123.0")),
          tr(td("int"), td("integer, a round number"), td("112")),
          tr(td("long"), td("large integer"), td("1112")),
          tr(td("short"), td("small integer"), td("12")),
          tr(td("byte"), td("8 bits"), td("0b0010_0101")),
          tr(td("boolean"), td("true/false"), td("true"))
        )
      )
      ,
      subsection("")(
        p("Objects"),
        table(
          tr(td("String"), td("text"), td("")),
          tr(td("Integer"), td("wrapper for an int"), td("")),
          tr(td("List"), td("list of objects"), td("")),
          tr(td(" ... "), td(" ... "), td(""))
        )
      )
    )
}
