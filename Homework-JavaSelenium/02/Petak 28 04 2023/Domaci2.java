package sedmicaI.utorak;

import java.util.Scanner;

public class Domaci2 {

    public static void main(String[] args) {

        double zumbulInt, orhidejaInt, bonzaiInt, ruzaInt;
        ruzaInt = 50;
        zumbulInt = ruzaInt + 20;
        orhidejaInt = zumbulInt * 2.5;
        bonzaiInt = orhidejaInt * 3;
        String ruzaString = "ruza";
        String ZumbulString = "zumbul";
        String orhidejaString = "orhideja";
        String BonzaiString = "bonzai";
        int unosKorisnika;

        Scanner sc = new Scanner(System.in);
        System.out.println("Dobrodosli u prodavnicu cveca. U ponudi imamo.");
        System.out.println("1. Ruza");
        System.out.println("2. Zumbul");
        System.out.println("3. Orhideja");
        System.out.println("4. Bonzai");
        System.out.println("Izaberite cvet unosom broja ispred naziva cveta(bez tacke):");
        unosKorisnika = sc.nextInt();
        System.out.println("Uneli ste " + unosKorisnika);

        if (unosKorisnika == 1)
            System.out.println("Ruza kosta:" + ruzaInt + " din.");
        else if (unosKorisnika == 2)
            System.out.println("Zumbul kosta:" + zumbulInt + " din.");
        else if (unosKorisnika == 3)
            System.out.println("Zumbul kosta:" + orhidejaInt + " din.");
        else if (unosKorisnika == 4)
            System.out.println("Zumbul kosta:" + bonzaiInt + " din.");
        else System.out.println("nepravilan izbor!");

    }

}
