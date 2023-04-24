//
//     Name:         Tang, Brandon
//     Project:      #5
//     Due:          4/27/22
//     Course:       cs-1400-02 sp22
//
//     Description: Contains the information for the date of hire and validates whether the date is valid or not.
//
public class Date
{
       private int day;
       private int month;
       private int year;

       public Date(int day, int month, int year)
       {
              setDate(day, month, year);
       }

       public void setDate(int day, int month, int year)
       {
              this.day = day;
              this.month = month;
              this.year = year;

              boolean isValid = false;
              if (month >= 1 && month < 12 && day >= 1)
              {
                     int numDays;
                     switch(month)
                     {
                            case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
                                   numDays = 31;
                                   break;
                            case 2:
                                   numDays = (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)
                                          ? 29 : 28;
                                   break;
                            default:
                                   numDays = 30;
                                   break;
                     }
                     isValid = (day <= numDays);
              }
              if (!isValid)
              {
                     throw new IllegalArgumentException("Date is not valid");
              }
       }

       public int getDay()
       {
              return day;
       }

       public int getMonth()
       {
              return month;
       }

       public int getYear()
       {
              return year;
       }

       @Override
       public String toString()
       {
              return String.format("%02d/%02d/%04d", day, month, year);
       }
}
