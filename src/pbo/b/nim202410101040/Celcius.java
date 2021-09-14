package pbo.b.nim202410101040;

public class Celcius {
    
    Double celci;
    Double toFahrenheit() {
        return (celci * 1.8) + 32;
    }

    Double toKelvin() {
        return (celci + 273.15);
    }

    Double toReamur() {
        return (celci * 0.8);
    }
}
