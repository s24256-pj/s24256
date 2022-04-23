import MaWlasnosciRownolegloboku.MaWlasnosciRownolegloboku;
import MoznaWyznaczycWielokrotnoscPrzekatnej.MoznaWyznaczycWielokrotnoscPrzekatnej;
import MoznaWyznaczycWysokosc.MoznaWyznaczycWysokosc;

import javax.management.ObjectName;
import javax.xml.namespace.QName;
import java.util.Objects;

public class Prostokat implements MoznaWyznaczycWielokrotnoscPrzekatnej, MoznaWyznaczycWysokosc, MaWlasnosciRownolegloboku {
    final int bok1,bok2;

    public Prostokat(int bok11, int bok22) {
        bok2 = bok11;
        bok1 = bok22;
    }

    @Override
    public double bok() {
        return bok1;
    }

    @Override
    public boolean equals(Object obj) {

        if( (bok1 == (((MaWlasnosciRownolegloboku) obj).bok()) && katNachylenia() == ((MaWlasnosciRownolegloboku) obj).katNachylenia() && podstawa() == ((MaWlasnosciRownolegloboku) obj).podstawa()))
            return true;
        else
            return false;
    }


    //@Override
    //public int hashCode() {
        //return Objects.hash(bok1, bok2);
    //}

    @Override
    public double katNachylenia() {
        return Math.PI / 2;
    }

    @Override
    public double podstawa() {
        return bok2;
    }

    @Override
    public double przekatna(){
        return Math.sqrt((bok1 * bok1) + (bok2 * bok2));
    }

    @Override
    public String toString() {
        if(this instanceof Kwadrat)
            return "kwadrat";
        else
            return "prostokat";
    }

    @Override
    public double wysokosc() {
        return bok();
    }
    @Override
    public int wielokrotnoscPrzekatnej(int g) {
        return (int) (Math.sqrt((bok1 * bok1) + (bok2 * bok2))*g);
    }
    @Override
    public double wielokrotnoscPrzekatnej(double v) {
        return Math.sqrt((bok1 * bok1) + (bok2 * bok2))*v;
    }

}
