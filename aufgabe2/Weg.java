package aufgabe2;

/**
 * Created by Nils on 08.12.2014.
 */
public class Weg {
    // Variablen
    private Punkt[] Wegpunkte;

    // Constructors
    public Weg(int x, int y) {
        this.Wegpunkte = new Punkt[1];
        this.Wegpunkte[0] = new Punkt(x, y);
    }

    // Methods
    public int count() {
        return this.Wegpunkte.length;
    }

    public void append(Weg a) {
        int wlen = this.Wegpunkte.length;
        Punkt[] temp = new Punkt[wlen];
        for (int i = 0; i < wlen; i++) {
            temp[i] = this.Wegpunkte[i];
        }
        this.Wegpunkte = new Punkt[wlen + 1];
        for (int i = 0; i < wlen; i++) {
            this.Wegpunkte[i] = temp[i];
        }
        this.Wegpunkte[wlen] = a.Wegpunkte[0];
    }

    public String toString() {
        String str = "";
        for (int i = 0; i < this.Wegpunkte.length; i++) {
            str += this.Wegpunkte[i].toString();
            if (i < this.Wegpunkte.length - 1) {
                str += " - ";
            }
        }
        return str;
    }

    // Getters & Setters
    public Punkt[] getWegpunkte() {
        return Wegpunkte;
    }

    public int getWegpunktX(int i) {
        return this.Wegpunkte[i].getX();
    }

    public int getWegpunktY(int i) {
        return this.Wegpunkte[i].getY();
    }

    public void setWegpunkte(Punkt[] wegpunkte) {
        Wegpunkte = wegpunkte;
    }
}
