package lab2;

public class Bicycle extends Transport {
    private int wheelsCount;

    public Bicycle(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    @Override
    public void printInfo() {
        System.out.println("Тип трансопорта: велосипед");
        super.printInfo();
        System.out.println("Количество колес:" + wheelsCount);
    }
}
