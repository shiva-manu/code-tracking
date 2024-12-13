import java.applet.Applet;
import java.awt.*;
/*    <APPLET CODE="HelloAppletMsg" width=500 height=400>
<PARAM NAME="Greeting" VALUE="Hello, How are you?"></PARAM>
</APPLET> */
public class HelloAppletMsg extends Applet{
   String msg;
   public void init(){
      msg=getParameter("Greetings");
      if(msg==null){
         msg="Hello";
      }
   }
   public void paint(Graphics g){
      g.drawString(msg,10,100);
   }
}

