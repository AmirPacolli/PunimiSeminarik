import javax.swing.*;
import java.awt.*;
import java.text.*;
public class FrameAndPane extends JPanel{
	
   private int width = Currencies.width, height = Currencies.height;
   private int baseDiameter = Currencies.baseDiameter;
   private int x1 = Currencies.x1, x2 = Currencies.x2, y1 = Currencies.y1, y2 = Currencies.y2;
   private double amountToSell = Currencies.amountToSell, amountToBuy = Currencies.amountToBuy;
   private double proportion = Currencies.proportion, diameterProportion = Currencies.diameterProportion;
   private String firstCurrency = Currencies.firstCurrency, secondCurrency = Currencies.secondCurrency;
   
   public FrameAndPane() {
      JFrame sampleFrame = new JFrame();
      sampleFrame.setSize(width, height);
      sampleFrame.setVisible(true);
      sampleFrame.getContentPane().add(this);
   }

   public void paintComponent(Graphics g){
      DecimalFormat formatter = new DecimalFormat("0.00");
   	 
      int diameter = (int) (baseDiameter);
      int secondDiameter = (int) (baseDiameter*diameterProportion);
   	   
      g.setColor(Color.black);
      g.fillRect(0, 0, width, height);
   	
      int centerer = 13;
      
      g.setColor(Color.blue);
      g.fillOval(x1, y1, diameter, diameter ); 
      g.setColor(Color.red);
      g.drawString(formatter.format(amountToSell), x1 + diameter/2 - centerer   , x1 + diameter/2 - centerer);
      g.drawString(firstCurrency  , x1 + diameter/2  - centerer, x1 + diameter/2 );
      
      g.fillOval(x2 + 20, y2,  secondDiameter, secondDiameter); 
      g.setColor(Color.blue);
      g.drawString(formatter.format(amountToBuy) , x2 + secondDiameter/2 - centerer, y2 + secondDiameter/2 - centerer);
      g.drawString(secondCurrency , x2 + secondDiameter/2 - centerer, y2 + secondDiameter/2);
   }
}
