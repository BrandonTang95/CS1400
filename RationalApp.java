public class RationalApp
{
       public static void main(String[]args)
       {
              Rational r1 = new Rational();
              Rational r2 = new Rational(4);
              Rational r3 = new Rational(1, 2);
              Rational r4 = new Rational(2, 4);

              System.out.println("Test");
              System.out.println(r1.getP());
              System.out.println(r1.getQ());
              System.out.println(r2);
              System.out.println(r3 + " = " + r3.toDouble());
              System.out.println(r4 + " = " + r4.toDouble());
              System.out.println("Compare two rational numbers.");
              System.out.println(r3 + " = " + r4 + "?");
              System.out.println(r3.equals(r4));
       }
}
