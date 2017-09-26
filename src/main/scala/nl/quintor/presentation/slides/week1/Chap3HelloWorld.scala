package nl.quintor.presentation.slides.week1

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
        li("File called 'HelloWorld.java'"),
        li("'main' method called when starting the applicatie"),
        li("Every command line ends with';'"),
        li("Details later")
      )
    )
}
