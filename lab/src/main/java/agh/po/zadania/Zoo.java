package agh.po.zadania;
import agh.po.animals.Animal;

import java.util.Random;

public class Zoo {
    Animal[] animals = new Animal[100];
    public void wypelnienietablicy(){
        Random rand = new Random();
        for(int i=0;i < animals.length; i++){
          int abc = rand.nextInt(3);
                  if(abc ==0){

                  }
                  if(abc ==1){

                  }
                  if(abc == 2){

                  }
        }
    }

    public class main {
        public static void main(String[] args);
    }
}