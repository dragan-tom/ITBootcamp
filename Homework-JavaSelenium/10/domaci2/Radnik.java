package sedmicaIV.nedelja.domaci2;

import java.util.Objects;


public class Radnik {

    String imeRadnika;
    int satnica, odradjeniSati;

    public Radnik() {
    }

    public Radnik(String imeRadnika, int satnica, int odradjeniSati) {
        this.imeRadnika = imeRadnika;
        this.satnica = satnica;
        this.odradjeniSati = odradjeniSati;
    }

    public int zarada() {
        if (this instanceof SefSmene sefSmene)
            return satnica * odradjeniSati + sefSmene.getNedeljniBonus();
        else return satnica * odradjeniSati;
    }

    public boolean daLiJeRadnikNaOdmoru() {
        if (this instanceof Masinovodja masinovodja)
            return odradjeniSati > 30;
        if (this instanceof Fizikalac fizikalac)
            return odradjeniSati > 40;
        else return odradjeniSati > 50;
    }

    public String getImeRadnika() {
        return imeRadnika;
    }

    public void setImeRadnika(String imeRadnika) {
        this.imeRadnika = imeRadnika;
    }

    public int getSatnica() {
        return satnica;
    }

    public void setSatnica(int satnica) {
        this.satnica = satnica;
    }

    public int getOdradjeniSati() {
        return odradjeniSati;
    }

    public void setOdradjeniSati(int odradjeniSati) {
        this.odradjeniSati = odradjeniSati;
    }

    @Override
    public String toString() {
        return "Radnik{" +
                "imeRadnika='" + imeRadnika + '\'' +
                ", satnica=" + satnica +
                ", odradjeniSati=" + odradjeniSati +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Radnik radnik)) return false;
        return satnica == radnik.satnica && odradjeniSati == radnik.odradjeniSati && Objects.equals(imeRadnika, radnik.imeRadnika);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imeRadnika, satnica, odradjeniSati);
    }
}
