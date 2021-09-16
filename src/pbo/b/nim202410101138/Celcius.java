package pbo.b.nim202410101138;

public class Celcius {
        double SuhuCelcius;
        public Celcius(double SuhuCelcius) {
            this.SuhuCelcius = SuhuCelcius;
        }
        double toFahreinhet() {
            return ((SuhuCelcius*9/5)+32);
        }
        double toKelvin() {
            return (SuhuCelcius + 273);
        }
        double toReamur() {
            return (SuhuCelcius*4/5);
        }
    }

