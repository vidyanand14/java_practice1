public class Car {
    String model;
    String color;
    int year;

    Car(String color,String model,int year){
        this.color=color;
        this.model=model;
        this.year=year;
    }

    public void start() {
        System.out.println("Car started");


    }

    public void stop() {
        System.out.println("Car stopped");
    }
}
