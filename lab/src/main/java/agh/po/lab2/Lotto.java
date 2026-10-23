package agh.po.lab2;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Lotto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> typy = new ArrayList<>();
        System.out.println("Podaj 6 liczb od 1 do 49:");
        while (typy.size() < 6) {
            int liczba = scanner.nextInt();
            typy.add(liczba);
        }
        int trafienia = 0;
        int liczbalosowan = 0;
        long start = System.currentTimeMillis();
        while (trafienia < 6){
            ArrayList<Integer> liczby = new ArrayList<>();
        Random rand = new Random();


        while (liczby.size() < 6) {
            int liczba = rand.nextInt(49) + 1;
            if (!liczby.contains(liczba)) {
                liczby.add(liczba);
            }
        }
         trafienia = 0;
        for (int liczba : typy) {
            if (liczby.contains(liczba)) {
                trafienia++;
            }
        }
        liczbalosowan++;
    }
        long koniec = System.currentTimeMillis();
        long czas = koniec - start;
        System.out.println("liczby obstawione:" +typy);
        System.out.println ("ilość losowań :" +liczbalosowan);
        System.out.println("Łączny czas działania programu: " + czas + " ms");

        scanner.close();
        }
    }
