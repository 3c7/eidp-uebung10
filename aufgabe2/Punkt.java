package aufgabe2;

/**
 * Created by Nils on 08.12.2014.
 */
public class Punkt {
    private int x,y;

    // Constructors
    public Punkt(int x, int y) {
        this.setX(x);
        this.setY(y);
    }

    // Methods
    public String toString() {
        return "(" + this.getX() + "," + this.getY() + ")";
    }

    // Getter & Setter
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
