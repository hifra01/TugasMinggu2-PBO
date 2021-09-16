package pbo.b.nim202410101138;

//Mahasiswa
public class Main {
        public static void main(String[] args){Mahasiswa mahasiswa = new Mahasiswa("201410101111", "Ayaka", "90");
            mahasiswa.Mahasiswa();
        }
    }

//Celcius
public class Main {
    public static void main(String[] args) {
        Celcius SatuanUkur = new Celcius(150);
        System.out.println("Celcius To Fahrenheit = " + SatuanUkur.toFahreinhet());
        System.out.println("Celcius To Kelvin = " + SatuanUkur.toKelvin());
        System.out.println("Celcius To Reamur = " + SatuanUkur.toReamur());
    }
}

//BangunRuang
class kubusTest
{
    public static void main(String[] kubus)
    {
        kubus K = new kubus();
        System.out.println("Bangun Kubus");
        K.setSisi(8);
        K.setVolume();
        K.setLuasPermukaan();
        System.out.println("Panjang sisi kubus = "+ K.getSisi());
        System.out.println("Volume kubus = "+ K.getVolume());
        System.out.println("Luas permukaan kubus = "+ K.getLuasPermukaan());
    }
}