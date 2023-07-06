package sedmicaI.nedelja.domaciCetvrtak;

import java.util.Scanner;

public class DomaciZadatak2 {

    public static void main(String[] args) {

        int stanjeRacuna, plata, brojRadnika;

        System.out.println("Dobrodosli. Ovaj program radi obracun plata i stanja na racunu.");
        System.out.println("Za pocetak, molimo unesite trazene parametre.");
        System.out.println("Unesite Vase stanje na racunu:");

        Scanner sc = new Scanner(System.in);
        stanjeRacuna = sc.nextInt();

        System.out.println("Unesite platu po zaposlenom.");
        plata = sc.nextInt();

        System.out.println("Unesite broj zaposlenih.");
        brojRadnika = sc.nextInt();

        stanjeRacuna -= plata * brojRadnika;
        System.out.println("Nakon isplate zarada, na Vasem racunu preostaje: " + stanjeRacuna + " dinara.");
        System.out.println("Hvala sto koristite nase usluge. Prijatan dan.");


    }
}
