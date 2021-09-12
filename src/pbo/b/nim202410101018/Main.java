package pbo.b.nim202410101018;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        class Mahasiswa
        Mahasiswa m1 = new Mahasiswa("Siti Nurul Laili", 202410101018L, "Sistem Informasi");
        m1.perkenalan();

        System.out.println();
        System.out.println("*************************************************************************************");

//        class Celcius
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan derajat Celcius : ");
        double celcius = scan.nextDouble();
        Celcius a = new Celcius();
        System.out.println("Celcius ke Fahrenheit : " + a.toFahreinheit(celcius) + " F");
        System.out.println("Celcius ke Kelvin : " + a.toKelvin(celcius) + " K");
        System.out.println("Celcius ke Reamur : " + a.toReamur(celcius) + " R");

        System.out.println();
        System.out.println("*************************************************************************************");

//        class Bangun Ruang
        Scanner scanJari = new Scanner(System.in);
        System.out.print("Masukkan jari-jari : ");
        double jariJari = scanJari.nextDouble();
        Scanner scanTinggi = new Scanner(System.in);
        System.out.print("Masukkan tinggi : ");
        double tinggi = scanTinggi.nextDouble();
        BangunRuang b = new BangunRuang();
        System.out.println("Luas Permukaan Tabung : " + b.luasPermukaan(jariJari, tinggi) + " cm");
        System.out.println("Volume Tabung : " + b.volume(jariJari, tinggi) + " cm");
    }
}
