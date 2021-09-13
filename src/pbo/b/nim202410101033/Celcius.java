//Membuat Class Celcius

//1. Membuat package dengan nama pbo.b.nim202410101033
package pbo.b.nim202410101033;

//2. Membuat class Celcius
public class Celcius{
//3. Membuat rumus untuk Convert Celcius to Fahrenheit
  double Celcius;
  public double toFahrenheit(double c){
    Celcius = (c* 9/5) + 32;
    return Celcius;
}
//4. Membuat rumus untuk Convert Celcius to Reamur
  public double toReamur(double c){
    Celcius = (c* 4/5);
    return Celcius;
}
//5. Membuat rumus untuk Convert Celcius to Kelvin
  public double toKelvin(double c){
    Celcius = c + 273.15;
    return Celcius;
    }
}
