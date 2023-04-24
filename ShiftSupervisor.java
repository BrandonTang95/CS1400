//
//     Name:         Tang, Brandon
//     Project:      #5
//     Due:          4/27/22
//     Course:       cs-1400-02 sp22
//
//     Description: A salaried employee who supervises a shift. The class contains the supervisor's annual salary and their annual production.
//
public class ShiftSupervisor extends Employee
{
       private double annlSalary;
       private double annlBonus;

       public ShiftSupervisor(String name, EmployeeId id, Date hireDate, double annlSalary, double annlBonus)
       {
              super(name, id, hireDate);
              this.annlSalary = annlSalary;
              this.annlBonus = annlBonus;
       }

       public double getAnnlSalary()
       {
              return annlSalary;
       }

       public double getAnnlProd()
       {
              return annlBonus;
       }

       @Override
       public String toString()
       {
              return String.format("%s, Annual Salary: $%,.2f, Annual Bonus: $%,.2f", super.toString(), annlSalary, annlBonus);
       }
}
