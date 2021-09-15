package pbo.b.nim202410101099;

public class main {
    public static void main(String[] args) {
        mahasiswa mahasiswa1 = new mahasiswa();
        mahasiswa1.setNama("Siti Nadiva Sam'iya");
        mahasiswa1.setNIM("202410101099");
        mahasiswa1.setProdi("Sistem Informasi");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println(mahasiswa1.tostring());
        System.out.println("-----------------------------------------------------------------------------------");

        celcius celcius1 = new celcius();
        celcius1.setCelcius(40);
        System.out.println("Nilai konversi suhu dari Celcius ke Fahrenheit adalah " + celcius1.toFahrenheit());
        System.out.println("Nilai konversi suhu dari Celcius ke Kelvin adalah " + celcius1.toKelvin());
        System.out.println("Nilai konversi suhu dari Celcius ke Reamur adalah " + celcius1.toReamur());
        System.out.println("-----------------------------------------------------------------------------------");

        bangunRuang bangunRuang1 = new bangunRuang();
        bangunRuang1.setSisi(12);
        System.out.println("Luas permukaan dari bangun ruang kubus yaitu " + bangunRuang1.luasPermukaan() + " m2");
        System.out.println("Volume dari bangun ruang kubus yaitu " + bangunRuang1.volume() + " m3");
        System.out.println("-----------------------------------------------------------------------------------");
    }
}
