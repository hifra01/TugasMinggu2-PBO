public class main {
    public static void main(String[] args) {
        //mahasiswa
        mahasiswa mahasiwa = new mahasiswa("Ferrary Ramadhan", "Sistem Informasi", "202410101005");
        mahasiwa.perkenalan();
        System.out.println("");

        //Celcius
        celcius celcius1 = new celcius(12);
        celcius1.toFahrenheit();
        celcius1.toKelvin();
        celcius1.toReamur();
        System.out.println("");

        //Bangun Ruang
        bangunRuang bangunRuang1 = new bangunRuang(12, 18, 24);
        bangunRuang1.luasPermukaan();
        bangunRuang1.volume();
    }
}
