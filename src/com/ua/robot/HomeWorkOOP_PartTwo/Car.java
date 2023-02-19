package com.ua.robot.HomeWorkOOP_PartTwo;

public class Car {
    protected String carManufacturer;


    public String getCarManufacturer() {

        return carManufacturer;
    }

    public void setCarManufacturer(String carManufacturer) {

        this.carManufacturer = carManufacturer;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carManufacturer='" + carManufacturer + '\'' +
                '}';
    }
}
