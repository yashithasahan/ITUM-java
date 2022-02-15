package com.textark;

public class Vehicle {
    String modelYear = "2000";
    String brand = "Toyota";

    public void checkEngineStatus(){
        System.out.println("Engine is running");
    }
}

class Car extends Vehicle{
    public static void main(String[] args) {
        String modelYear = "2008";
        String brand = "Honda";


        Car myCar = new Car();
        myCar.checkEngineStatus();
        System.out.println("Model Year: "+myCar.modelYear+ "Brand: "+myCar.brand);

    }

}
