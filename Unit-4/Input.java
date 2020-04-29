import java.applet.Applet;
import java.awt.*;

public class Input extends Applet
{
     String n="",ad="";
	 Label l1,l2;
     TextField name,addr;

     public void init()
    {
           l1 = new Label("Enter a name");
           add(l1);
           name = new TextField();
           add(name);
		   
		   l2 = new Label("Enter a address");
           
		   add(l2);
           addr = new TextField();
           add(addr);
    }

    public void paint(Graphics g)
   {
			 l2.setBounds(200,30,100,30);
			 addr.setBounds(300,30,100,30);
             g.drawString("Hello "+n,300,100);
			 g.drawString("From "+ad,300,120);
    }

    public boolean action(Event e,Object o)
   {
         n = name.getText();
		 ad=addr.getText();
         repaint();
         return true;
   }
}

/*<applet code='Input' width=500 height=500></applet>
*/