package sedmicaII.domaci;

import java.util.Scanner;

public class DomaciCetvrtak1 {


    static int[] KreiranjeNovogNiza(int unos) {
        int[] niz = new int[unos];
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite elemente niza:");
        for (int i = 0; i < niz.length; i++) {
            niz[i] = sc.nextInt();
        }
        return niz;
    }

    static void promeniNeparneUParne(int[] niz) {
        for (int i = 0; i < niz.length; i++) {
            if (niz[i] % 2 == 1)
                niz[i] += 1;
        }
    }


    public static void main(String[] args) {

        //a) Napraviti funkciju za ubacivanje celih brojeva u niz.
        // U parametru metoda cemo imati broj koji predstavlja velicinu niza,
        // unutar funkcije cemo ubacivati elemente u niz i vratiti konacan niz.
        //b) Proci kroz zadati niz iz primera a) i svaki neparan broj pretvoriti u parni.

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite duzinu niza: ");
        int unos = sc.nextInt();


        int[] noviNiz = KreiranjeNovogNiza(unos);

        System.out.println("Resenje zadataka a:");
        for (int i : noviNiz) {
            System.out.println(i);
        }

        System.out.println("Resenje zadataka b:");
        promeniNeparneUParne(noviNiz);
        for (int i : noviNiz) {
            System.out.println(i);
        }


    }
}
