package pbo.b.nim202410101064;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa("Faruq Abdul Hakim", "202410101064", "Sistem Informasi");
        System.out.println(mahasiswa.perkenalan());

        Celcius celcius = new Celcius(100);
        System.out.printf("Ke Fahrenheit: %.2f%n", celcius.toFahrenheit());
        System.out.printf("Ke Kelvin: %.2f%n", celcius.toKelvin());
        System.out.printf("Ke Reamur: %.2f%n", celcius.toReamur());

        Tabung tabung = new Tabung(15, 20);
        System.out.printf("Luas permukaan tabung: %.2f satuan%n", tabung.luasPermukaan());
        System.out.printf("Volume tabung: %.2f satuan%n", tabung.volume());
    }
}
