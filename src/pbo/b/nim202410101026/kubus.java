package pbo.b.nim202410101026;

public class kubus {
    double sisiKubus;

    public kubus (double sisiKubus){
        this.sisiKubus = sisiKubus;
    }

    double volume(){
        return (sisiKubus*sisiKubus*sisiKubus);
    }
    double luasPermukaan(){
        return(6*sisiKubus*sisiKubus);
    }
}


