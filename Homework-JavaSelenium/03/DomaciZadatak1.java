package sedmicaI.nedelja.domaciCetvrtak;

import java.util.Scanner;

public class DomaciZadatak1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String pojedinacniUnosKorisnika = "";
        String konkatenacijaSvihUnosa = "";

        while(!pojedinacniUnosKorisnika.equalsIgnoreCase("stop")){
            konkatenacijaSvihUnosa += " " + pojedinacniUnosKorisnika;
            pojedinacniUnosKorisnika = sc.next();

        }
        konkatenacijaSvihUnosa = konkatenacijaSvihUnosa.trim();
        System.out.println(konkatenacijaSvihUnosa);
    }
}
