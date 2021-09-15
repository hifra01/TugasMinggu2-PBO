package pbo.b.nim202410101055;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Mahasiswa
        System.out.println("_______PERKENALAN MAHASISWA_______");
        System.out.println();
        Mahasiswa AlfianNr = new Mahasiswa("Alfian Nur Rizki", "202410101055", "Sistem Informasi");
        AlfianNr.perkenalan();
        System.out.println();
        System.out.println("===Perkenalan Mahasiswa Selesai===");
        System.out.println();

        //Celcius
        System.out.println();
        System.out.println("_______KONVERSI CELCIUS_______");
        System.out.println();
        Scanner fkr = new Scanner(System.in);
        System.out.print("Suhu celcius : ");
        double suhu = fkr.nextDouble();
        Celcius suhuC = new Celcius(suhu);
        System.out.println();
        System.out.println("Konfersi ke :");
        System.out.println("[1] Fahrenheit");
        System.out.println("[2] Kelvin");
        System.out.println("[3] Reamur");
        System.out.println();
        System.out.print("Masukkan pilihan Anda : ");
        int pilihan = fkr.nextInt();
        System.out.println();
        if (pilihan == 1) {
            System.out.println(suhu + " C = " + suhuC.to_Fahrenheit() + " F");
        }
        else if (pilihan == 2) {
            System.out.println(suhu + " C = " + suhuC.to_Kelvin() + " K");
        }
        else if (pilihan == 3) {
            System.out.println(suhu + " C = " + suhuC.to_Reamur() + " R");
        }
        else {
            System.out.println("Tidak ada pilihan " + pilihan);
        }
        System.out.println();
        System.out.println("===Konversi Celcius Selesai===");
        System.out.println();

        //BangunRuang
        System.out.println();
        System.out.println("_______HITUNG BALOK_______");
        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang : ");
        double panjang = input.nextDouble();
        System.out.print("Masukkan lebar   : ");
        double lebar = input.nextDouble();
        System.out.print("Masukkan tinggi  : ");
        double tinggi = input.nextDouble();
        BangunRuang panjangb = new BangunRuang(panjang,lebar,tinggi);
        System.out.println();
        System.out.println("Pilihan penghitungan :");
        System.out.println("[1] Luas permukaan balok");
        System.out.println("[2] Luas balok");
        System.out.println("[3] Panjang sisi keseluruhan");
        System.out.println();
        System.out.print("Masukkan pilihan Anda : ");
        int pil = input.nextInt();
        System.out.println();
        if (pil == 1) {
            System.out.println("Luas permukaan balok tersebut adalah " + panjangb.surface());
        }
        else if (pil == 2) {
            System.out.println("Luas balok tersebut adalah " + panjangb.volume());
        }
        else if (pil == 3) {
            System.out.println("Panjang sisi keseluruhan balok tersebut adalah " + panjangb.total_length_side());
        }
        else {
            System.out.println("Tidak ada pilihan " + pil + " pada menu.");
        }
        System.out.println();
        System.out.println("===Hitung Balok Selesai===");
    }
}
