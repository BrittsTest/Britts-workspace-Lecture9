package com.revature.exceptions;

public class Car {
    String make;
    String model;
    int horsePower;

    public Car(String newMake, String model, int horsePower){
        this.make = newMake;
        this.model = model;
        this.horsePower = horsePower;
    }

    public void drive(int distance, int fuelConsumed) throws FuelGuageException{
        if(fuelConsumed == 0 && distance != 0){
            throw new FuelGuageException("Fuel reading implausible");
        }

        int fuelEconomy = distance / fuelConsumed;

        System.out.println(
            "The " + make + " " + model +
            " goes for a drive.\n" +
            "the car's fuel economy was: " + fuelEconomy +
            "mpg"
        );        
    }
}
