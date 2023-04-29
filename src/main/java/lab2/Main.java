package lab2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();
        ArrayList<Transport> transports = new ArrayList<Transport>();
        Bicycle bicycle = new Bicycle(3);
        bicycle.setCost(123d);
        bicycle.setSpeed(30d);
        //transport.add(bicycle);
        Car car = new Car();
        car.setMark("audi");
        car.setCost(123123123d);
        car.setSpeed(300d);
        //transport.add(car);

       // garage.setTransports(transport);
        garage.print();

    }
}
