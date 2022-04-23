import PrzedstawiaEmocje.PrzedstawiaEmocje;
import Rysowalny.Rysowalny;

public class Buzka implements PrzedstawiaEmocje, Rysowalny {
    final char c1;

    public Buzka(char c) {
        c1 = c;
    }
    public String toString() {
        if(c1 == ')' )
            return ":-)";
        else
            return ":-(";
    }

    public void draw(int times) {
        System.out.print(toString());
        if (times > 1)
            System.out.print(")".repeat(times - 1));
        System.out.println();
    }

    @Override
    public void draw() {
        if(c1 == '(')
            System.out.println(":-(");
        else
            System.out.println(":-)");
    }

    @Override
    public boolean czySieUsmiecha() {
        if (c1 == ')')
            return true;
        else
            return false;
    }


    @Override
    public void przestanSieUsmiechac(){
    }

}
