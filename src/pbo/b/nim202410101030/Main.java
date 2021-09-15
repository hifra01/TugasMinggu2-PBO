package pbo.b.nim202410101030;

import java.util.Scanner;

public class Main {

//    Main Mahasiswa
    public static void main(String[] args){
        Mahasiswa aku = new Mahasiswa("Tanaya Naila Astari", "Sistem Informasi", "202410101030");
        String Nama = aku.Nama;
        String Prodi = aku.Prodi;
        String NIM = aku.NIM;

        aku.perkenalan();
    }

//    Main Celcius
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan suhu dalam Celcius: ");
        Double Suhu = sc.nextDouble();
        Celcius suhunya = new Celcius(Suhu);

        suhunya.ToFahrenheit();
        suhunya.ToKelvin();
        suhunya.ToReamur();

    }

//        Main BangunRuang
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("---Perhitungan Bangun Ruang Bola---");
        System.out.print("Masukkan Jari-jari Bola(cm) : ");
        Double jarijari = sc.nextDouble();
        BangunRuang hitung = new BangunRuang(jarijari);

        hitung.LuasPermukaan();
        hitung.Volume();
    }

}
