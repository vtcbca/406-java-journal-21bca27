import java.awt.*;
import java.applet.*;

public class pro_12 extends Applet 
{
    private int numOvals;

    public void init() 
    {
        String numOvalsStr = getParameter("numOvals");
        numOvals = Integer.parseInt(numOvalsStr);
    }
    public void paint(Graphics g) 
    {
        for (int i = 0; i < numOvals; i++) 
        {
            int a = (int)(Math.random() * 300);
            int b = (int)(Math.random() * 300);
            int c = (int)(Math.random() * 100);
            int d = (int)(Math.random() * 100);
            g.drawOval(a, b, c, d);
        }
    }
}