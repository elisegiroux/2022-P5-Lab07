import java.applet.Applet;
import java.awt.*;

public class Background {

    public static void drawSky(Graphics g){
        g.setColor(new Color(116,222,250));
        g.fillRect(0,0,825,500);
        
    }
    public static void drawSun(Graphics g){
        g.setColor(new Color(250,235,143));
        g.fillOval(400,100,275,200);
    }

    public static void drawMntOne(Graphics g){
        Polygon mtnone = new Polygon();

        mtnone.addPoint(0,260);
        mtnone.addPoint(30,230);
        mtnone.addPoint(75,160);
        mtnone.addPoint(155,125);
        mtnone.addPoint(215,50);
        mtnone.addPoint(275,85);
        mtnone.addPoint(325,125);
        mtnone.addPoint(400,150);
        mtnone.addPoint(430,215);
        mtnone.addPoint(575,275);
        mtnone.addPoint(0,275);
        g.setColor(Color.lightGray);
        g.fillPolygon(mtnone);

    }
    public static void drawMntTwo(Graphics g){
        Polygon mtntwo = new Polygon();

        mtntwo.addPoint(450,275);
        mtntwo.addPoint(640,160);
        mtntwo.addPoint(680,97);
        mtntwo.addPoint(750,75);
        mtntwo.addPoint(825,0);
        mtntwo.addPoint(825,275);
        mtntwo.addPoint(425,275);
        g.setColor(Color.lightGray);
        g.fillPolygon(mtntwo);




    }

}
