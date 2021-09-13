public class bangunRuang {
    double p, l, t;

    bangunRuang(double p, double l, double t){
        this.p = p;
        this.l = l;
        this.t = t;
    }

    void luasPermukaan(){
        System.out.println("Luas permukaan balok = " + 2*(p*l + p*l + l*t) + " cm persegi");
    }
    void volume(){
        System.out.println("Volume balok = " + p*l*t + " cm kubik");
    }
}
