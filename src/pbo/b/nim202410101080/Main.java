package pbo.b.nim202410101080;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Mahasiswa
        System.out.println("MAHASISWA");
        System.out.println();
        Mahasiswa zaidan = new Mahasiswa("Zaidan Nur",202410101080L,"Sistem Informasi");
        zaidan.perkenalan();
        System.out.println("==============================================================");

        // Celcius
        System.out.println("CELCIUS");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Celcius degrees : ");
        double degree =sc.nextDouble();
        Celcius celcius_degree = new Celcius(degree);
        System.out.println("CONVERT TO :");
        System.out.println("1. Fahrenheit    | 2. Kelvin   | 3. Reamur");
        System.out.print("choose : ");
        int input = sc.nextInt();
        if(input == 1){
            System.out.println(degree+" C = "+celcius_degree.toFarenheit()+" F");
        } else if (input == 2){
            System.out.println(degree+" C = "+celcius_degree.toKelvin()+" K");
        }else if (input == 3){
            System.out.println(degree+" C = "+celcius_degree.toReamur()+" R");
        }
        System.out.println("==============================================================");

        // Cube
        System.out.println("CUBE");
        System.out.print("Masukkan panjang sisi kubus : ");
        double side = sc.nextDouble();
        Cube kubus = new Cube(side);
        System.out.println("Panjang sisi kubus = "+kubus.getSide_leght());
        System.out.println("Volume kubus = "+kubus.volume());
        System.out.println("Luas permukaan = "+kubus.surface_area());
    }
}
