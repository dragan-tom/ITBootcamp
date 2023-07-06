package sedmicaI.nedelja.domaciPetak;

import java.sql.SQLOutput;

public class DomaciZadatak2a {

    public static void main(String[] args) {

        int[] niz = { 5, 15, 23, 14, 18, 38, 40, 50, 2, 91, 76, 74, 105, 3, 355, 574, 333};

        System.out.println("Ispis clanova pre promene:");
        for (int i = 0; i < niz.length; i++) {
            System.out.println((i+1) + ". clan je: " + niz[i]);
        }

        // Promena:
        for (int i = 0; i < niz.length; i++) {
            if (niz[i] % 2 == 0)
                niz[i] += 1;
        }

        System.out.println("Ispis clanova posle promene:");
        for (int i = 0; i < niz.length; i++) {
            System.out.println((i+1) + ". clan je: " + niz[i]);
        }
        System.out.println("Sada su svi brojevi u nisu neparani. Cestitamo!");


    }
}
