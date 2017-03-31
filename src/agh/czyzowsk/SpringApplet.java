package agh.czyzowsk;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Damian on 2017-03-30.
 */
public class SpringApplet extends JApplet {

    @Override
    public void init(){
    }

    public void paint(Graphics g) {
        Vector2D vector1 = new Vector2D(-200, 180);
        Vector2D vector2 = new Vector2D(310, -25);

        drawAxis(g, "Wykres wektorów", 2);

        g.setColor(Color.GREEN);
        drawLine(g, sumTwoVectors(vector1, vector2));
        g.setColor(Color.RED);
        drawLine(g, vector1);
        g.setColor(Color.BLUE);
        drawLine(g, vector1, vector2);
    }

    public Vector2D sumTwoVectors(Vector2D vector1, Vector2D vector2){
        Vector2D sumVectors = vector1.sumWithVector(vector2);
        return sumVectors;
    }

    public void drawLine(Graphics g, Vector2D vector){
        int[] position = vector.position;
        g.drawLine(getSize().width/2, getSize().height/2, getSize().width/2 + position[0],
                getSize().height/2 - position[1]);
        g.drawString("x: " + position[0] + " y: " + position[1], getSize().width/2, 40);
    }

    public void drawLine(Graphics g, Vector2D vectOdniesienia, Vector2D vectorGlowny){
        int[] positionPocz = vectOdniesienia.position;
        int[] position = vectorGlowny.position;
        g.drawLine(getSize().width/2 + positionPocz[0], getSize().height/2 - positionPocz[1],
                getSize().width/2 + positionPocz[0] + position[0],
                getSize().height/2 - positionPocz[1] - position[1]);
        g.drawString("x: " + position[0] + " y: " + position[1], getSize().width/2, 40);
    }

    public void drawAxis(Graphics g, String title, int a){
        g.drawString(title, 175, 20);


        g.setColor(Color.LIGHT_GRAY);

        for(int i = (getSize().width)/20-8; i > -(getSize().width)/20+5; i--){
            g.drawLine(getSize().width/2 + i*10, (getSize().height)/2 + 4, getSize().width/2 + i*10,
                    (getSize().height)/2 - 4);
            System.out.print(i);
        }

        for(int i = (getSize().height)/20-6; i > -(getSize().height)/20+7; i--){
            g.drawLine( (getSize().width)/2 + 4,getSize().height/2 + i*10, ((getSize().width)/2 - 4),
                    getSize().height/2 + i*10);
            System.out.print(i);
        }

        g.setColor(Color.DARK_GRAY);

        g.drawLine(getSize().width/2, 50, getSize().width/2, getSize().height - 50);
        g.drawLine(getSize().width/2, 50, (getSize().width/2)+10, 70);
        g.drawLine(getSize().width/2, 50, (getSize().width/2)-10, 70);

        g.drawLine(50, (getSize().height)/2, getSize().width - 50, (getSize().height)/2);
        g.drawLine(getSize().width - 50, (getSize().height)/2, getSize().width - 70, (getSize().height)/2 + 10);
        g.drawLine(getSize().width - 50, (getSize().height)/2, getSize().width - 70, (getSize().height)/2 - 10);

        g.setColor(Color.BLACK);
    }

}
