package sedmicaI.utorak;

import java.util.Scanner;

public class Domaci1 {

    public static void main(String[] args) {

        double satnica, brojRadnihSati, plata;
        System.out.println("Unesite satnicu:");
        Scanner sc = new Scanner(System.in);
        satnica = sc.nextDouble();
        System.out.println("Unesite broj radnih sati:");
        brojRadnihSati = sc.nextDouble();
        plata = satnica * brojRadnihSati;

        if (satnica < 0 || brojRadnihSati < 0)
            System.out.println("Paznja! Uneli ste negativnu vrednost");
        else
            System.out.println(plata);




    }
}
