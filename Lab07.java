import java.applet.Applet;
import java.awt.*;
public class Lab07 extends Applet {

    public void paint(Graphics g){

        Background.drawSky(g);
        Background.drawSun(g);
        Background.drawMntOne(g);
        Background.drawMntTwo(g);

        Grass.drawGreen(g);
        Grass.drawBushOne(g);
        Grass.drawBushTwo(g);

        Flowers.drawPinkAndYellowOne(g);
        Flowers.drawPinkAndYellowTwo(g);
        Flowers.drawYellowAndBlackOne(g);
        Flowers.drawYellowAndBlackTwo(g);
        Flowers.drawOrangeAndPinkOne(g);
        Flowers.drawOrangeAndPinkTwo(g);






    }
}
