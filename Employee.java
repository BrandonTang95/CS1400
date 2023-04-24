//
//     Name:         Tang, Brandon
//     Project:      #5
//     Due:          4/27/22
//     Course:       cs-1400-02 sp22
//
//     Descricption: Contains basic information about the employee using the data from EmployeeId and Date class.
//
public class Employee 
{
       private String name;
       private EmployeeId id;
       private Date hireDate;

       public Employee(String name, EmployeeId id, Date hireDate)
       {
              this.name = name;
              this.id = id;
              this.hireDate = hireDate;
       }

       @Override
       public String toString()
       {
              return String.format("%s, ID: %s, Date of Hire: %s", name, id, hireDate);
       }
}
