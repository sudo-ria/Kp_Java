package lab2;

import java.util.List;

public class Garage {
    private List<Transport> transports;

    public List<Transport> getTransports() {
        return transports;
    }

    public void setTransports(List<Transport> transports) {
        this.transports = transports;
    }

    public void print(){
        for (Transport transport : transports) {
            System.out.println("В ГАРАЖЕ:");
            transport.printInfo();
        }

    }

}

