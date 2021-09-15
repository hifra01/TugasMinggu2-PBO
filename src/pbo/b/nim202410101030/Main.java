package pbo.b.nim202410101030;

import java.util.Scanner;

public class Main {

//    Main Mahasiswa
    public static void main(String[] args){
        Mahasiswa aku = new Mahasiswa("Tanaya Naila Astari", "Sistem Informasi", "202410101030");
        String Nama = aku.Nama;
        String Prodi = aku.Prodi;
        String NIM = aku.NIM;
        System.out.println("---Perkenalan Mahasiswa---");
        aku.perkenalan();

//        Celcius
        System.out.println("");
        System.out.println("---Konversi Suhu---");
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan suhu dalam Celcius: ");
        Double Suhu = sc.nextDouble();
        Celcius suhunya = new Celcius(Suhu);

        suhunya.ToFahrenheit();
        suhunya.ToKelvin();
        suhunya.ToReamur();

//        Bangun Ruang
        System.out.println("");
        System.out.println("---Perhitungan Bangun Ruang Bola---");
        System.out.print("Masukkan Jari-jari Bola(cm) : ");
        Double jarijari = sc.nextDouble();
        BangunRuang hitung = new BangunRuang(jarijari);

        hitung.LuasPermukaan();
        hitung.Volume();
    }





}
