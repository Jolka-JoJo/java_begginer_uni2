package part5;

public class RightTriangle extends Triangle{

    RightTriangle(Double _edgeFirst, Double _edgeSecond){
        edgeFirst = _edgeFirst;
        edgeSecond = _edgeSecond;
    }

    public void findEdgeThird(){
        edgeThird = Math.sqrt(edgeFirst * edgeFirst + edgeSecond * edgeSecond);
    }

    public Double area() {
        return (edgeFirst * edgeSecond) / 2.0;
    }
}
