//
//     Name:         Tang, Brandon
//     Homework:     #4
//     Due:          5/6/22
//     Course:       cs-1400-02 sp22
//
//     Description: Ship class that will contain the name and year the ship was built.  
//
public class Ship
{
       private String name;
       private String year;

       public Ship(String name, String year)
       {
              this.name = name;
              this.year = year;
       }

       public String getName()
       {
              return name;
       }

       @Override
       public String toString()
       {
              return String.format("Name: %s, Year of Construction: %s", name, year);
       }
}