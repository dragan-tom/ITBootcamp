package sedmicaIII.javaProjekat;

public class ZadaciOd1Do6 {

    public static boolean find(String rec, String[] niz) {
        for (String s : niz)
            return rec.equalsIgnoreCase(s);
        return false;
    }

    public static double[] pomnozenoSaPI(int[] brojevi) {
        double[] niz = new double[brojevi.length];
        for (int i = 0; i < niz.length; i++)
            niz[i] = brojevi[i] * Math.PI;
        return niz;
    }

    public static String reverse(String rec) {
        String novaRec = "";
        for (int i = rec.length() - 1; i >= 0; i--)
            novaRec += rec.charAt(i);
        return novaRec;
    }

    public static void replaceWith(String[] niz, String oldString, String newString) {
        for (int i = 0; i < niz.length; i++) {
            if (oldString.equalsIgnoreCase(niz[i])) {
                System.out.println("Match found! Changing " + niz[i] + " to " + newString + ".");
                niz[i] = newString;
                break;
            }
            if (i == niz.length - 1)
                System.out.println("No matching String found.");
        }
    }

    public static void deljivSa(String broj) {
        int brojInt = Integer.parseInt(broj);
        for (int i = 1; i <= brojInt; i++) {
            if (brojInt % i == 0)
                System.out.println(i);
        }
    }

    public static int[] najveci(int[] niz1, int[] niz2) {
        int[] noviNiz;
        if (niz1.length >= niz2.length)
            noviNiz = new int[niz1.length];
        else noviNiz = new int[niz2.length];
        for (int i = 0; i < noviNiz.length; i++) {
            noviNiz[i] = Integer.MIN_VALUE;
        }
        for (int i = 0; i < niz1.length; i++) {
            noviNiz[i] = niz1[i];
        }
        for (int i = 0; i < niz2.length; i++) {
            if (niz2[i] > noviNiz[i])
                noviNiz[i] = niz2[i];
        }
        return noviNiz;
    }


    public static void main(String[] args) {

        String[] nizStringova = {"Svaki", "put", "je", "subota", "dan", "posle", "petka"};
        String subota = "subota";
        System.out.println(find(subota, nizStringova));

        int[] celiBrojevi = {2, -2, 0, 790, 0, 0, 1, -991, 33};
        for (double i : pomnozenoSaPI(celiBrojevi)) {
            System.out.print(((double) (Math.round(i * 100)) / 100) + " ");
        }
        System.out.println();

        String backwardWord = "desserts";
        System.out.println(reverse(backwardWord));

        String nedelja = "nedelja";
        replaceWith(nizStringova, subota, nedelja);
        for (String s : nizStringova) {
            System.out.print(s + " ");
        }
        System.out.println();

        deljivSa("15015");

        int[] celiBrojevi1 = {5, 34, -98, 790, 43, -762, 1, 1, 34};
        int[] celiBrojevi2 = {5, -34, -1, -790, 0, -107, 1, -1, 33, 0, -5, 515};
        int[] najveci = najveci(celiBrojevi1, celiBrojevi2);
        for (int i : najveci) {
            System.out.print(i + " ");
        }
        System.out.println();


    }
}
