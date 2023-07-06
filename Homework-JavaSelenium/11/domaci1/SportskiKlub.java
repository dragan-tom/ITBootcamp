package sedmicaV.utorak.domaci1;

import java.util.ArrayList;

public class SportskiKlub {

    ArrayList<Sportista> sportisti = new ArrayList<>();
    String nazivGrada;
    double budzetKluba;

    public SportskiKlub(ArrayList<Sportista> sportisti, String nazivGrada, double budzetKluba) {
        this.sportisti = sportisti;
        this.nazivGrada = nazivGrada;
        this.budzetKluba = budzetKluba;
    }

    public SportskiKlub() {
    }

    public double trosakIsplateZarada() {
        double zaradaTotal = 0;
        for (int i = 0; i < sportisti.size(); i++) {
            zaradaTotal += sportisti.get(i).getPlata();
        }
        return zaradaTotal;

    }

    public double isplati() {
        return budzetKluba - trosakIsplateZarada();
    }

    public double prosecnoPlaceni() {
        return trosakIsplateZarada() / sportisti.size();
    }

    public void removePreplaceni() {
        for (int i = sportisti.size() - 1; i >= 0; i--) {
            if (sportisti.get(i).getPlata() > prosecnoPlaceni()) {
                System.out.println("Zbog velike plate, iz kluba je izbacen: " + sportisti.get(i));
                sportisti.remove(i);
                break;
            }
        }
    }


    public ArrayList<Sportista> getSportisti() {
        return sportisti;
    }

    public void setSportisti(ArrayList<Sportista> sportisti) {
        this.sportisti = sportisti;
    }

    public String getNazivGrada() {
        return nazivGrada;
    }

    public void setNazivGrada(String nazivGrada) {
        this.nazivGrada = nazivGrada;
    }

    public double getBudzetKluba() {
        return budzetKluba;
    }

    public void setBudzetKluba(double budzetKluba) {
        this.budzetKluba = budzetKluba;
    }

    @Override
    public String toString() {
        return "SportskiKlub{" +
                "sportisti=" + sportisti +
                ", nazivGrada='" + nazivGrada + '\'' +
                ", budzetKluba=" + budzetKluba +
                '}';
    }
}
