package part5;

import java.util.ArrayList;

public class part5Main {
    public static Double sumOfAreas(ArrayList<Triangle> triangles){
        Double sum = 0.0;
        for (Triangle shape:triangles) {
            sum+=shape.area();
        }
        return sum;
    }
    public static void main(String[] args) {
        ArrayList <Triangle> triangles = new ArrayList<Triangle>();

        Triangle triangle = new Triangle(5.0,5.0, 5.0);
        triangles.add(triangle);
        RightTriangle triangle2 = new RightTriangle(5.0,5.0);
        triangles.add(triangle2);
        EquilateralTriangle triangle3 = new EquilateralTriangle(5.0);
        triangles.add(triangle3);

        for (Triangle shape:triangles) {
            System.out.println(shape.area());
        }

        System.out.println("Bendra plotų suma suapvalinus: " + Math.round(sumOfAreas(triangles)));

    }
}
