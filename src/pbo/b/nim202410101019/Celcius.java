package pbo.b.nim202410101019;

public class Celcius {
   double suhu;

   public Celcius (double celcius){
        suhu = celcius;
   }

   void toFahrenheit(){
       System.out.println((suhu * 1.8) + 32 + " F");
   }

   void toKelvin(){
       System.out.println(suhu + 273.15 + " K");
   }
   
   void toReamur(){
       System.out.println(suhu * (4/5) + " R");
   }
}
