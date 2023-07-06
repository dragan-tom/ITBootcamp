package sedmicaV.utorak.domaci1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Sportista ronalidnho = new Sportista("Ronaldinho Gaucho", 07071977110099f, 4000);
        Sportista ortega = new Sportista("El Burito Ortega", 08081978887766f, 4500);
        Sportista buffon = new Sportista("Gianluigi Buffon", 09091979554433f, 5000);

        Sportista kezman = new Sportista("Mateja Kezman", 04041974009988f, 2500);
        Sportista zidan = new Sportista("Zinedin Zidan", 05051975776655f, 3000);
        Sportista stariRonaldo =  new Sportista("Da Lima Ronaldo", 06061976443322f, 3500);

        Sportista mijat = new Sportista("Predrag Mijatovic", 01011971998877f, 1000);
        Sportista piksi = new Sportista("Dragan Stojkovic", 02021972665544f, 1500);
        Sportista dejo = new Sportista("Dejan Savicevic", 03031973332211f, 2000);

        ArrayList<Sportista> manchesterIgraci= new ArrayList<>(Arrays.asList(ronalidnho, ortega, buffon));
        ArrayList<Sportista> arsenalIgraci= new ArrayList<>(Arrays.asList(kezman, zidan, stariRonaldo));
        ArrayList<Sportista> spartakIgraci= new ArrayList<>(Arrays.asList(mijat, piksi, dejo));

        Manchester manchester = new Manchester(manchesterIgraci, "Manchester", 250000);
        Arsenal arsenal = new Arsenal(arsenalIgraci, "London", 200000);
        Spartak spartak = new Spartak(spartakIgraci, "Subotica", 50000);

        System.out.println("Trenutni budget iznosti " + manchester.getBudzetKluba());
        System.out.println("trosak isplate zarada je: " + manchester.trosakIsplateZarada());
        System.out.println("Trenutna prosecna plata u klubu je: " + manchester.prosecnoPlaceni());
        System.out.println("Budget koji preostane, nakon sto se isplate zarade " + manchester.isplati());
        manchester.removePreplaceni();
        System.out.println("Nakon izbacivanja najskupljeg igraca, trosak isplate zarada je: " + manchester.trosakIsplateZarada());
        System.out.println("Nakon izbacivanja najskupljeg igraca,prosecna plata u klubu je: " + manchester.prosecnoPlaceni());

    }
}
