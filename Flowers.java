import java.applet.Applet;
import java.awt.*;
public class Flowers {

    public static void RiverOne(Graphics g){
        Polygon rvrone = new Polygon();
        rvrone.addPoint(525,275);
        rvrone.addPoint(575,325);
        rvrone.addPoint(625,350);
        rvrone.addPoint(675,425);
        rvrone.addPoint(800,500);
        rvrone.addPoint(650,500);
        rvrone.addPoint(600,450);
        rvrone.addPoint(575,400);
        rvrone.addPoint(500,375);
        rvrone.addPoint(450,300);
        rvrone.addPoint(425,275);
        g.setColor(new Color(22,168,245));
        g.fillPolygon(rvrone);
    }
    public static void RiverTwo(Graphics g){
        Polygon rvrtwo = new Polygon();
        rvrtwo.addPoint(475,325);
        rvrtwo.addPoint(450,350);
        rvrtwo.addPoint(425,400);
        rvrtwo.addPoint(400,425);
        rvrtwo.addPoint(375,475);
        rvrtwo.addPoint(350,500);
        rvrtwo.addPoint(425,500);
        rvrtwo.addPoint(450,450);
        rvrtwo.addPoint(475,425);
        rvrtwo.addPoint(500,375);
        g.setColor(new Color(22,168,245));
        g.fillPolygon(rvrtwo);

    }


    }


