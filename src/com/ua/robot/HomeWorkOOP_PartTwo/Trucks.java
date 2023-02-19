package com.ua.robot.HomeWorkOOP_PartTwo;

public class Trucks extends Car{
    private String trucksModel;

    private int yearModelTrucks;

    public String getTrucksModel() {

        return trucksModel;
    }

    public void setTrucksModel(String trucksModel) {

        this.trucksModel = trucksModel;
    }

    public int getYearModelTrucks() {

        return yearModelTrucks;
    }

    public void setYearModelTrucks(int yearModelTrucks) {

        this.yearModelTrucks = yearModelTrucks;
    }

    @Override
    public String toString() {
        return "Trucks{" +
                "carManufacturer='" + getCarManufacturer() + '\'' +
                " trucksModel='" + trucksModel + '\'' +
                ", yearModelTrucks=" + yearModelTrucks +
                '}';
    }

    public String getType(){

        return "у нас це Trucks " + getCarManufacturer();
    }
}
