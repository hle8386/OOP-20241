import java.util.Scanner;
public class FindSolution {
    public static class FirstDegreeEquation{
        public static void main (String args[]) {
            Scanner vari = new Scanner(System.in);
            String a1 = vari.nextLine();
            String b1 = vari.nextLine();
            double a = Double.parseDouble(a1);
            double b = Double.parseDouble(b1);
            if (a == 0)
            {
                System.out.println("The equation has no root!");    
            }
            else
            {
                double x = -b/a;
                System.out.println("The solution is: " + x);
            }
        }
    }    
    public static class SecondDegreeEquation{
        public static void main (String args[]) {
            Scanner vari = new Scanner(System.in);
            String a2 = vari.nextLine();
            String b2 = vari.nextLine();
            String c2 = vari.nextLine();

            double a = Double.parseDouble(a2);
            double b = Double.parseDouble(b2);
            double c = Double.parseDouble(c2);

            double discriminant = b*b - 4.0*a*c;
            if (a==0)
            {
                System.out.println("a cannot equal to 0");
            }
            else if (discriminant < 0)
            {
                System.out.println("There is no real root!");
            }
            else if (discriminant == 0)
            {
                System.out.println(-b/(2*a));
            }
            else
            {
                System.out.println("x1 = " + (-b+Math.sqrt(discriminant))/2.0);
                System.out.println("x2 = " + (-b-Math.sqrt(discriminant))/2.0);
            }
        }
    }
    public static class TwoVariables{
        public static void main (String args[]) {
            Scanner vari = new Scanner(System.in);
            String a = vari.nextLine();
            String b = vari.nextLine();
            String c = vari.nextLine();
            String d = vari.nextLine();
            String e = vari.nextLine();
            String f = vari.nextLine();

            double a11 = Double.parseDouble(a);
            double a12 = Double.parseDouble(b);
            double b1 = Double.parseDouble(c);
            double a21 = Double.parseDouble(d);
            double a22 = Double.parseDouble(e);
            double b2 = Double.parseDouble(f);

            double D =  a11*a22 - a12*a21;
            double D1 = b1*a22 - b2*a12;
            double D2 = a11*b2 - a21*b1;
            
            if (D == 0) 
            {
                if ((a21 != 0 && a22 != 0 && b2 != 0) &&
                        (a11 / a21 == a12 / a22) &&
                        (a12 / a22 == b1 / b2) &&
                        (a11 / a21 == b1 / b2)) {
                    System.out.println("The system has infinitely many solutions!");
                } 
                else 
                {
                    System.out.println("The system has no root!");
                }
            }
            else
            {
                System.out.println("x1 = " + D1/D);
                System.out.println("x2 = " + D2/D);
            }
        }
    }    
}            
