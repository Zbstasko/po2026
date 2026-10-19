package agh.po.lab2;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Lotto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> typy =new ArrayList<>();
        System.out.println("Podaj 6 liczb od 1 do 49:");
        while (typy.size() < 6) {
            int liczba = scanner.nextInt();
            typy.add(liczba);
        }
        ArrayList<Integer> liczby = new ArrayList<>();
        Random rand = new Random();
        while (liczby.size() < 6) {
            int liczba = rand.nextInt(49) + 1;
            if (!liczby.contains(liczba)) {
                liczby.add(liczba);
            }
        }
            int trafienia = 0;
            for (int liczba : typy) {
                if (liczby.contains(liczba)) {
                    trafienia++;
                }
            }
        System.out.println("liczby obstawione:" +typy);
        System.out.println ("wylosowane lczby:" +liczby);
        System.out.println("Liczba trafień: " +trafienia);

        scanner.close();
        }
    }
