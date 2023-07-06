package sedmicaV.petak.domaci1;

public class Planina {

    private int visina;
    private String nazivPlanine;

    public Planina(int visina, String nazivPlanine) {
        this.visina = visina;
        this.nazivPlanine = nazivPlanine;
    }

    public Planina() {
        nazivPlanine = "";
    }

    public int getVisina() {
        return visina;
    }

    public void setVisina(int visina) {
        this.visina = visina;
    }

    public String getNazivPlanine() {
        return nazivPlanine;
    }

    public void setNazivPlanine(String nazivPlanine) {
        this.nazivPlanine = nazivPlanine;
    }

    @Override
    public String toString() {
        return "Planina{" +
                "visina=" + visina +
                ", nazivPlanine='" + nazivPlanine + '\'' +
                '}';
    }
}
