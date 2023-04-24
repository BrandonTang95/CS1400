//
//     Name:         Tang, Brandon
//     Project:      #5
//     Due:          4/27/22
//     Course:       cs-1400-02 sp22
//
//     Description: This app will demonstrate all implemented features within the different positions in the company.
//
public class CompanyApp
{
       public static void main (String[]args)
       {
              System.out.println("Company by B. Tang");
              System.out.println();

              EmployeeId id = new EmployeeId(000, 'A');
              System.out.println("Sample ID: " + id);

              Date date = new Date(29, 2, 2016);
              System.out.println("Sample Date: "+ date);

              EmployeeId id1 = new EmployeeId(123, 'B');
              Date date1 = new Date(3,3,2018);

              EmployeeId id2 = new EmployeeId(456, 'C');
              Date date2 = new Date(1, 11, 2020);

              EmployeeId id3 = new EmployeeId(789, 'D');
              Date date3 = new Date(31, 1, 2015);

              EmployeeId id4 = new EmployeeId(246, 'E');
              Date date4 = new Date(30, 4, 2009);

              EmployeeId id5 = new EmployeeId(357, 'F');
              Date date5 = new Date(15, 10, 1998);

              EmployeeId id6 = new EmployeeId(690, 'G');
              Date date6 = new Date(28, 2, 1999);

              EmployeeId id7 = new EmployeeId(420, 'H');
              Date date7 = new Date(21, 9, 1992);

              EmployeeId id8 = new EmployeeId(222, 'I');
              Date date8 = new Date(4, 5, 2011);

              System.out.println("Company Employees:");

              Employee John = new Employee("John", id1, date1);
              System.out.println(John);

              Employee Jimmy = new Employee("Jimmy", id2, date2);
              System.out.println(Jimmy); 

              System.out.println();
              System.out.println("Company Production Workers:");

              // Production Workers
              Employee Joe = new ProductionWorker("Joe", id3, date3, 8, 20.25);
              System.out.println("Production Worker Info: " + Joe);
              System.out.println();

              Employee Jade = new ProductionWorker("Jade", id4, date4, 10, 20.25);
              System.out.println("Production Worker Info: " + Jade);
              System.out.println();

              System.out.println("Company Shift Supervisors:");

              // Shift Supervisors
              Employee Jane = new ShiftSupervisor("Jane", id5, date5, 200000, 2000);
              System.out.println("Shift Supervisor Info: " + Jane);
              System.out.println();

              Employee Jeremy = new ShiftSupervisor("Jeremy", id6, date6, 400000, 10000);
              System.out.println("Shift Supervisor Info: " + Jeremy);
              System.out.println();

              System.out.println("Company Team Leaders:");

              // Leaders
              Employee Jeff = new TeamLeader("Jeff", id7, date7, 16, 1000000, 20000, 10, 20);
              System.out.println("Team Leader Info: " + Jeff);
              System.out.println();

              Employee Jack = new TeamLeader("Jack", id8, date8, 4, 500000, 8000, 10, 9);
              System.out.println("Team Leader Info: " + Jack);
              System.out.println();
       }
}
