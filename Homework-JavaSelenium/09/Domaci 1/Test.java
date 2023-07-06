package sedmicaIV.nekiNoviObrazovniSistem;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        Departman informatika = new Departman("Informatika", 30, 3);
        Departman matematika = new Departman("Matematika", 41, 4);
        Departman biologija = new Departman("Biologija", 56, 5);

        ArrayList<Departman> basDobarDepartman = new ArrayList<>(Arrays.asList(informatika, matematika, biologija));
        Fakultet elekrotehnicki = new Fakultet("Elekrotehnicki", basDobarDepartman);
        System.out.println(elekrotehnicki.getDepartman().get(0).getBrojStudenata());
        System.out.println(elekrotehnicki.getUkupanBrojStudenata());


    }
}
