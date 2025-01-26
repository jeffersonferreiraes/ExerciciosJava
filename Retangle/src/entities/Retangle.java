package entities;

public class Retangle {
    private double widht;
    private double height;

    public Retangle(){

    }

    public Retangle(double widht, double height) {
        this.widht = widht;
        this.height = height;
    }

    public double getWidht() {
        return widht;
    }

    public void setWidht(double widht) {
        this.widht = widht;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double Area(){
        return getHeight() * getWidht();
    }

    public double Perimeter(){
        return 2 * (getHeight() + getWidht());
    }

    public double Diagonal(){
        return Math.sqrt(Math.pow(getWidht(), 2) + Math.pow(getHeight(), 2));
    }
}
