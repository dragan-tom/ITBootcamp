package sedmicaIV.nekiNoviObrazovniSistem;

public class Departman {

    private String nazivDepartmana;
    private int BrojStudenata;
    private int brojStrucnihPredmeta;

    private void unosBrojaStudenata(int brojStudenata) {
        if (brojStudenata > 0)
            this.BrojStudenata = brojStudenata;
        else System.out.println("Niste uneli pozitivnu vrednost.");

    }

    private void unosBrojaStrucnihPredmeta(int brojStrucnihPredmeta){
        if( brojStrucnihPredmeta >0)
            this.brojStrucnihPredmeta = brojStrucnihPredmeta;
        else System.out.println("Niste uneli pozitivnu vrednost.");

    }

    public Departman(String nazivDepartmana, int brojStudenata, int brojStrucnihPredmeta) {
        this.nazivDepartmana = nazivDepartmana;
        unosBrojaStudenata(brojStudenata);
        unosBrojaStrucnihPredmeta(brojStrucnihPredmeta);
    }

   public void setBrojStudenata(int brojStudenata){
        unosBrojaStudenata(brojStudenata);
   }

   public void setBrojStrucnihPredmeta(int brojStrucnihPredmeta){
        unosBrojaStrucnihPredmeta(brojStrucnihPredmeta);
   }

    public void setNazivDepartmana(String nazivDepartmana) {
        this.nazivDepartmana = nazivDepartmana;
    }

    public String getNazivDepartmana() {
        return nazivDepartmana;
    }

    public int getBrojStudenata() {
        return BrojStudenata;
    }

    public int getBrojStrucnihPredmeta() {
        return brojStrucnihPredmeta;
    }

    @Override
    public String toString() {
        return "Departman{" +
                "nazivDepartmana='" + nazivDepartmana + '\'' +
                ", BrojStudenata=" + BrojStudenata +
                ", brojStrucnihPredmeta=" + brojStrucnihPredmeta +
                '}';
    }
}
