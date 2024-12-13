import java.awt.*;
import java.applet.Applet;
// <applet code="SimpleApplet" width=1000 height=1000></applet>
public class SimpleApplet extends Applet{
   public void paint(Graphics g){
      g.drawString("A Simple Applet",100,100);
   }
}