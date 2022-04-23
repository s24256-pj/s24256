package MoznaWyznaczycWysokosc;

import MaWlasnosciRownolegloboku.MaWlasnosciRownolegloboku;

public interface MoznaWyznaczycWysokosc extends MaWlasnosciRownolegloboku{

    default double wysokosc() {
        return bok();
    }
}
