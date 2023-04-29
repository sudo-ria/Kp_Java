package lab2;

public class Car extends Transport {

    private String mark;

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Override
    public void printInfo() {
        System.out.println("Тип трансопорта: автомобиль");
        super.printInfo();
        System.out.println("Марка:" + mark);
    }
}
