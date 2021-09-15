package pbo.b.nim202410101030;

import java.util.Scanner;

public class BangunRuang {

    //    Property
    Double jarijari;

    //    Constructor
    public BangunRuang(Double jarijari) {
        this.jarijari = jarijari;
    }

    //    Method
    Double LuasPermukaan() {
        System.out.println("============================");
        System.out.println("Luas Permukaan Bola");
        System.out.println("Jari jari = " + jarijari+ " cm");
        double phi = 22/7.0;
        System.out.println("Luas = 4 × π × r² = " + (4*phi* jarijari * jarijari)+ " cm");
        return jarijari;

    }

    Double Volume() {
        System.out.println("============================");
        System.out.println("Volume Bola");
        System.out.println("Jari jari = " + jarijari+ " cm");
        int pangkat3 = (int) Math.pow(jarijari, 3);
        double phi = 22/7.0;
        double x = 4/3.0;
        System.out.println("Luas = 4/3 × π × r³ = " + (x*phi*pangkat3+ " cm"));
        return jarijari;

    }

}

