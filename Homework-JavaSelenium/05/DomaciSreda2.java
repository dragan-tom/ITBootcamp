package sedmicaII.domaci;

public class DomaciSreda2 {

    public static void main(String[] args) {

        int[] niz1 = {3, 5, 7, 3, 0};
        int[] niz2 = {0, 2, 0, 1, 4};

        int[] niz = new int[niz1.length];

        for (int i = 0; i < niz1.length; i++) {
            niz[i] = niz1[i] + niz2[i];
        }

        for (int i: niz) {
            System.out.println(i);
        }
    }
}
