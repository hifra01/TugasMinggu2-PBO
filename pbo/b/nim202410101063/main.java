package pbo.b.nim202410101063;

public class main {
    public static void main(String[] args) {
        mahasiswa mahasiswa1 = new mahasiswa("Shelsa Novita", "202410101062", "Sistem Informasi");
        mahasiswa1.perkenalan();

        System.out.println("\n==============================");
        celcius suhu1 = new celcius(10);
        System.out.println(suhu1.getSuhu()+ " Celcius to Fahrenheit: "+suhu1.getFahrenheit());
        System.out.println(suhu1.getSuhu()+ " Celcius to Kelvin    : "+suhu1.getKevin());
        System.out.println(suhu1.getSuhu()+ " Celcius to Reamur    : "+suhu1.getReamur());

        System.out.println("\n==============================");
        bangunRuang balok1 = new bangunRuang(2, 3, 4);
        System.out.println("Luas Permukaan Balok: "+ balok1.getluasPermukaan());
        System.out.println("Volume Balok        : "+ balok1.getVolume());


    }
}
