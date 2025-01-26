package entities;

import entities.enums.Genero;

public class Pessoas {

    private double height;
    private Genero genero;

    public Pessoas(){

    }

    public Pessoas(double height, Genero genero) {
        this.height = height;
        this.genero = genero;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
}
