package sedmicaIV.autoSkola;

public class AutoSkola {

    public String nazivSkole, tipVozila;
    public int brojPolaznika, cenaPolaganja;

    public AutoSkola(String nazivSkole, String tipVozila, int brojPolaznika, int cenaPolaganja) {
        this.nazivSkole = nazivSkole;
        this.tipVozila = tipVozila;
        this.brojPolaznika = brojPolaznika;
        this.cenaPolaganja = cenaPolaganja;
    }

    public void aktuelniPopust(String tipVozila) {
        if (tipVozila.equalsIgnoreCase("motor"))
            cenaPolaganja *= 0.5;
    }

    public int brojGrupa() {
        return brojPolaznika / 5;
    }

    public void mozeLiPolaganjeAutobusa() {
        System.out.println((tipVozila.equalsIgnoreCase("Autobus")) ? "Polaganje za autobus nije moguce" : "Polaganje je moguce");
    }

//    @Override
    public String toString() {
        return "AutoSkola{" +
                "nazivSkole='" + nazivSkole + '\'' +
                ", tipVozila='" + tipVozila + '\'' +
                ", brojPolaznika=" + brojPolaznika +
                ", cenaPolaganja=" + cenaPolaganja +
                '}';
    }
}
