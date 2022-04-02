package Kwadrat;
import Prostokat.Prostokat;

public class Kwadrat extends Prostokat {
    public Kwadrat(double bok1,double bok2) {
        super(bok1,bok2);
    }

    public Kwadrat(double bok1) {
        super(bok1);
    }

    public double przekatna() {
        double bok1 = 1;
        double bok2 = bok1;
        double przekatna = Math.sqrt((bok1 * bok1) + (bok2 * bok2));
        return przekatna;
    }

}
