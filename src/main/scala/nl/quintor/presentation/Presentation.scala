package nl.quintor.presentation

import nl.quintor.presentation.slides._
import nl.quintor.reveal


object Presentation {
  lazy val myslides = reveal.slides
  lazy val html =
    myslides(
      Frontpage.content,
      Chap1Overview.content,
      Chap2History.content,
      Chap3HelloWorld.content,
      Chap4Variables.content,
      Chap4_1Arrays.content,
      Chap4_2ControlFlow.content,
      Chap5Classes.content,
      Chap6Methoden.content,
      Chap7Constructor.content,
      Chap8OO.content,
      Chap8_1UML.content,
      Chap9VariableReferences.content
    )
}
