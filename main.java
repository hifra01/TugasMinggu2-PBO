package pbo.b.nim202410101026;

public class main {
    public static void main(String[] args) {
        mahasiswa saya = new mahasiswa("Ayani", "202410101026", "Sistem Informasi");
        System.out.println(saya);

        celcius suhu = new celcius(70);
        System.out.printf("%nCelcius - Farenheit: %.2f F %n", suhu.toFarenheit());
        System.out.printf("Celcius - Kelfin: %.2f K %n", suhu.toKelfin());
        System.out.printf("Celcius - Reamur: %.2f R %n", suhu.toReamur());

        System.out.println("");
        kubus kubuss = new kubus(10);
        System.out.println("Volume kubus = " +kubuss.volume());
        System.out.println("Luas permukaan kubus = " + kubuss.luasPermukaan());
    }
}