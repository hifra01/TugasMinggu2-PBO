package pbo.b.nim202410101036;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("===========================================================================================");
        Mahasiswa dataDiri = new Mahasiswa("Andiko Yoga Wardhana", "202410101036", "Sistem Informasi");
        dataDiri.perkenalan();
        System.out.println("\n===========================================================================================");

        Celcius convertion = new Celcius();
        System.out.print("\nMasukkan Suhu (Celcius) : ");
        convertion.c = input.nextDouble();
        System.out.println("Fahrenheit : " + convertion.toFahrenheit());
        System.out.println("Kelvin     : " + convertion.toKelvin());
        System.out.println("Reaumur    : " + convertion.toReamur());


        System.out.println("\n===========================================================================================");
        BangunRuang blk = new BangunRuang();
        System.out.print("\nMasukkan Panjang (cm) : ");
        blk.panjang = input.nextInt();
        System.out.print("Masukkan Lebar   (cm) : ");
        blk.lebar = input.nextInt();
        System.out.print("Masukkan Tinggi  (cm) : ");
        blk.tinggi = input.nextInt();
        System.out.println("\n===========================================================================================\n");
        System.out.println("Luas Permukaan Balok (cm2) : " + blk.luasPermukaan());
        System.out.println("Volume Balok         (cm3) : " + blk.Volume());
        System.out.println("\n===========================================================================================");


    }
}

