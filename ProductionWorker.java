//
//     Name:         Tang, Brandon
//     Project:      #5
//     Due:          4/27/22
//     Course:       cs-1400-02 sp22
//
//     Description: Production worker "is an" employee. The production worker will either be working the day or night shift.
//
public class ProductionWorker extends Employee
{
       private int shift;
       private int dayShift;
       private int nightShift;
       private double hrlyPay;

       public ProductionWorker(String name, EmployeeId id, Date hireDate , int shift, double hrlyPay)
       {
              super(name, id, hireDate);
              this.shift = shift;
              this.hrlyPay = hrlyPay;
              setDayShift(dayShift);
              setNightShift(nightShift);
       }

       public void setDayShift(int dayShift)
       {
              dayShift = (int)(shift/2);
              this.dayShift = dayShift;
       }

       public void setNightShift(int nightShift)
       {
              nightShift = shift - dayShift;
              this.nightShift = nightShift;
       }

       public int getShift()
       {
              return shift;
       }

       public int getDayShift()
       {
              return dayShift;
       }

       public int getNightShift()
       {
              return nightShift;
       }

       public double getHrlyPay()
       {
              return hrlyPay;
       }

       @Override
       public String toString()
       {
              return String.format("%s, Shift Length: %d hours, Day Shift: %d hours, Night Shift: %d hours, Hourly Pay Rate: $%.2f", super.toString(), shift, dayShift, nightShift, hrlyPay);
       }
}
