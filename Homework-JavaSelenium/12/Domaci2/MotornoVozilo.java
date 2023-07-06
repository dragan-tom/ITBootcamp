package sedmicaV.sreda.Domaci2;

import java.util.ArrayList;

public abstract class MotornoVozilo {

    private ArrayList<Tocak> tockovi;
    private int cenaVozila, godinaProizvodnje, brojTockova;

    public MotornoVozilo(ArrayList<Tocak> tockovi, int cenaVozila, int godinaProizvodnje, int brojTockova) {
        this.tockovi = tockovi;
        this.cenaVozila = cenaVozila;
        this.godinaProizvodnje = godinaProizvodnje;
        this.brojTockova = brojTockova;
    }

    public MotornoVozilo() {
    }

    public ArrayList<Tocak> getTockovi() {
        return tockovi;
    }

    public void setTockovi(ArrayList<Tocak> tockovi) {
        this.tockovi = tockovi;
    }

    public int getCenaVozila() {
        return cenaVozila;
    }

    public void setCenaVozila(int cenaVozila) {
        this.cenaVozila = cenaVozila;
    }

    public int getGodinaProizvodnje() {
        return godinaProizvodnje;
    }

    public void setGodinaProizvodnje(int godinaProizvodnje) {
        this.godinaProizvodnje = godinaProizvodnje;
    }

    public int getBrojTockova() {
        return brojTockova;
    }

    public void setBrojTockova(int brojTockova) {
        this.brojTockova = brojTockova;
    }

    public abstract void daLiJeOstecen();

    public abstract void removeOstecenu();

    public abstract void ubaciRezervnu(ArrayList<Tocak> rezervniTockovi);

    @Override
    public String toString() {
        return "MotornoVozilo{" +
                "tockovi=" + tockovi +
                ", cenaVozila=" + cenaVozila +
                ", godinaProizvodnje=" + godinaProizvodnje +
                ", brojTockova=" + brojTockova +
                '}';
    }
}



