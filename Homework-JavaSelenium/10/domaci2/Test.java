package sedmicaIV.nedelja.domaci2;

public class Test {

    public static void main(String[] args) {

        Radnik pera1 = new Radnik("Pera Peric", 3, 40);
        System.out.println(pera1.zarada());
        Masinovodja mileKitic = new Masinovodja("Mile Kitic", 5, 30);
        System.out.println(mileKitic.zarada());
        System.out.println(mileKitic.daLiJeRadnikNaOdmoru());
        Fizikalac raleKvaka = new Fizikalac("Rale Kvaka", 7, 41);
        System.out.println(raleKvaka.zarada());
        System.out.println(raleKvaka.daLiJeRadnikNaOdmoru());
        SefSmene bajaPatak = new SefSmene("Baja Patak", 10, 50, 1000);
        System.out.println(bajaPatak.zarada());
        System.out.println(bajaPatak.daLiJeRadnikNaOdmoru());
        System.out.println(bajaPatak);

    }
}
