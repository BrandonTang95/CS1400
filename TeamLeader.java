//
//     Name:         Tang, Brandon
//     Project:      #5
//     Due:          4/27/22
//     Course:       cs-1400-02 sp22
//
//     Description: An hourly paid production worker that leads a small group of workers. The class contains the information about a team leader. 
//                  It includes a team leader's monthly bonus, required training hours, and the amount of training hours attended.
//
public class TeamLeader extends ProductionWorker
{
       private double monthlyBonus;
       private int trngHrsReq;
       private int trngHrsAtt;

       public TeamLeader(String name, EmployeeId id, Date hireDate , int shift, double hrlyPay, double monthlyBonus, int trngHrsReq, int trngHrsAtt)
       {
              super(name, id, hireDate, shift, hrlyPay);
              this.monthlyBonus = monthlyBonus;
              checkHrs(trngHrsReq, trngHrsAtt);
       }

       public double getMonthlyBonus()
       {
              return monthlyBonus;
       }

       public int getTrngHrsReq()
       {
              return trngHrsReq;
       }

       public int getTrngHrsAtt()
       {
              return trngHrsAtt;
       }

       public void checkHrs(int trngHrsReq, int trngHrsAtt)
       {
              this.trngHrsReq = trngHrsReq;
              this.trngHrsAtt = trngHrsAtt;
              if (trngHrsAtt < trngHrsReq)
              {
                     System.out.println("Training hours attended did not meet the required amount.");
              }
              else
              {
                     System.out.println("Required training hours have been met.");
              }
       }

       @Override
       public String toString()
       {
              return String.format("%s, Monthly Bonus: $%,.2f, Training Hours Required: %d hours, Training Hours Attended: %d hours", super.toString(), monthlyBonus, trngHrsReq, trngHrsAtt);
       }
}
