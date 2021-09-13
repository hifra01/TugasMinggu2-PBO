package pbo.b.nim202410101061;

public class celcius {
    int suhu;

    public void setSuhu(int newsuhu){suhu = newsuhu;}

    int toFahrenheit(){
        return suhu*9/5 + 32;
    }
    int toKelvin(){
        return suhu + 273;
    }
    int toReamur(){
        return suhu*4/5;
    }
    public String tostring1(){
        return  "Nilai konversi suhu yaitu " + toFahrenheit() + "F ," + toKelvin() + "K ," + toReamur() + "R";
    }

}