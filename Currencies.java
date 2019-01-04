public class Currencies{

   private static int cornerLength = 20;
   public static String firstCurrency, secondCurrency;
   public static double amountToSell, proportion;
   public static double diameterProportion, amountToBuy;
   public static int width = 1500, height = 1000;
   public static int baseDiameter = 400;
   public static int x1 = cornerLength, y1 = cornerLength;
   public static int x2 = cornerLength + (int) baseDiameter, y2 = cornerLength; 

   public Currencies(String firstCurrency, String secondCurrency, double amountToSell, double proportion){
      this.firstCurrency = firstCurrency;
      this.secondCurrency = secondCurrency;
      this.amountToSell = amountToSell;
      this.proportion = proportion;
      this.amountToBuy = amountToSell*proportion;
      this.diameterProportion = Math.log(Math.PI*baseDiameter*baseDiameter*proportion*proportion)/Math.log(Math.PI*baseDiameter*baseDiameter);
   }
}