package sedmicaV.sreda.Domaci2;

public class Tocak {
    private int trajanjeGume, cena;
    private boolean ostecenje;

    public Tocak(int trajanjeGume, int cena, boolean ostecenje) {
        this.trajanjeGume = trajanjeGume;
        this.cena = cena;
        this.ostecenje = ostecenje;
    }

    public Tocak() {
    }

    public int getTrajanjeGume() {
        return trajanjeGume;
    }

    public void setTrajanjeGume(int trajanjeGume) {
        this.trajanjeGume = trajanjeGume;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public boolean isOstecenje() {
        return ostecenje;
    }

    public void setOstecenje(boolean ostecenje) {
        this.ostecenje = ostecenje;
    }

    @Override
    public String toString() {
        return "Tocak{" +
                "trajanjeGume=" + trajanjeGume +
                ", cena=" + cena +
                ", ostecenje=" + ostecenje +
                '}';
    }
}
