package nl.quintor.presentation.slides.week1

import nl.quintor.presentation.Section
import nl.quintor.reveal._

import scalatags.Text.all._

object Chap9VariableReferences extends Section {
  override def content =
    section("Variable References")(
      subsection("")(
        ul("Primitive variables")(
          li("int, float, double, char, byte, long, short, byte"),
          li("Value is stored at the variable location"),
          li("Not objects")
        ),
        prettyCode(java,
          """
            | int a = 12;
            | System.out.println( a );
          """.stripMargin
        )
      ),
      subsection("")(
        ul("Reference variables")(
          li("References objects"),
          li("Variable contains address of (the reference to) an object")
        ),
        prettyCode(java,
          """
            |...
            |House davidsgulden6 = new House();
            |System.out.println( davidsgulden6 ); // output: House@28d93b30
            |...
          """.stripMargin
        )
      ),
      subsection("")(
        p("Assignment: "),
        prettyCode(java,
          """
            |...
            |House davidsgulden6 = new House();
            |House davidsgulden9 = davidsgulden6;
            |
            |int myNumber = 12;
            |int yourNumber = myNumber
            |
            |davidsgulden6.setColor("Red");
            |myNumber = 9;
            |
            |System.out.println( davidsgulden9.getColor() );
            |System.out.println( yourNumber );
            |...
          """.stripMargin
        ),
        p("What will be printed?")
      ),
      subsection("")(
        ul("NULL")(
          li("a reference variable that doesn't point to anything contains 'null' "),
          li("default value of a reference variable field")
        ),
        prettyCode(java,
          """
            |public class House {
            |    private String color;  //null
            |    private int nrOfRooms; //0
            |    private boolean hasGarden; //false
            |
            |    public House(){
            |    }
            |    ...
            |
            |    public String getColor(){
            |      return color;
            |    }
            |}
          """.stripMargin
        )
      ),
      subsection("")(
        prettyCode(java,
          """
            |...
            |House davidsgulden6;
            |System.out.println( davidsgulden6 ); // output: null
            |
            |davidsgulden6 = new House();
            |System.out.println( davidsgulden6.getColor() ); // output: null
            |...
          """.stripMargin
        )
      ),
      subsection("")(
        ul("NullPointerException (NPE)")(
          li("When the program tries to access a method/field of a non-instanced variable (a null-pointer)")
        ),
        prettyCode(java,
          """
            |...
            |House davidsgulden6;
            |System.out.println( davidsgulden6.getColor() ); // throws NPE
            |...
          """.stripMargin
        )
      ),
      subsection(".equals() vs ==")(
        p("== is for comparing values"),
        p(".equals() is for comparing objects"),
        prettyCode(java,
          """
            | int a = 20;
            | int b = 20;
            | int c = 21;
            |
            | a == b;
            | a == c;
          """.stripMargin
        )
      ),
      subsection()(

        prettyCode(java,
          """
            | String davidsgulden7 = "A red house";
            | String monkeyroad92 = "A red house";
            | String monkeyroad93 = "A green house";
            | String myHouse = davidsgulden7;
            |
            | davidsgulden7.equals( monkeyroad92 );
            | davidsgulden7 == monkeyroad92;
            |
            | davidsgulden7.equals( myHouse );
            | davidsgulden7 == myHouse;
            |
            | davidsgulden7.equals( monkeyroad93 );
            | davidsgulden7 == monkeyroad93;
          """.stripMargin
        )
      )
    )

}
