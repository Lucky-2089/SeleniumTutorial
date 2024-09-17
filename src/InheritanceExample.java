

/*Explanation:
Dog inherits from Animal, meaning Dog has access to the eat() method defined in Animal.
The bark() method is unique to the Dog class.*/



class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}





public class InheritanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog myDog = new Dog();
		myDog.eat();   // Inherited method
		myDog.bark();  // Dog's own method

	}

}
