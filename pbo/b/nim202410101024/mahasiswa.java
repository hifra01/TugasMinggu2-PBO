package pbo.b.nim202410101024;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.sound.sampled.SourceDataLine;
import java.sql.SQLOutput;

public class mahasiswa {
    String nama;
    String nim;
    String prodi;

    public mahasiswa(String paramnama, String paramnim, String paramprodi)
    {
        nama = paramnama;
        nim = paramnim;
        prodi = paramprodi;
    }
public void mahasiswa() {
    System.out.println("Halo, nama saya" + " " + nama + ","+ " " + "NIM" + " " + nim +"," + " "
            + "dari prodi" + " " + prodi);
}
}

