package pbo.b.nim202410101014;
class suhuCelcius{
    int suhu;
    //method
    public void setCelcius(int newCelcius){
        suhu = newCelcius;
    }
    int getCelcius(){
        return suhu;
    }
    int getFahrenheit(){
        return ((suhu*9)/5)+32;
    }
    int getReamur(){
        return (suhu*4)/5;
    }
    int getKelvin(){
        return (suhu+273);
    }

}

