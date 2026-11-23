package agh.po.zadania;
import agh.po.animals.Animal;
import agh.po.animals.Dog;
import agh.po.animals.Parrot;
import agh.po.animals.Snake;

import java.util.Random;

public class Zoo {
    Animal[] animals = new Animal[100];
    public void wypelnienietablicy(){
        Random rand = new Random();
        for(int i=0;i < animals.length; i++) {
            int abc = rand.nextInt(3);

            if (abc == 0) {
                animals[i] = new Dog();
            } else if (abc == 1) {
                animals[i] = new Parrot();
            } else {
                animals[i] = new Snake();
            }
            System.out.println(animals[i].getDescription());
        }
    }
    public int sumaNog() {
        int suma = 0;

        for (int i = 0; i < animals.length; i++) {
            Animal animal = animals[i];
            int legs = animal.getLegs();
            suma += legs;
        }

        return suma;
    }
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        zoo.wypelnienietablicy();

        System.out.println("Suma nóg: " + zoo.sumaNog());
    }
}