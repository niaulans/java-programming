package chapter11.excercise;

public class Farm {

    public static void main(String[] args) {

        Animal duck1 = new Duck();
        duck1.makeSound();
        duck1.eat();
        System.out.println("----------");

        Duck duck2 = new Duck();
        duck2.makeSound();
        duck2.eat();
        System.out.println("----------");

        Pig pig = new Pig();
        pig.makeSound();
        pig.eat();

    }
}
