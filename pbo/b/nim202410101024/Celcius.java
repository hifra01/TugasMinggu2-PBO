package pbo.b.nim202410101024;

public class Celcius {
    double temp;

    public void setTemp(double newtemp) {
        temp = newtemp;
    }

        double ToFahreinheit () {
            return temp * (9 / 5) + 32;
        }
        double ToKelvin () {
            return temp + 273;
        }
        double ToReamur () {
            return (4 * temp) / 5;
        }
        public String tostring(){
        return "Nilai konversi suhu dari celcius yaitu" + "" + "\n" + ToFahreinheit() + "Fahreinheit"
                + "\n"+ ToKelvin() + "Kelvin " + "\n " + ToReamur() + "Reamur";
        }

}


