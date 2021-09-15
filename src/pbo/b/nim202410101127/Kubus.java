package pbo.b.nim202410101127;

public class Kubus {
    int sisi;
    int luasPermukaan;
    int volume;

    int getsisi(){

        return sisi;
    }
    void setSisi(){

        this.sisi = sisi;
    }

    int luasPermukaan(){
        return 6*sisi*sisi;
    }

    int volume(){
        return sisi*sisi*sisi;
    }
}
