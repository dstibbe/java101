package nl.quintor.presentation.slides.week1

import nl.quintor.presentation.Section
import nl.quintor.reveal._

import scalatags.Text.all._

object Chap6Methoden extends Section {
  override def content =
    section("Methoden")(
      subsection("")(
        prettyCode(java,
          """
            |
            |public class House{
            |  ...
            |   public String buildString(){
            |      ...
            |   }
            |   ...
            |}
          """.stripMargin
        ),
        ul(
          li("public - accessible to all\""),
          li("String - method returns a string"),
          li("'buildString' - method name")
        )
      ),
      subsection("")(
        prettyCode(java,
          """
            |public class House{
            |  ...
            |  public String buildString(){
            |     String message = "House has color " + color + " and " + nrOfRooms + " rooms";
            |     return message;
            |  }
            |  ...
            |}
          """.stripMargin
        ),
        ul(
          li("'+' - operator for concatenating String objects"),
          li("return - leave the method and return the given object")
        )
      ),
      subsection("")(

        p("Methods of an object are accessed with a '.' as well:"),
        prettyCode(java,
          """
            |someHouse.buildString();
          """.stripMargin
        ),
        p("This invokes the method 'buildString()' of the object where someHouse points to.")
      ),
      subsection("")(
        prettyCode(java,
          """
            |House someHouse = new House();
            |someHouse.color = "Blue";
            | ....
            |String houseMsg = someHouse.buildString();
            |System.out.println( houseMsg );
          """.stripMargin
        )
      ),
      subsection("")(
        p("Method can receive multiple arguments, these are specified between the " +
          "'()'. Example:"),
        prettyCode(java,
          """
            |public String xyz(int arg1, String arg2){
            |  ...
            |}
          """.stripMargin
        ),
        p("This method receives two arguments, an int and a String with the names " +
          "'arg1' and 'arg2'.")
      ),
      subsection("")(
        prettyCode(java,
          """
            |public class Customer{
            |   public String address;
            |   public String city;
            |   ...
            |   public void movedTo(String newAddress, String newCity){
            |     adress = newAddress;
            |     city = newCity;
            |   }
            |   ...
            |}
          """.stripMargin
        ),
        ul(
          li("'void' - means that the method does not return a value"),
          li("The method expects two values"),
          li("The values are assigned to two fields of the Customer")
        )
      ),
      subsection("")(
        prettyCode(java,
          """
            |jakie.movedTo("twixFactory", "Left town");
          """.stripMargin
        )
      )
    )

}
