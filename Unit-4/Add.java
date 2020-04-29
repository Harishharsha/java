import java.applet.*;
import java.awt.*;
public class Add extends Applet
{
	public void paint(Graphics g){
 
		int a=10,b=20,c;
		c=a+b;
		String msg;
		msg="Sum of a,b is: "+String.valueOf(c);
		g.drawString(msg,100,100);


	}
}