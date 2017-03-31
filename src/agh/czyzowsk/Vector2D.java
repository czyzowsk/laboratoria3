package agh.czyzowsk;

/**
 * Created by Damian on 2017-03-30.
 */
public class Vector2D {
    public int[] position = new int[2];
    private int lenthOfVector;

    Vector2D(){
        position[0] = 0;
        position[1] = 0;
    }

    Vector2D(int newX, int newY){
        position[0] = newX;
        position[1] = newY;
    }

    public Vector2D sumWithVector(Vector2D vect){
        Vector2D sumOfVector = new Vector2D(vect.position[0] + position[0],vect.position[1] + position[1]);
        return sumOfVector;
    }

    public Vector2D diffOfVector(int x1, int y1){
        Vector2D sumOfVector = new Vector2D(x1 - position[0], y1 - position[1]);
        return sumOfVector;
    }

    public Vector2D multipOfVector(int a){
        Vector2D multipOfVector = new Vector2D(a*position[0], a*position[1]);
        return multipOfVector;
    }


    public int lenthOfVector(){
        lenthOfVector = (int)Math.sqrt(position[0]*position[0] + position[1]*position[2]);
        return lenthOfVector;
    }

    public Vector2D normalizedVector(){
        int versorX = position[0]/lenthOfVector();
        int versorY = position[0]/lenthOfVector();
        Vector2D versor = new Vector2D(versorX, versorY);
        return versor;
    }
}
