package sedmicaIV.nedelja.domaci2;

public class SefSmene extends Radnik{

    private int nedeljniBonus;

    public SefSmene() {
    }

    public SefSmene(String imeRadnika, int satnica, int odradjeniSati, int nedeljniBonus) {
        super(imeRadnika, satnica, odradjeniSati);
        this.nedeljniBonus = nedeljniBonus;
    }


    public int getNedeljniBonus() {
        return nedeljniBonus;
    }

    public void setNedeljniBonus(int nedeljniBonus) {
        this.nedeljniBonus = nedeljniBonus;
    }

    @Override
    public String toString() {
        return "SefSmene{" +
                "nedeljniBonus=" + nedeljniBonus +
                ", imeRadnika='" + imeRadnika + '\'' +
                ", satnica=" + satnica +
                ", odradjeniSati=" + odradjeniSati +
                '}';
    }
}
