package sedmicaV.utorak.domaci1;

public class Sportista {

    String ime;
    float jmbg;
    double plata;

    public Sportista(String ime, float jmbg, double plata) {
        this.ime = ime;
        this.jmbg = jmbg;
        this.plata = plata;
    }

    public Sportista() {
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public float getJmbg() {
        return jmbg;
    }

    public double getPlata() {
        return plata;
    }

    public void setJmbg(float jmbg) {
        this.jmbg = jmbg;
    }

    public void setPlata(double plata) {
        this.plata = plata;
    }

    @Override
    public String toString() {
        return "Sportista{" +
                "ime='" + ime + '\'' +
                ", jmbg=" + jmbg +
                ", plata=" + plata +
                '}';
    }
}
