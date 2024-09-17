
class Car {
    String model;
    int year;

    void start() {
        System.out.println("The car is starting.");
    }
}



public class ClassesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();  // Create an object of the Car class
        myCar.model = "Tesla Model S";
        myCar.year = 2023;

        System.out.println("Model: " + myCar.model);
        System.out.println("Year: " + myCar.year);
        myCar.start();  // Call the start method
	}

}
