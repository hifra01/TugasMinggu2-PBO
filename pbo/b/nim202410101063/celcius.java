package pbo.b.nim202410101063;

public class celcius {
   private double suhu;
   
   //contructor
   public celcius(double suhu){
       this.suhu = suhu;
   }

   double getSuhu(){
       return this.suhu;
   }

   void setSuhu(double Newsuhu){
    this.suhu = Newsuhu;
   }

   double getFahrenheit(){
    return ((this.suhu * 9)/5 + 32);
   }

   double getKevin(){
       return (this.suhu + 273);
   }

   double getReamur(){
       return ((this.suhu * 4)/5);
   }

}
