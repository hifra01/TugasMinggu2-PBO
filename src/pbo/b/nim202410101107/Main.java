package pbo.b.nim202410101107;

public class Main {
    public static void main(String[] args) {
        BangunRuangTabung Tabung1 = new BangunRuangTabung(7,15);

        double LuasPermukaan = Tabung1.LuasPermukaan;
        double Volume = Tabung1.Volume;

        System.out.println("Luas Permukaan dan Volume Tabung");
        System.out.println("================================");
        System.out.println("Luas Permukaan Tabung adalah : " + Tabung1.LuasPermukaan() + " cm2");
        System.out.println("Volume Tabung adalah : " + Tabung1.Volume() + " cm3");
    }
}
class mainCelcius {
    public static void main(String[] args) {
        CelciusFarenheit Celcius1 = new CelciusFarenheit(78);

        System.out.println("Derajat Farenheit adalah : " + Celcius1.ToFarenheit() + " F");
        System.out.println("Derajat Kelvin adalah : " + Celcius1.ToKelvin() + " K");
        System.out.println("Derajat Reamur adalah : " + Celcius1.ToReamur() + "R");

    }
}
class mainBangunRuangTabung {
    public static void main(String[] args) {
        BangunRuangTabung Tabung1 = new BangunRuangTabung(7, 15);

        double LuasPermukaan = Tabung1.LuasPermukaan;
        double Volume = Tabung1.Volume;

        System.out.println("Luas Permukaan dan Volume Tabung");
        System.out.println("================================");
        System.out.println("Luas Permukaan Tabung adalah : " + Tabung1.LuasPermukaan() + " cm2");
        System.out.println("Volume Tabung adalah : " + Tabung1.Volume() + " cm3");

    }
}
