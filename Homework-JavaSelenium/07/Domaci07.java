package sedmicaIV;

import java.util.ArrayList;
import java.util.List;

public class Domaci07 {

    public static List<Integer> kreiratiListuParnih(int brojParnih) {
        List<Integer> listaparnih = new ArrayList<>();
        for (int i = 2; listaparnih.size() < 20; i += 2) {
            listaparnih.add(i);
        }
        return listaparnih;
    }

    public static List<Integer> eliminiseDeljiveSaCetiri(int brojParnih) {
        List<Integer> bezDeljivihSaCetiri = kreiratiListuParnih(brojParnih);
        for (int i = bezDeljivihSaCetiri.size() - 1; i > 0; i--) {
            if (bezDeljivihSaCetiri.get(i) % 4 == 0)
                bezDeljivihSaCetiri.remove(i);
        }
        return bezDeljivihSaCetiri;
    }


    public static void main(String[] args) {


        List<Integer> listaBezDeljivihSaCetiri =eliminiseDeljiveSaCetiri(20);
        System.out.println(listaBezDeljivihSaCetiri);


    }
}
