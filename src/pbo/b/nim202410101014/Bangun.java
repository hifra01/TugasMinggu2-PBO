package pbo.b.nim202410101014;
class bangunRuang{
    int sisi;

    public void setSisi(int newSisi){
        sisi = newSisi;
    }
    int getSisi(){
        return sisi;
    }
    int getLP(){
        return sisi*6;
    }
    int getVolume(){
        return sisi*sisi*sisi;
    }
}

