package pbo.b.nim202410101011;

public class kubus {
    // property
    double sisiKubus;
    //constructor
    public kubus (double sisiKubus){
        this.sisiKubus = sisiKubus;
    }
    // method
    double luasPermukaan(){
        return(6*sisiKubus*sisiKubus);
    }
    double volume(){
        return (sisiKubus*sisiKubus*sisiKubus);
    }
}
