//
//     Name:         Tang, Brandon
//     Project:      #5
//     Due:          4/27/22
//     Course:       cs-1400-02 sp22
//
//     Description: Contains the employee id in the format of XXX-L.
//
public class EmployeeId
{
       private int idNumber;
       private char idLetter;

       public EmployeeId(int idNumber, char idLetter)
       {
              setNumber(idNumber);
              setLetter(idLetter);
       }

       public int getNumber()
       {
              return idNumber;
       }

       public char idLetter()
       {
              return idLetter;
       }

       public void setNumber(int idNumber)
       {
              this.idNumber = idNumber;
              if (idNumber < 0 || idNumber > 999)
              {
                     throw new IllegalArgumentException("Employee ID number can only be between 0 and 999.");
              }
       }

       public void setLetter(char idLetter)
       {
              this.idLetter = idLetter;
              if (idLetter < 'A' || idLetter > 'M')
              {
                     throw new IllegalArgumentException("Employee ID letter can only be between letters A and M.");
              }
       }
       
       @Override 
       public String toString()
       {
              return String.format("%03d-%c", idNumber, idLetter);
       }
}
