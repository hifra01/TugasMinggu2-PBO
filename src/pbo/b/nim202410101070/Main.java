package pbo.b.nim202410101070;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //  inisiasi scanner
        Scanner input = new Scanner(System.in);

        //  Pemanggilan pada class Mahasiswa
        System.out.println("MAHASISWA");
        Mahasiswa me = new Mahasiswa("Nur Muhammad Himawan", "202410101070", "Sistem Informasi");
        System.out.println(me.perkenalan());
        System.out.println("====================================================================================");

        //  Pemanggilan pada class Celcius
        System.out.println("KONVERSI SUHU CELCIUS");
        Celcius konversi = new Celcius();
        System.out.print("Masukkan suhu yang ingin dikonversi (Celcius): ");
        konversi.suhu = input.nextDouble();
        System.out.printf("Fahrenheit: %.2f%n", konversi.toFahrenheit());
        System.out.printf("Kelvin: %.2f%n", konversi.toKelvin());
        System.out.printf("Reamur: %.2f%n", konversi.toReamur());
        System.out.println("====================================================================================");

        //  Pemanggilan pada class Bangun Ruang
        System.out.println("LUAS PERMUKAAN DAN VOLUME BOLA");
        Bola bola = new Bola();
        System.out.print("Masukkan jari-jari bola (dalam cm) : ");
        bola.r = input.nextDouble();
        System.out.printf("Luas permukaan bola: %.2f cm2 %n", bola.luasPermukaan());
        System.out.printf("Volume bola: %.2f cm2 %n", bola.volume());
        System.out.println("====================================================================================");
    }
}
