package pbo.b.nim202410101127;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mh = new Mahasiswa();
        mh.perkenalan("Carenina Atiyar Pangastuti", "202410101127", "Sistem Informasi");

        System.out.println(" ");

        Celcius cs = new Celcius();
        Scanner cel = new Scanner(System.in);
        System.out.println("KONVERSI SUHU CELCIUS KE FARENTHEIT, REAMUR DAN KELVIN");
        System.out.println("Masukkan suhu dalam derajat celcius: ");
        cs.suhu = cel.nextInt();
        System.out.println("Konversi suhu dari " + cs.getSuhu() + " derajat Celcius ke Kelvin adalah " + cs.toKelvin());
        System.out.println("Konversi suhu dari " + cs.getSuhu() + " derajat Celcius ke Reamur adalah " + cs.toReamur());
        System.out.println("Konversi suhu dari " + cs.getSuhu() + " derajat Celcius ke Fahrenheit adalah " + cs.toFarentheit());

        System.out.println(" ");

        Kubus kb = new Kubus();
        Scanner ss = new Scanner(System.in);
        System.out.println("MENCARI LUAS PERMUKAAN DAN VOLUME KUBUS");
        System.out.println("Masukkan panjang sisi kubus dalam cm: ");
        kb.sisi= ss.nextInt();
        System.out.println("Luas permukaan bangun kubus adalah " + kb.luasPermukaan() + " cm");
        System.out.println("Volume bangun kubus adalah: "+kb.volume() + " cm");
    }
}
