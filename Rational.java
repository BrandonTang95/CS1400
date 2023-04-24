//
//     Name:         Tang, Brandon
//     Project:     #2
//     Due:          1PM, 2/14/22
//     Course:       cs-1400-02 sp22
//
//     Description: The Rational class provides all the necessary properties of a rational 
//                  number to be used in equations and expressions.
public class Rational
{
       private int p;
       private int q;

       public Rational()
       {
              p = 0;
              q = 1;
       }

       public Rational(int p, int q)
       {
              set(p, q);
       }

       public Rational(int n)
       {
              p = n;
              q = 1;
       }

       public void set(int p, int q)
       {
              this.p = p;
              this.q = q;
       }

       public int getP()
       {
              return p;
       }

       public int getQ()
       {
              return q;
       }

       public double toDouble()
       {
              return (double)p/q;
       }

       public boolean equals(Rational rhs)
       {
           if ( (p * rhs.getQ()) == (q * rhs.getP()) ) 
           { 
              return true; 
           }
           else
           {
              return false;
           }
       }

       public String toString()
       {
              return String.format("%d/%d", p, q);
       }
}
