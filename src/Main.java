import specs.SUV;
import specs.PassengerCar;
import specs.Motorcycle;
import specs.Vehicle;
import specs.TransportSorter;

public class Main {


    public static void main(String[] args) {
        Vehicle passengerCar1 = new PassengerCar("Tesla", 60, -10, true);
        Vehicle suv1 = new SUV("Lamborgini Urus", 85, false, -10);
        Vehicle motorcycle1 = new Motorcycle("Duccati", 80, 100, false);
        Vehicle passengerCar2 = new PassengerCar("Chevrolet Camaro", 170, 60, false);

        Vehicle[] vehicles = {passengerCar1, suv1, motorcycle1, passengerCar2};

        TransportSorter ts = new TransportSorter(vehicles);
        ts.print();
        ts.sort();
    }
}