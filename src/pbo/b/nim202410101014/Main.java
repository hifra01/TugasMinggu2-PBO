package pbo.b.nim202410101014;

public class Main {
    public static void main(String[] args){
        Mahasiswa1 mhs= new Mahasiswa1();
        mhs.setIdentitas("Eka Setyaningrum", "202410101014", "Sistem Informasi");
        System.out.println("Halo, nama saya "+mhs.readNama()+" NIM "+mhs.readNim()+" dari prodi "+mhs.readProdi()+" .");
        System.out.println("  ");
        suhuCelcius suhu1 = new suhuCelcius();
        suhu1.setCelcius(25);
        System.out.println("Celcius: "+suhu1.getCelcius());
        System.out.println("Fahrenheit: "+suhu1.getFahrenheit());
        System.out.println("Reamur: "+suhu1.getReamur());
        System.out.println("Kelvin: "+suhu1.getKelvin());
        System.out.println("  ");
        bangunRuang kubus = new bangunRuang();
        kubus.setSisi(12);
        System.out.println("Sisi Kubus: "+ kubus.getSisi()+" cm");
        System.out.println("Luas Pemukaan: "+ kubus.getLP()+" cm^2");
        System.out.println("Volume: "+ kubus.getVolume()+" cm^3");
    }
}
