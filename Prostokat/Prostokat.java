package Prostokat;

public class Prostokat {
    public Prostokat(double bok1, double bok2) {
    }

    public Prostokat(double bok1) {
    }


    public double przekatna(double v) {
        double bok1 = 1;
        double bok2 = 2;
        double przekatna1 = Math.sqrt((bok1 * bok1) + (bok2 * bok2));
        return przekatna1*v;
    }

    public double przekatna() {
        double bok1 = 1;
        double bok2 = 2;
        double przekatna = Math.sqrt((bok1 * bok1) + (bok2 * bok2));
        return przekatna;
    }

}
