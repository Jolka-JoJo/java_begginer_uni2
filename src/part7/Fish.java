package part7;

class Fish extends Animal {
    int finsCount;

    Fish(){}

    Fish(String name){
        super(name, "Žuvis");
    }

    int getFinsCount(){
        return finsCount;
    }

    void setFinsCount(int _finsCount){
        finsCount = _finsCount;
    }

    public String toString(){
        String text = "";
        text += getType() + ". Vardas " + getName() + ", Pelekų kiekis: " + finsCount;
        return text;
    }

}
