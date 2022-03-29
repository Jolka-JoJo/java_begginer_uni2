package part5;

public class EquilateralTriangle extends Triangle{
    EquilateralTriangle(Double _edgeFirst){
        edgeFirst = _edgeFirst;
    }

    public void edgesValues(){
        edgeSecond = edgeFirst;
        edgeThird = edgeFirst;
    }

    public Double area(){
        return (edgeFirst * edgeFirst * Math.sin(Math.toRadians(60)))/2.0;
    }
}
