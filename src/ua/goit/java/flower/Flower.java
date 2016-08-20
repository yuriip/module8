package ua.goit.java.flower;

public abstract class Flower implements Comparable<Flower> {
    private String name;
    private String color;

    public Flower(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return name + ", " + color;
    }

    @Override
    public int compareTo(Flower o) {
        return this.name.compareTo(o.getName());
    }

    public void grow() {
        System.out.println("Цветок растет");
    }

    public void fade() {
        System.out.println("Цветок увядает");
    }

    public abstract void formed();

    public abstract void smell();
}
