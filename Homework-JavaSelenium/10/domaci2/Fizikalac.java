package sedmicaIV.nedelja.domaci2;

public class Fizikalac extends Radnik{


    public Fizikalac() {
    }

    public Fizikalac(String imeRadnika, int satnica, int odradjeniSati) {
        super(imeRadnika, satnica, odradjeniSati);
    }

    @Override
    public String toString() {
        return "Fizikalac{" +
                "imeRadnika='" + imeRadnika + '\'' +
                ", satnica=" + satnica +
                ", odradjeniSati=" + odradjeniSati +
                '}';
    }
}
