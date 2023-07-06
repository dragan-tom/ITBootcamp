package sedmicaIV.nedelja.domaci2;

public class Masinovodja extends Radnik {

    public Masinovodja() {
    }

    public Masinovodja(String imeRadnika, int satnica, int odradjeniSati) {
        super(imeRadnika, satnica, odradjeniSati);
    }

    @Override
    public String toString() {
        return "Masinovodja{" +
                "imeRadnika='" + imeRadnika + '\'' +
                ", satnica=" + satnica +
                ", odradjeniSati=" + odradjeniSati +
                '}';
    }
}
