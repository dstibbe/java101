package nl.quintor.presentation.slides.week1

import nl.quintor.presentation.Section
import nl.quintor.reveal._

import scalatags.Text.all._

object Chap7Constructor extends Section {
  override def content =
    section("Constructor")(
      subsection("")(
        p( "Special method that initializes an object."),
        prettyCode(java,
          """
            |Customer jakie = new Customer();
          """.stripMargin
        ),
        ul(
          li("Constructor always has the exact same name as its class (Customer)"),
          li("Constructor without arguments is the 'default constructor'"),
          li("If no constructor has been specified, the 'default constructor' will exist,")
        )
      ),
      subsection("")(
        prettyCode(java,
          """
            |public class Customer{
            |   ...
            |   public Customer(){
            |     System.out.println("A new customer is being build");
            |   }
            |}
          """.stripMargin
        ),
        ul(
          li("Constructor is a special method."),
          li("Constructor is specified in the same manner as a regular method."),
          li("HOWEVER, constructor has no return value."),
          li("This constructor prints a message")
        )
      ),
      subsection("")(
        p("We replace the constructor with: "),
        prettyCode(java,
          """
            |public class Customer{
            |   ...
            |   public Customer(String newName, String newAddress, String newCity){
            |     name = newName;
            |     address= newAddress;
            |     city = newCity;
            |   }
            |}
          """.stripMargin
        ),
        ul(
          li("A constructor with 3 arguments."),
          li("The arguments are assigned to fields of the Customer")
        )
      ),
      subsection("")(
        prettyCode(java,
          """
            |Customer charlie= new Customer(); // FAILURE
          """.stripMargin
        ),
        p("Because the default constructor 'Customer()' was replaced."),
        prettyCode(java,
          """
            |Customer charlie = new Customer("charlie","ChocoFactory","Munich");
          """.stripMargin
        )
      )
    )

}
