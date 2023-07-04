package chapter9;

public class InheritanceTester {

    public static void main(String[] args) {

        Mother mom = new Mother();
        mom.setName("Pipi");

        System.out.println(mom.getName() + " is a " + mom.getGender());
    }

    public static void testInheritance() {

        Employee employee = new Employee();

    }
    public static void testOverload() {
        Rectangle rectangle = new Rectangle();
        rectangle.print();

        Square square = new Square();
        square.print("square");
    }

    public static void testSquareOverride() {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(8);
        rectangle.setWidth(4);
        System.out.println(rectangle.calculatePerimeter());

        Square square = new Square();
        square.setLength(8);
        square.setWidth(4);
        System.out.println(square.calculatePerimeter());
    }
}
