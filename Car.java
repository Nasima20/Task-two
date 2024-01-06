package JavaP;

public abstract class Car {
     double carPrice;
     String color;

    public  Car(double carPrice ,String color) {
        this.carPrice = carPrice;
        this.color=color;
    }

    public double getCarPrice(){
        return carPrice;
    }

    public abstract double calculateSalePrice();

    }

class Truck extends Car{
    private double weight;
    public Truck(double carPrice, String color,double weight) {
        super(carPrice, color);
        this.weight=weight;}
    public double calculateSalePrice(){
        if (weight>2000){
            return carPrice * 0.1;
        }else {
            return carPrice*0.2;
        }
    }
}
class Seden extends Car{
    double length;
     public Seden(double carPrice,String color,double length){
        super(carPrice,color);
        this.length=length;
    }
    @Override
    public double calculateSalePrice(){
         if (length>20){
             return carPrice*0.05;
         }else {
             return carPrice *0.1;}}

    public static void main(String[] args) {
        Truck t=new Truck(1000,"white",10);
        System.out.println(t.calculateSalePrice());
        Seden s=new Seden(2000,"block",50);
        System.out.println(s.calculateSalePrice());

        }

    }



//13.	Create a Class Car that would have the following fields:
//carPrice and color and method calculateSalePrice() which should be
// returning a price of the car.
//Create 2 subclasses: Sedan and Truck. The Truck class has a field as
// weight and has its own implementation of calculateSalePrice() method in which
// returned price is calculated as following: if weight>2000 then returned price car
// should include 10% discount, otherwise 20% discount.
//The Sedan class has field as length and also does it its own implementation of
// calculateSalePrice(): if length of sedan is >20 feet then returned car price
// should include 5% discount, otherwise 10% discount