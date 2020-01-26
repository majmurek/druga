package com.example.model;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String imie;
    private String nazwisko;
    private int wiek;

    private List<String> uprawnienia;

    public User(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.uprawnienia = new ArrayList<>();
    }

    public List<String> getUprawnienia() {
        return uprawnienia;
    }

    public void addUprawnienia(String uprawnienie) {
        this.uprawnienia.add(uprawnienie);
    }

    public void removeUprawnienia(String uprawnienie) {
        this.uprawnienia.remove(uprawnienie);
    }


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

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }
}
