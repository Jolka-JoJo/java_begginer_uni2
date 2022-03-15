package part3;
import org.jetbrains.annotations.NotNull;
import part1.uni_dev.Point;

public class Line {
    Point pointFirst;
    Point pointSecond;

    Line () {}

    Line (Point _pointFirst,Point _pointSecond){
        pointFirst = _pointFirst;
        pointSecond = _pointSecond;
    }

    public void setLine(Point _pointFirst,Point _pointSecond){
        pointFirst = _pointFirst;
        pointSecond = _pointSecond;
    }

    public Point getPointFirst(){
        return pointFirst;
    }

    public Point getPointSecond(){
        return pointSecond;
    }

    public void toStringLine(){
        System.out.println( pointFirst.toStringPoint() + "-" + pointSecond.toStringPoint());
    }

    public Double distance(){
        return Math.sqrt(Math.pow(pointSecond.getX() - pointFirst.getX(),2) + Math.pow(pointSecond.getY() - pointFirst.getY(),2));
    }
}
