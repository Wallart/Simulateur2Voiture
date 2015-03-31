package DomaineRoute;

import java.util.Observable;

/**
 * Created by wallart on 24/03/15.
 */
public class Route extends Observable {

    private int x;
    private int y;

    private int width;
    private int height;

    public Route(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
