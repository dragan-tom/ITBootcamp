package sedmicaIII.javaProjekat;

import java.util.Scanner;

public class Zadatak7 {

    public static int[] unesiBrojeve() {
        Scanner sc = new Scanner(System.in);
        int[] niz = new int[6];
        System.out.println("Unesite 6 celih brojeva:");
        for (int i = 0; i < 6; i++) {
            niz[i] = sc.nextInt();
        }
        return niz;
    }

    public static int[] randomBrojevi() {
        int[] niz = new int[30];
        for (int i = 0; i < 30; i++)
            niz[i] = (int) ((Math.random()) * 100);
        return niz;
    }

    static void bingo() {
        int[] nizKorisnika = unesiBrojeve();
        int[] izgenerisaniNiz = randomBrojevi();
        int brojac = 0;
        for (int i : nizKorisnika)
            for (int j : izgenerisaniNiz)
                if (i == j) {
                    System.out.println("Pogodjen broj: " + i);
                    brojac++;
                    // break; ja bih ovde stavio break ali primecujem da se nigde u zadatku ne zabranjuje ponavljanje, ni u korisnikovom izboru, ni u nasumicnom nizu.
                }
        if (brojac > 0)
            System.out.println("Broj pogodaka: " + brojac);
        else System.out.println("Nije bilo pogodaka.");
    }


    public static void main(String[] args) {


        bingo();


    }
}
