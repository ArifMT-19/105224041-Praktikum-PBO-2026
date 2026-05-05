class Vehicle {
    void speedUp() { System.out.println("Vehicle accelerating"); }
}

class Car extends Vehicle {
    @Override
    void speedUp() { System.out.println("Car accelerating by 22 units"); }

    void drift() { System.out.println("Performing a drift!"); }
}

public class Main {
    public static void main(String[] args) {
        Vehicle myVehicle = new Car(); // Upcasting
        myVehicle.speedUp();
        // myVehicle.drift(); // Baris ini menyebabkan error "cannot find symbol"
    }
}