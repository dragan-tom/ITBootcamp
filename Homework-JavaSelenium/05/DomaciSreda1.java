package sedmicaII.domaci;

import java.util.Scanner;

public class DomaciSreda1 {

    public static void main(String[] args) {

        // Na Zadatku 3 sa casa dodati funkcionalnost koja ispisuje koliko puta se neko ime pojavljuje u nizu.

        String[] niz = {"Sanja", "Miodrag", "Petar", "Zorica", "Jovan", "Arandjel,", "Miodrag", "Sreten", "Zorica", "Miodrag"};

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite trazeno ime: ");
        String unos = sc.next();
        int brojPojavljivanja = 0;

        for (int i = 0; i < niz.length; i++) {
            if(unos.equalsIgnoreCase(niz[i]))
                brojPojavljivanja++;
        }
        System.out.println("Trazeno ime se pojavljuje " + brojPojavljivanja + " puta.");


    }
}
