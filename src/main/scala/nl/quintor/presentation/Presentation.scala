package nl.quintor.presentation

import nl.quintor.presentation.slides.{week2, _}
import nl.quintor.presentation.slides.week2._
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
      Chap9VariableReferences.content,
      W2Frontpage.content,
      W2C1Overview.content,
      W2C2Tekens.content,
      W2C3Variabelen.content,
      W2C4Array.content,
      W2C5Classes.content,
      W2C5_1Velden.content,
      W2C5_1Methoden.content,
      W2C5_3Constructor.content,
      W2C6ControlFlow.content,
      W2C7Scope.content,
      W2C8Assignment.content,
      W2C9String.content
    )
}
