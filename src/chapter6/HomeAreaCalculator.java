package chapter6;

public class HomeAreaCalculator {

    public static void main(String[] args) {

        /*RECTANGLE 1*/

        //Create instance of Rectange class
        Rectangle room1 = new Rectangle(); // Rectangle = nama class, room1 = nama object, new = buat object baru, Rectangle = nama constructor
        room1.setLength(30);
        room1.setLength(15);
        double areaOfRoom1 = room1.calculateArea();

        /*RECTANGLE 2*/

        Rectangle room2 = new Rectangle(30, 15);
        double areaOfRoom2 = room2.calculateArea();

        double totalArea = areaOfRoom1 + areaOfRoom2;

        System.out.print("Area of both rooms: " + totalArea);
    }
}
