//
//     Name:         Tang, Brandon
//     Project:      #4
//     Due:          Monday, 4/4/22
//     Course:       cs-1400-02 sp22
//
//     Description: The program will read information about elements in the periodic table
//                  and  will allow the user to query information in the PT via a menu system.
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class PeriodicTableEx
{                        
       static int actualElements = 0;
       public static void main (String[]args) throws IOException
       {
              Element[] table;
              table = loadTable();

              System.out.println("Periodic Table by B. Tang");
              System.out.println();
              System.out.println(actualElements +" elements");
              System.out.println();

              Scanner keyboard = new Scanner(System.in);
              String menuInput;

              do
              {
                     System.out.print("Select? ");
                     menuInput = keyboard.next();
                     switch (menuInput.toLowerCase())
                     {
                            case "print":  
                                   sortTable(table);
                                   printTable(table); 
                                   break;
                            case "search":
                                   System.out.println("Enter the symbol to search? ");
                                   String symbol = keyboard.next();
                                   searchSymbol(table, symbol);
                                   int index = searchSymbol(table, symbol);
                                   if (index != -1)
                                   {
                                          System.out.println(table[index]);
                                   }
                                   else
                                   {
                                          System.out.println(symbol + " not found.");
                                   }
                                   break;
                            case "quit":
                                   System.exit(0);
                     }
              }
              while (!menuInput.equalsIgnoreCase("quit"));
       }

       public static Element[] loadTable() throws IOException
       {
              // read periodictable.dat into alTable
              // convert alTable to array of Elements, Element[]
              Scanner inFile = new Scanner(new File("periodictable.dat"));
              ArrayList<Element> alTable = new ArrayList<>();
              
              int atomicNo;
              String symbol;
              String name;
              float mass;
              while (inFile.hasNext())
              {
                     atomicNo = inFile.nextInt();
                     symbol = inFile.next();
                     mass = inFile.nextFloat();
                     name = inFile.next();
                     Element element = new Element(atomicNo, name, symbol, mass);
                     alTable.add(element);
                     actualElements++;
              }
              inFile.close();
              Element[] table = new Element[alTable.size()];
              for (int i = 0; i < table.length; i++)
              {
                     table[i] = alTable.get(i);
              }
              return table;
       }      

       public static void sortTable (Element[] table)
       {
              int startScan, index, minIndex;
              Element minElement;
 
              for (startScan = 0; startScan < table.length - 1; startScan++)
              {
                     // sort table using selection sort
                     minIndex = startScan;
                     minElement = table[startScan];
                     for (index = startScan + 1; index < table.length; index++)
                     {
                            if (table[index].getName().compareTo(minElement.getName()) < 0)
                            {
                                   minElement = table[index];
                                   minIndex = index;
                            }
                     }
                     table[minIndex] = table[startScan];
                     table[startScan] = minElement;
              }
       } 

       public static void printTable (Element[] table)
       {
              // print the table
              System.out.println("ANo. Name                 Abr    Mass");
              System.out.println("---- -------------------- --- -------");
              for (Element element: table)
              {
                     System.out.println(element);
              }
       }

       public static int searchSymbol (Element[] table, String symbol) 
       {
              // do a linear search for the symbol, returns index or -1 if not found
              boolean found = false;
              int index = 0;
              while(!found && index < actualElements)
              {
                     if (table[index].getSymbol().equalsIgnoreCase(symbol))
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
                     return index;
              }
              else
              {
                     index = -1;
                     return index;
              }
       }
}

class Element
{
       // fields
       private int atomicNo;
       private String name;
       private String symbol;
       private float mass;
 
       // set fields to in fields
       public Element(int atomicNo, String name, String symbol, float mass)
       {
              this.atomicNo = atomicNo;
              this.name = name;
              this.symbol = symbol;
              this.mass = mass;
       }
 
       public String getName()
       {
              return name;
       }

       public String getSymbol()
       {
              return symbol;
       }
 
       @Override
       public String toString()
       {
              // use String.format
              return String.format("%4d %-20s %-3s %4.2f", atomicNo, name, symbol, mass);
       }
}
