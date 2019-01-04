import javax.swing.*;

public class CoinProportions{
   

   public static void main(String args[]){
      String input = JOptionPane.showInputDialog("Amount to Sell");
      Currencies model = new Currencies(args[0], args[1], new Double(input).doubleValue(), new Double(args[2]).doubleValue());
      FrameAndPane frameAndPane = new FrameAndPane();
   }
}