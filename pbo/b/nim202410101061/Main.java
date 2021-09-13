package pbo.b.nim202410101061;

public class Main {
    public static void main(String[] args) {
        mahasiswa mahasiswa1 = new mahasiswa();
        mahasiswa1.setNama("Aulia Sisdwiputri");
        mahasiswa1.setNim("2024101061");
        mahasiswa1.setProdi("Sistem Informasi");
        System.out.println(mahasiswa1.tostring());

        celcius celcius1 = new celcius();
        celcius1.setSuhu((32));
        System.out.println(celcius1.tostring1());

        bangunruang bangunruang1 = new bangunruang();
        bangunruang1.setLebar(10);
        bangunruang1.setPanjang(11);
        bangunruang1.setTinggi(12);
        System.out.println(bangunruang1.tostring2());

    }
}
