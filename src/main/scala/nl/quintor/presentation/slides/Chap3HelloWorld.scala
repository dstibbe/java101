package nl.quintor.presentation.slides

import nl.quintor.presentation.Section
import nl.quintor.reveal._

import scalatags.Text.all._

object Chap3HelloWorld extends Section {
  override def content =
    section("Hello World")(
      prettyCode(java,
        """          |
          |public class HelloWorld {
          |    public static void main(String[] args){
          |        System.out.println("Hello World");
          |    }
          |}
        """.stripMargin
      ),
      ul(
        li("'main' method wordt aangeroepen bij starten van de applicatie"),
        li("Elke opdrachtregel eindigt met ';'"),
        li("Details komen later aan bod")
      )
    )
}
