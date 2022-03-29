package part5;

public class Triangle {
    Double edgeFirst;
    Double edgeSecond;
    Double edgeThird;

    Triangle(){}

    Triangle(Double _edgeFirst, Double _edgeSecond, Double _edgeThird){
        edgeFirst = _edgeFirst;
        edgeSecond = _edgeSecond;
        edgeThird = _edgeThird;
    }

    public Double area(){
        Double halfPerimeter = (edgeFirst + edgeSecond + edgeThird)/2.0;
        return Math.sqrt(halfPerimeter*(halfPerimeter-edgeFirst)*(halfPerimeter-edgeSecond)*(halfPerimeter-edgeThird));
    }
}
