package aufgabe4;

/**
 * Created by Nils on 01.12.2014.
 */
public class Rational {
    // Variables
    int zaehler, nenner;

    // Constructors
    public Rational(int a) {
        this.setZaehler(a);
        this.setNenner(1);
    }

    public Rational(int z, int n) {
        int a, b;
        if (n != 0) {
            a = z / Rechnen.ggT(z, n);
            b = n / Rechnen.ggT(z, n);
            if (b < 0) {
                a *= -1;
                b *= -1;
            }
            this.setZaehler(a);
            this.setNenner(b);
        } else {
            System.out.println("Fehler: Als Divisor 0 eingeben. Wird als 1 interpretiert.");
            this.setZaehler(z);
            this.setNenner(1);
        }
    }

    // Methods
    public String toString() {
        return "" + this.getZaehler() + "/" + this.getNenner();
    }

    Rational add(Rational b) {
        Rational c = new Rational(this.getZaehler() * b.getNenner() + this.getNenner() * b.getZaehler(), this.getNenner() * b.getNenner());
        return c;
    }

    Rational sub(Rational b) {
        Rational c = new Rational(this.getZaehler() * b.getNenner() - this.getNenner() * b.getZaehler(), this.getNenner() * b.getNenner());
        return c;
    }

    Rational mul(Rational b) {
        Rational c = new Rational(this.getZaehler() * b.getZaehler(), this.getNenner() * b.getNenner());
        return c;
    }

    Rational div(Rational b) {
        Rational c = new Rational(this.getZaehler() * b.getNenner(), this.getNenner() * b.getZaehler());
        return c;
    }

    // Getter and Setter
    public int getZaehler() {
        return zaehler;
    }

    public void setZaehler(int zaehler) {
        this.zaehler = zaehler;
    }

    public int getNenner() {
        return nenner;
    }

    public void setNenner(int nenner) {
        this.nenner = nenner;
    }
}
