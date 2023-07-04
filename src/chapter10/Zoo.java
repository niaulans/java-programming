package chapter10;

public class Zoo {

    public static void main(String[] args) {

        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();
        feed(rocky);
        System.out.println("--------");

        // Polymorphism
        // sasha is type of animal but instantiation of dog
        Animal sasha = new Dog();
        sasha.makeSound();
        feed(sasha);
        System.out.println("--------");

        sasha = new Cat();
        sasha.makeSound();
        ((Cat) sasha).scratch(); //casting
        feed(sasha);
    }

    public static void feed(Animal animal) {
        if(animal instanceof Dog) {
            System.out.println("Here's your dog food");
        } else if(animal instanceof Cat) {
            System.out.println("Here's your cat food");
        }
    }
}
