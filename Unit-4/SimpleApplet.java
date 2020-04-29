import java.awt.*;
import java.applet.*;
public class SimpleApplet extends Applet
{
	public void paint(Graphics g)
	{
		g.drawString("A Simple Applet", 300, 200);
	}
}
/*
<applet code="SimpleApplet" width=600 height=400> </applet>
*/