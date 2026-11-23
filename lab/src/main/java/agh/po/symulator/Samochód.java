package agh.po.symulator;

public class Samochód {
    private Silnik Zielonysilnik;
    private Skrzyniabiegow czerwonaskrzyniabiegow;
    private Sprzęgło niebieskiesprzeglo;
    private Pozycja Mojapozycja;
    public Samochód(Silnik Zielonysilnik,Skrzyniabiegow czerwonaskrzyniabiegow,Sprzęgło niebieskiesprzeglo,Pozycja Mojapozycja){
        this.Zielonysilnik = Zielonysilnik;
        this.czerwonaskrzyniabiegow = czerwonaskrzyniabiegow;
        this.niebieskiesprzeglo = niebieskiesprzeglo;
        this.Mojapozycja = Mojapozycja;
    }
}
