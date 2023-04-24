//
//     Name:         Tang, Brandon
//     Project:      #3
//     Due:          1PM, 3/18/22
//     Course:       cs-1400-02 sp22
//
//     Description: The program will read information about elements in the periodic table allow the user
//                  search or print out the periodic table.
import java.io.*;
import java.util.Scanner;
 
public class PeriodicTable
{
       public static void main (String[] args) throws IOException
       {
              final int MAX_ELEMENTS = 150;
              Scanner inFile = new Scanner(new File("periodictable.dat"));
              int[] atomicNum = new int[MAX_ELEMENTS];
              String[] symbol = new String[MAX_ELEMENTS];
              float[] mass = new float[MAX_ELEMENTS];
              String[] name = new String[MAX_ELEMENTS];
              int actualElements;
             
              actualElements = 0;
              while (inFile.hasNext() && actualElements < MAX_ELEMENTS)
              {
                     atomicNum[actualElements] = inFile.nextInt();
                     symbol[actualElements] = inFile.next();
                     mass[actualElements] = inFile.nextFloat();
                     name[actualElements] = inFile.next();
                     actualElements++;
              }
              inFile.close();
 
              if (args.length > 0)
              {
                     switch (args[0])
                     {
                            case "print":  
                                   System.out.println(args[1] + " created.");
                                   PrintWriter outFile = new PrintWriter(args[1]);
                                   outFile.println("Periodic Table (#)");
                                   outFile.println();
                                   outFile.println("ANo. Name                 Abr    Mass");
                                   outFile.println("---- -------------------- --- -------");
                                   for (int i = 0; i < actualElements; i++)
                                   {      
                                          outFile.printf("%4d %-20s %-3s %4.2f\n", atomicNum[i], name[i], symbol[i], mass[i]);
                                   }
                                   double sum = 0;
                                   for (int i = 0; i < mass.length; i++)
                                   {
                                          sum += mass[i];
                                   }
                                   double average = sum / actualElements;
                                   outFile.println();
                                   outFile.printf("The average mass:             %6.2f", average);
                                   outFile.close();
                                   break;
                            case "search":
                                   boolean found = false;
                                   int index = 0;
                                   while(!found && index < actualElements)
                                   {
                                          if (symbol[index].equalsIgnoreCase(args[1]))
                                          {
                                                 found = true;
                                          }
                                          else
                                          {
                                                 index++;
                                          }
                                   }
                                   if (found)
                                   {
                                          System.out.printf("%4d %-20s %-3s %4.2f\n", atomicNum[index], name[index], symbol[index], mass[index]);
                                   }
                                   else
                                   {
                                          System.out.println(args[1] + " not found.");
                                   }
                                   break;
                     }
              }
       }
}
 
 
 
 
 
 

