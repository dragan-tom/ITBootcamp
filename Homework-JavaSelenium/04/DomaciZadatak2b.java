package sedmicaI.nedelja.domaciPetak;

public class DomaciZadatak2b {

    public static void main(String[] args) {

        int[] niz = { 5, 15, 23, 14, 18, 38, 40, 50, 2, 91, 76, 74, 105, 3, 355, 574, 333};

        System.out.println("Ispis clanova pre promene:");
        for (int i = 0; i < niz.length; i++) {
            System.out.println((i+1) + ". clan je: " + niz[i]);
        }

        // Promena:
        for (int i = 0; i < niz.length; i++) {
            if (i % 2 == 1)
                niz[i] += 2;
        }

        System.out.println("Ispis clanova posle promene:");
        for (int i = 0; i < niz.length; i++) {
            System.out.println((i+1) + ". clan je: " + niz[i]);
        }
        System.out.println("To bi bilo to. Pozdrav.");



    }
}
