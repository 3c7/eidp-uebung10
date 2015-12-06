package aufgabe2;

/**
 * Created by Nils on 08.12.2014.
 */
public class Test {
    public static void main(String[] args) {
        Weg w1 = new Weg(1, 1);
        Weg w2 = new Weg(2, 2);
        Weg w3 = new Weg(4, 70);
        w1.append(w2);
        w1.append(w3);
        System.out.println(w1.toString());
    }
}
