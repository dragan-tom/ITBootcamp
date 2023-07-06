package sedmicaV.petak.domaci1;

import java.util.ArrayList;
import java.util.Arrays;

public class Planinar implements Planinarenje{

    private ArrayList<Planina> planine;
    private int maksimalniUspon, tezinaOpreme;


    public Planinar(ArrayList<Planina> planine, int maksimalniUspon, int tezinaOpreme) {
        this.planine = planine;
        this.maksimalniUspon = maksimalniUspon;
        this.tezinaOpreme = tezinaOpreme;
    }

    public Planinar() {
        planine = new ArrayList<>();
    }

    @Override
    public void popniSe(Planina p) {
        if (p.getVisina() < maksimalniUspon)
            planine.add(p);
    }

    @Override
    public int clanarina() {
        return 1000*(100-(planine.size()*2)/100);
    }

    @Override
    public int sviUsponi() {
        int sum = 0;
        for (Planina p : planine) {
            sum += p.getVisina();
        }
        return sum;
    }

    @Override
    public Planina najvecaPlanina() {
        Planina p = planine.get(0);
        for (int i = 1; i < planine.size(); i++) {
            if (planine.get(i).getVisina() > p.getVisina())
                p = planine.get(i);
        }
        return p;
    }

    @Override
    public String toString() {
        return "Planinar{" +
                "planine=" + planine +
                ", maksimalniUspon=" + maksimalniUspon +
                ", tezinaOpreme=" + tezinaOpreme +
                '}';
    }
}
