package nl.quintor.presentation.slides.week1

import nl.quintor.presentation.Section
import nl.quintor.reveal._

import scalatags.Text.all._

object Chap5Classes extends Section {
  override def content =
    section("Classes")(
      subsection("")(
        ul(
          li("A class is a blueprint"),
          li("An object is the building")
        )
      ),
      subsection("")(
        ul("Class has ")(
          li("a name, always start a class name with a capital"),
          li("attributes (data-fields)"),
          li("methods (functions)"),
          li("his own file, with matching name")
        )
      ),
      subsection("")(
        prettyCode(java,
          """
            |public class House {
            |    public String color;
            |    public int nrOfRooms;
            |    public boolean hasGarden;
            |}
          """.stripMargin
        ),
        ul(
          li("Class name: 'House'")(fragment),
          li("3 attributes (datafields)")(fragment),
          li("alle attributes are 'public' (= accessible for all)")(fragment),
          li("located in a file called 'House.java'")(fragment)
        )
      ),
      subsection("")(
        prettyCode(java,
          """
            |House davidsHouse = new House();
          """.stripMargin
        ),
        ul(
          li("Create an object of type House"),
          li("keyword 'new' followed by the constructor"),
          li("Constructor in this case:  'House()'")
        )

      ),
      subsection("")(
        prettyCode(java,
          """
            |House davidsHouse = new House();
          """.stripMargin
        ),
        ul("variable defined: ")(
          li("TYPE = House class"),
          li("name = davidsHouse"),
          li("VALUE = a House object")
        )(fragment)
      ),
      subsection("")(
        p("Acessing the fields and a method of an object through the '.' operator:"),
        prettyCode(java,
          """
            |davidsHouse.color = "Blue"; // write
            |System.out.println(davidsHouse.color); //read
          """.stripMargin
        ),
        ul(
          li("First 'Blue' is written to the 'color' field."),
          li("After that the 'color' field is read.")
        )
      ),
      subsection("")(
        prettyCode(java,
          """
            |House davidsHouse = new House();
            |
            |davidsHouse.color = "Blue";
            |davidsHouse.nrOfRooms = 4;
            |davidsHouse.hasGarden = true;
          """.stripMargin
        )
      )
    )

}
