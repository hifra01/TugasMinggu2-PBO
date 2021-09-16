package pbo.b.nim202410101129;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Mahasiswa saya = new Mahasiswa("Dimas Galih Argi Pangestu", "202410101129", "Sistem Informasi");
        System.out.println(saya.perkenalan());



        Celcius suhu = new Celcius(100);
        System.out.println("Fahrenheit: " + suhu.toFahrenheit());
        System.out.println("Kelvin:" + suhu.toKelvin());
        System.out.println("Reamur:" + suhu.toReamur());



        System.out.println("Luas permukaan dan volume kubus");
        Kubus kubus = new Kubus();
        System.out.print("Masukkan sisi Kubus (dalam cm) : ");
        kubus.sisi = input.nextDouble();
        System.out.println("Luas permukaan Kubus: " + kubus.luasPermukaan());
        System.out.println("Volume Kubus : " + kubus.Volume());

    }
}