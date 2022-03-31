package part7;

class Hamster extends Animal{
    int tailLong;
    String color;

    Hamster(){}

    Hamster(String name){
        super(name, "Žiurkėnas");
    }

    void setTailLong(int _tailLong){
        tailLong = _tailLong;
    }

    int getTailLong(){
        return tailLong;
    }

    void setColor(String _color){
        color = _color;
    }

    String getColor(){
        return color;
    }

    public String toString(){
        String text = "";
        text += getType() + ". Vardas " + getName() + ", Uodegos ilgis: " + tailLong + " cm, Spalva: " + color;
        return text;
    }

}
