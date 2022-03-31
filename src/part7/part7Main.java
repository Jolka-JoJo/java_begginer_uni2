package part7;

import java.util.Collections;
import java.util.LinkedList;

public class part7Main {
    public static void searchByName(LinkedList<Animal> animals, String name){
        for (Animal animal:animals) {
            if(animal.getName() == name) System.out.println(animal.toString());
        }
    }

    public static void main(String[] args) {
        LinkedList animals =  new LinkedList();

        Hamster hamster = new Hamster("Antanas");
        hamster.setTailLong(10);
        hamster.setColor("baltas");
        animals.add(hamster);

        Fish fish = new Fish("Aukse");
        fish.setFinsCount(10);
        animals.add(fish);

        Hamster hamster2 = new Hamster("Rikas");
        hamster2.setTailLong(9);
        hamster2.setColor("juodas");
        animals.add(hamster2);

        Fish fish2 = new Fish("Polas");
        fish2.setFinsCount(12);
        animals.add(fish2);

        Fish fish3 = new Fish("Polas");
        fish3.setFinsCount(7);
        animals.add(fish3);

        Collections.sort(animals);

        for (Object animal:animals) {
            System.out.println(animal.toString());
        }

        System.out.println();
        searchByName(animals, "Polas");
    }
}
