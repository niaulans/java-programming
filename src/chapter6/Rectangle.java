package chapter6;

public class Rectangle {

    // Global variables or fields
    private double length;
    private double width;

    // Constructor -> access modif, no return type, name same as class
    // Use to initialize an object
    // Encapsulation => make fields/variable private and methods public (mengamankan atribut/field)
    // Encapsulation => Hiding the data of a class by making its fields private and allowing access through public methods
    public Rectangle() {
        length = 0;
        width = 0;
    }

    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double calculatePerimeter() {
        return (2 * length) + (2 * width);
    }

    public double calculateArea() {
        return length * width;
    }

}
