package DesignPatterns.Flyweight.clase;

//Concrete Flyweight: contine doar starea intrinseca
public class Seat implements ISeat{
    private final String type;
    private final String color;

    public Seat(String type, String color) {
        this.type = type;
        this.color = color;
    }

    @Override
    public void draw(int row, int col) {
        System.out.println(type + " seat " + color + " at " + row + col);
    }
}
