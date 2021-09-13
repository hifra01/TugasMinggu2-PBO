//Membuat Class Mahasiswa

//1. Membuat package dengan nama pbo.b.nim202410101033
package pbo.b.nim202410101033;

//2. Membuat class Mahasiswa
public class Mahasiswa {
//3. Memilih tipe dari atribut di Mahasiswa
   String nama, nim, prodi;

//4. Membuat method dari class Mahasiswa
   Mahasiswa(String nama, String nim, String prodi){
     this.nama = nama;
     this.nim = nim;
     this.prodi = prodi;
   }
  Void perkenalan(){
    System.out.println("Hello, Nama Saya " + nama + "NIM " + nim + "Saya dari prodi " + prodi);
    }
}
