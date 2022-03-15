package part3;

import part1.uni_dev.Point;

public class MainPart3 {
    public static void main(String[] args) {
        Point point1 = new Point(2,4);
        Point point2 = new Point(4,4);

        Line line = new Line(point1, point2);
        System.out.println(line);
        System.out.println(line.distance());
    }
}
