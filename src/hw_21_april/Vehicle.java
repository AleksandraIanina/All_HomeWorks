package hw_21_april;

public abstract class Vehicle {
    public void drive(){
        System.out.println("Vehicle starts");
    }
    public void stop(){
        System.out.println("Vehicle stops");
    }

    public static void startExecution(){                           //ВЫЗОВ МЕТОДОВ

        Truck newTruck = new Truck();
        newTruck.drive();

        StreetCar newStreetCar = new StreetCar();
        newStreetCar.drive();

        Bus newBus = new Bus();
        newBus.drive();
    }
}
