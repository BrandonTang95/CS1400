//
//     Name:         Tang, Brandon
//     Homework:     #4
//     Due:          5/6/22
//     Course:       cs-1400-02 sp22
//
//     Description: Has a Ship array. The array will have various Ship, CruiseShip, and CargoShip objects in the array elements. 
//                  The program will step through the array and call each object's toString method.
// 
public class ShipApp
{
       public static void main(String[]args)
       {
              System.out.println("Ship by B. Tang");
              System.out.println();

              Ship[]ships = new Ship[3];
              ships[0] = new Ship("Chad", "1990");
              ships[1] = new CruiseShip("Castle", "2000", 200);
              ships[2] = new CargoShip("Storm", "1850", 10000);
              for (int i = 0; i < ships.length; i++)
              {
                     System.out.println(ships[i]);
              }
       }
}
