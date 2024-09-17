class Animal1 {
    void sound() {
        System.out.println("The animal makes a sound.");
    }
}

class Cat extends Animal1 {
    void sound() {
        System.out.println("The cat meows.");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Animal1 myAnimal = new Cat();  // Polymorphism
        myAnimal.sound();  // Calls the Cat's sound method
    }
}