package part1.uni_dev;
import part1.uni_dev.Point;
public class Part1Main {


    public static void main(String[] args) {

        //Point Nr.1
        Point point_1 = new Point();
        point_1.setXY(1,1);

        System.out.println("x: " + point_1.getX());
        System.out.println("y: " + point_1.getY());
        System.out.println("Atstumas nuo koordinačių sistemos pradžios: " + point_1.distanceFromOrigin());

        point_1.translate(2, 3);
        System.out.println(point_1.toStringPoint());

        //Point Nr.2
        Point point_2 = new Point(2,2);

        System.out.println(point_1.distance(point_2));
        point_1.setLocation(4,2);
        System.out.println(point_1.toStringPoint());

    }
}
