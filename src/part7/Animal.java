package part7;

abstract public class Animal implements Comparable<Animal>
{
    String name;
    String type;

    protected Animal(){}

    protected Animal(String _name, String _type){
        name=_name;
        type=_type;
    }

    void setName(String _name){
        name=_name;
    }

    String getName(){
        return name;
    }

    void setType(String _type){
        type=_type;
    }

    String getType(){
        return type;
    }

    public int compareTo(Animal animal){
        if (this.getType().equals(animal.getType()))
            return this.name.compareTo(animal.name) ;
        else
            return this.type.compareTo(animal.type);
    }
}
