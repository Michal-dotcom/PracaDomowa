package DesignPatterns.FluentBuilder;

public class Lekarz {
    public enum Zmiana {PORANNA, POPO£UDNIOWA, NOCNA};

    private String imie;
    private String nazwisko;

    private String pesel;
    private String specjalizacja;
    private Zmiana zmiana;
    private int wynagrodzenie;


    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getSpecjalizacja() {
        return specjalizacja;
    }

    public void setSpecjalizacja(String specjalizacja) {
        this.specjalizacja = specjalizacja;
    }

    public Zmiana getZmiana() {
        return zmiana;
    }

    public void setZmiana(Zmiana zmiana) {
        this.zmiana = zmiana;
    }

    public int getWynagrodzenie() {
        return wynagrodzenie;
    }

    public void setWynagrodzenie(int wynagrodzenie) {
        this.wynagrodzenie = wynagrodzenie;
    }
}
