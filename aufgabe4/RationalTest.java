package aufgabe4;

import java.util.Scanner;

/**
 * Created by Nils on 01.12.2014.
 */
public class RationalTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rational a = new Rational(sc.nextInt(), sc.nextInt()), b = new Rational(sc.nextInt(), sc.nextInt()), c;
        System.out.println(a.toString());
        System.out.println(b.toString());
        while (sc.hasNext()) {
            switch (sc.next().charAt(0)) {
                case '+':
                    c = a.add(b);
                    a = b;
                    b = c;
                    System.out.println(c.toString());
                    break;
                case '-':
                    c = a.sub(b);
                    a = b;
                    b = c;
                    System.out.println(c.toString());
                    break;
                case '*':
                    c = a.mul(b);
                    a=b;
                    b=c;
                    System.out.println(c.toString());
                    break;
                case '/':
                    c=a.div(b);
                    a=b;
                    b=c;
                    System.out.println(c.toString());
                    break;
                default:
                    System.out.println("Fehler: Falsches Rechenzeichen.");
            }
        }
    }
}
