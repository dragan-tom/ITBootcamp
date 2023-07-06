package sedmicaV.sreda.Domaci2;

import java.util.ArrayList;

public class Kamion extends MotornoVozilo {
    public Kamion(ArrayList<Tocak> tockovi, int cenaVozila, int godinaProizvodnje, int brojTockova) {
        super(tockovi, cenaVozila, godinaProizvodnje, brojTockova);
    }

    public Kamion() {
    }

    @Override
    public void daLiJeOstecen() {
        for (int i = 0; i < getTockovi().size(); i++)
            if (getTockovi().get(i).getTrajanjeGume() > 120)
                getTockovi().get(i).setOstecenje(true);
    }

    @Override
    public void removeOstecenu() {
        for (int i = getTockovi().size(); i >= 0; i--) {
            if (getTockovi().get(i).getTrajanjeGume() > 120)
                getTockovi().remove(i);
        }
    }

    @Override
    public void ubaciRezervnu(ArrayList<Tocak> rezervniTockovi) {
        int indexRezervnihTockova = 0;
        for (int i = 0; i < getBrojTockova() - getTockovi().size(); i++) {
            getTockovi().add(rezervniTockovi.get(indexRezervnihTockova));
            indexRezervnihTockova++;
        }
    }


}
