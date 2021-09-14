package pbo.b.nim202410101082;

public class Main {
    public static void main(String[] args) {
        Mahasiswa rida = new Mahasiswa("Ridayanti Yoviandri", "202410101082", "SI");
        System.out.println(rida);
        System.out.println("--------------");
        Celcius temp = new Celcius(12);
        System.out.println("Fahrenheit = " + temp.suhuFahrenheit());
        System.out.println("Kelvin = " + temp.suhuKelvin());
        System.out.println("Reamur = " + temp.suhuReamur());
        System.out.println("--------------");
        BangunRuang bola = new BangunRuang(12);
        System.out.println("Volume = " + bola.VolumeBangun());
        System.out.println("Luas permukaan = " + bola.LuasPermukaan());
    }
}
