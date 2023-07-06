package sedmicaI.nedelja.domaciPetak;

import java.util.Scanner;

public class DomaciZadatak1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dobar dan. Molimo unesite celi pozitivni broj n. Uradicemo proveru svih celih brojeva od n do 1, opadajucim redosledom.");
        System.out.println("Nakon provere, ukoliko je broj deljiv sa 3, sa 5, ili sa oba, ispisacemo odgovarajucu poruku.");
        System.out.println("A sada, izaberite broj n:");
        int unosKorisnika = sc.nextInt();
        System.out.println("Izabrali ste broj: " + unosKorisnika + ". Krecemo.");

        for (int i = unosKorisnika; i > 0; i--) {
            if (i % 15 == 0)
                System.out.println("Broj " + i + " je deljiv i sa 3 i sa 5. FizzBuzz!");
            else if (i % 5 == 0)
                System.out.println("Broj " + i + " je deljiv samo sa 5. Buzz!");
            else if (i % 3 == 0)
                System.out.println("Broj " + i + " je deljiv samo sa 3. Fizz!");
        }
        System.out.println("To bi bilo to sto se tice broja " + unosKorisnika + ". Pozdrav!");


    }
}
