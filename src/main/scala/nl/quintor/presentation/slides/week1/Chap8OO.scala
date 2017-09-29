package nl.quintor.presentation.slides.week1

import nl.quintor.presentation.Section
import nl.quintor.reveal._

import scalatags.Text.all._

object Chap8OO extends Section {
  override def content =
    section("Object Oriented Development")(
      subsection("")(
        ul("information hiding")(
          li("Protect internal data of the class, by making the fields 'private'."),
          li("Internal working of the class can change without the need of updating others.")
        )
      ),
      subsection("")(
        prettyCode(java,
          """
            |public class Customer{
            |   private String name;
            |   private String address;
            |   private String city;
            |
            |   ....
            |}
          """.stripMargin
        ),
        ul(
          li("'private' - only the class itself can accesss this")
        ),
        prettyCode(java,
          """
            |...
            |Customer charlie = new Customer("charlie", "ChocolateFactory", "Munchen");
            |charlie.name= "Test" ; //FAILURE
            |...
          """.stripMargin
        )
      ),
      subsection("")(
        p("Convention for reading and writing fields:"),
        p("Getters en Setters")
      ),
      subsection("")(
        p("Getter"),
        p("Method for requesting the value of a field"),
        blockquote("public TYPE get{Field}()"),
        prettyCode(java,
          """
            |public class Customer{
            |  ...
            |  public String getName(){
            |     return name;
            |  }
            |  ...
            |}
          """.stripMargin
        ),
        prettyCode(java,
          """
            | System.out.println(charlie.getName());
          """.stripMargin
        )
      ),
      subsection("")(
        p("Setter"),
        p("Method for changing the value of a field"),
        blockquote("public void set{Field}(TYPE value)"),
        prettyCode(java,
          """
            |public class Customer{
            |  ...
            |  public void setName(String newName){
            |     name = newName;
            |  }
            |  ...
            |}
          """.stripMargin
        ),
        prettyCode(java,
          """
            | jakie.setName("Willie");
            | System.out.println(charlie.getName());
          """.stripMargin
        )
      )
    )

}
