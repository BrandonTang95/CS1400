//
//     Name:         Tang, Brandon
//     Homework:     #4
//     Due:          5/6/22
//     Course:       cs-1400-02 sp22
//
//     Description: An extension of the Ship class. Contains a field for the cargo capacity.
//
public class CargoShip extends Ship
{
       private int capacity;

       public CargoShip(String name, String year, int capacity)
       {
              super(name, year);
              setCapacity(capacity);
       }

       public void setCapacity(int capacity)
       {
              this.capacity = capacity;
       }

       public int getCapacity()
       {
              return capacity;
       }

       @Override
       public String toString()
       {
              return String.format("Name: %s, Cargo Capacity: %d tons", super.getName(), capacity);
       }
}