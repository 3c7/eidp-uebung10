package aufgabe4;

/**
 * Created by Nils on 01.12.2014.
 */
public class Rechnen {

    /**
     * ggT(a,b): Berechnung des ggT mit dem euklidischem Algorithmus
     *
     * @param a
     * @param b
     * @return ggT
     */
    public static int ggT(int a, int b) {
        int temp;
        while (b != 0) {
            temp = a % b;
            a = b;
            b = temp;
        }
        return Math.abs(a);
    }

    public Rechnen(){}

}
