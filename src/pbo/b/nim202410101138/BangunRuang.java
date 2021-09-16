package pbo.b.nim202410101138;

import java.lang.Math;
class kubus
{
    private int sisi, volume, luasPermukaan;
    public void setSisi(int s) {
        sisi = s;
    }
    public void setVolume() {
        volume = (int) Math.pow(sisi, 3);
    }
    public void setLuasPermukaan() {
        luasPermukaan = (int) Math.pow(sisi,2) * 6;
    }

    public int getSisi() {
        return sisi;
    }
    public int getVolume() {
        return volume;
    }
    public int getLuasPermukaan() {
        return luasPermukaan;
    }
}
