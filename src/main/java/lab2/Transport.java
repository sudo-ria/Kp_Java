package lab2;

public abstract class Transport {
    private Double cost;
    private Double speed;

    public Double getCost(){
        return cost;
    }

    void setCost(Double cost){
     this.cost = cost;
    }

    public Double getSpeed(){
        return speed;
    }
    public void setSpeed(Double speed){
        this.speed = speed;
    }

    public void printInfo(){
        System.out.println("Стоимость: " + cost);
        System.out.println("Скорость: " + speed);
    }

}
