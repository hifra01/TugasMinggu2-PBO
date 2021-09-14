package pbo.b.nim202410101040;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

    Double suhuf, suhuk, suhur, luasPermukaan, volume;
    
    Scanner input = new Scanner(System.in);
    
    Mahasiswa profil = new Mahasiswa("Danang Setiawan", "202410101040", "Sistem Informasi");
    profil.dataDiri();

    Celcius conv = new Celcius();
    
    System.out.print("\nTuliskan suhu dalam celcius untuk dikonversi : ");
    conv.celci = input.nextDouble();
    suhuf = conv.toFahrenheit();
    suhuk = conv.toKelvin();
    suhur = conv.toReamur();

    System.out.println("Konversi ke fahrenheit adalah " + suhuf);
    System.out.println("Konversi ke fahrenheit adalah " + suhuk);
    System.out.println("Konversi ke fahrenheit adalah " + suhur);
    
    BangunRuang tabung = new BangunRuang();
    System.out.print("\nTuliskan nilai jari-jari : ");
    tabung.jarijari = input.nextDouble();
    System.out.print("Tuliskan nilai tinggi : ");
    tabung.tinggi = input.nextDouble();
    
    luasPermukaan = tabung.luasPermukaan();
    volume = tabung.volume();
    System.out.printf("Luas permukaan tabung adalah : %.2f ", luasPermukaan);
    System.out.printf("\nLuas volume tabung adalah : %.2f", volume);

    }
}