//
//     Name:         Tang, Brandon
//     Homework:     #4
//     Due:          5/6/22
//     Course:       cs-1400-02 sp22
//
//     Description: An extension of the Ship class. Contains a field for the maximum amount of passengers
//
public class CruiseShip extends Ship
{
       private int maxPax;

       public CruiseShip(String name, String year, int maxPax)
       {
              super(name, year);
              setMaxPax(maxPax);
       }

       public int getMaxPax()
       {
              return maxPax;
       }

       public void setMaxPax(int maxPax)
       {
              this.maxPax = maxPax;
       }

       @Override
       public String toString()
       {
              return String.format("Name: %s, Maximum Number of Passengers: %d", super.getName(), maxPax);
       }
}