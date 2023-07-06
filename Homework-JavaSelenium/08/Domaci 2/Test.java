package sedmicaIV.autoSkola;

import sedmicaIV.autoSkola.AutoSkola;

public class Test {

    public static void main(String[] args) {

        AutoSkola polaganjeMotor = new AutoSkola("AS Sprint", "motor", 19, 24390);
        System.out.println(polaganjeMotor);

        polaganjeMotor.aktuelniPopust("motor");
        System.out.println(polaganjeMotor);

        System.out.println("Polaznici za " + polaganjeMotor.tipVozila+ " su podeljeni u " + polaganjeMotor.brojGrupa() + " grupa/e.");

        AutoSkola polaganjeAutobus = new AutoSkola("Vozi Misko", "autobus", 30, 89000);
        polaganjeAutobus.mozeLiPolaganjeAutobusa();


    }
}
