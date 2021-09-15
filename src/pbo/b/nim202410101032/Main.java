package pbo.b.nim202410101032;

class Main {
    public static void main (String[]args){
        Mahasiswa newNama = new Mahasiswa();
        newNama.datamhs("Widyarista Nariswari","202410101032", "Sistem Informasi");
        System.out.println("Halo! Nama saya " +newNama.outNama() + ", NIM " +newNama.outNIM() + ", dari Prodi " +newNama.outProdi() +".");

        Celcius celciusdegree = new Celcius(100);
        System.out.print("\n");
        System.out.print("- Konversi Celcius -");
        System.out.print("\nCelcius to Farenhait: "+celciusdegree.outFarenhait()+" F");
        System.out.print("\nCelcius to Kelvin: "+celciusdegree.outKelvin()+" K");
        System.out.print("\nCelcius to Reamur: "+celciusdegree.outReamur()+" R");

        BangunRuang prisma = new BangunRuang(3, 4, 5, 8);
        System.out.print("\n");
        System.out.println("\n- Menghitung Volume dan Luas Permukaan dari Prisma Segitiga -");
        System.out.println("Volume Prisma Segitiga: "+prisma.outVolume()+" cm3");
        System.out.println("Luas Permukaan Prisma Segitiga: "+prisma.outLuasPermukaan()+" cm2");
    }
}
