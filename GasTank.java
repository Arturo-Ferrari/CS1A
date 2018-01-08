public class GasTank {

   static double amount = 0;

   public static void addGas (double amnt){

      amount += amnt;

   }

   public static void useGas(double amt){

      amount -= amt;

   }  

   public static double getGasLevel(){

      return amount;

   }

}