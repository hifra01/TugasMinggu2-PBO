package pbo.b.nim202410101085;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();

        mahasiswa.setNama("Nike Ananda Putri");
        System.out.println(mahasiswa.mhsNama());

        mahasiswa.setNIM("202410101085");
        System.out.println(mahasiswa.mhsNIM());

        mahasiswa.setProdi("Sistem Informasi");
        System.out.println(mahasiswa.mhsProdi());

        System.out.println(mahasiswa.gabung());

        Celcius celcius = new Celcius();
        celcius.setSuhu((50));
        System.out.println(celcius.gabung1());

        BangunRuangKubus bangunRuangKubus  = new BangunRuangKubus();
        bangunRuangKubus.setSisi(6);
        System.out.println(bangunRuangKubus.gabung2());
    }
}