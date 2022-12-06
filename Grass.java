import java.applet.Applet;
import java.awt.*;

public class Grass {

    public static void drawGreen(Graphics g){
      g.setColor(new Color(111,245,103));
      g.fillRect(0,275,825,225);
    }

    public static void drawBushOne(Graphics g){
        g.setColor(new Color(11, 94, 16, 255));
        g.fillArc(75,325,75,75,0,180);
        g.fillArc(0,312,100,100,0,180);

    }

    public static void drawBushTwo(Graphics g){
    }
}
