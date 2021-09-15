package pbo.b.nim202410101106;

class Main {
    public static void main(String[]args){
        Mahasiswa Nama1 = new Mahasiswa();
        Nama1.identitas("Tahta Nimas Putri Rahayu", "202410101106", "Sistem Informasi");
        System.out.println("Halo, nama saya "+Nama1.OutputNama() + ", NIM "+Nama1.OutputNIM() + ", dari prodi "+Nama1.OutputProdi() +".");

        Celcius Suhu1 = new Celcius(36);
        System.out.println("---------------------");
        System.out.println("PROGRAM KONVERSI SUHU");
        System.out.println("---------------------");
        System.out.println("Suhu: "+Suhu1.Suhu+" C");
        System.out.println("Celcius to Farenheit : "+Suhu1.outputToFahrenheit()+" F");
        System.out.println("Celcius to Kelvin : "+Suhu1.outputToKelvin()+" K");
        System.out.println("Celcius to Reamur : "+Suhu1.outputToReamur()+" R");

        BangunRuang Tabung = new BangunRuang();
        System.out.println("-------------------------------------------------------");
        System.out.println("PROGRAM MENGHITUNG LUAS PERMUKAAN & VOLUME BANGUN RUANG");
        System.out.println("-------------------------------------------------------");
        System.out.println("Tabung dengan tinggi: "+Tabung.Tinggi +" cm & jari-jari: "+Tabung.Jari_Jari +" cm, memiliki");
        System.out.println("Luas Permukaan Tabung: "+Tabung.OutputLuasPermukaan()+ " cm2");
        System.out.println("Volume Tabung: "+Tabung.OutputVolume()+ " cm3");
    }
}