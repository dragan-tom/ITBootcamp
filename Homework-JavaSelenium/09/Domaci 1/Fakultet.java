package sedmicaIV.nekiNoviObrazovniSistem;

import java.util.ArrayList;

public class Fakultet {

    private String nazivFakulteta;
    private ArrayList<Departman> departman;

    public Fakultet(String nazivFakulteta, ArrayList<Departman> departman) {
        this.nazivFakulteta = nazivFakulteta;
        this.departman = departman;
    }


    public int getUkupanBrojStudenata() {
        int ukupanBrojStudenata = 0;
        for (int i = 0; i < getDepartman().size(); i++) {
            ukupanBrojStudenata += getDepartman().get(i).getBrojStudenata();
        }
        return ukupanBrojStudenata;
    }

    public void dodajPredmete(ArrayList<Departman> departman) {
        for (Departman d : departman)
            if (d.getNazivDepartmana().equalsIgnoreCase("matematika") || d.getNazivDepartmana().equalsIgnoreCase("biologija")) {
                d.setBrojStrucnihPredmeta(d.getBrojStrucnihPredmeta() + 5);
            } else System.out.println("Nema ni matematike ni informatike u listi, nije izvrsena promena.");

    }

    public void dodajPredmete(Departman departman) {
        if (departman.getNazivDepartmana().equalsIgnoreCase("matematika") || departman.getNazivDepartmana().equalsIgnoreCase("biologija")) {
            departman.setBrojStrucnihPredmeta(departman.getBrojStrucnihPredmeta() + 5);
        } else System.out.println("Prosledjeni departman nije ni matematika ni informatika, nije izvrsena promena.");

    }


    public String getNazivFakulteta() {
        return nazivFakulteta;
    }

    public void setNazivFakulteta(String nazivFakulteta) {
        this.nazivFakulteta = nazivFakulteta;
    }

    public ArrayList<Departman> getDepartman() {
        return departman;
    }

    public void setDepartman(ArrayList<Departman> departman) {
        this.departman = departman;
    }

    @Override
    public String toString() {
        return "Fakultet{" +
                "nazivFakulteta='" + nazivFakulteta + '\'' +
                ", departman=" + departman +
                '}';
    }
}
