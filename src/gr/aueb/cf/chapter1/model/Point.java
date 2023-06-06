package gr.aueb.cf.chapter1.model;

/**
 * A POJO {@ling Point class}
 * @author a8ana
 * @version.
 * @since 1.0
*/
public class Point {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(){

    }
}
