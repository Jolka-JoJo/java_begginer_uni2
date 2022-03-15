package part1.uni_dev;


import org.jetbrains.annotations.NotNull;

/**
 * Class describing coordinate system point
 */
public class Point {
    private int x;
    private int y;

    Point(){}

    /**
     * Overloaded constructor
     * @param _x puts x value
     * @param _y puts y value
     */
    public Point(int _x, int _y){
        x=_x;
        y=_y;
    }

    /**
     * Setter function
     * @param _x puts x value
     * @param _y puts y value
     */
    public void setXY(int _x, int _y){
        x=_x;
        y=_y;
    }

    /**
     * Getter for x
     * @return returns x
     */
    public int getX(){return x;}

    /**
     * Getter for y
     * @return returns y
     */
    public int getY(){return y;}

    /**
     * Function to count distance from coordinate system center
     * @return distance counted by formula
     */
    public Double distanceFromOrigin(){
        return Math.sqrt(x * x + y * y);
    }

    /**
     * Function to move the point
     * @param dx changes x value
     * @param dy changes y value
     */
    public void translate(int dx, int dy){
        x+=dx;
        y+=dy;
    }

    /**
     * Function to covert point to string in a form [x;y]
     * @return returns string value of point
     */
    public String toString(){
        return "[" + x + ";" + y + "]";
    }

    /**
     * Function to count distance between two points
     * @param point another point for counting
     * @return returns value of distance between points
     */
    public Double distance(@NotNull Point point){
        return Math.sqrt(Math.pow(x - point.getX(),2) + Math.pow(y - point.getY(),2));
    }

    /**
     * Function to relocate the point
     * @param _x changes x value
     * @param _y changes y value
     */
    public void setLocation(int _x, int _y){
        x = _x;
        y = _y;
    }
}
