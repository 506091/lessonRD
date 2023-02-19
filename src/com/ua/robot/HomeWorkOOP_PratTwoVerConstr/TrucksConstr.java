package com.ua.robot.HomeWorkOOP_PratTwoVerConstr;

public class TrucksConstr extends CarConstr {
    private String trucksModel;

    private int yearModelTrucks;

    public TrucksConstr(String carManufacturer, String trucksModel, int yearModelTrucks) {
        super(carManufacturer);
        this.trucksModel = trucksModel;
        this.yearModelTrucks = yearModelTrucks;
    }

    @Override
    public String toString() {
        return "TrucksConstr{" +
                "trucksModel='" + trucksModel + '\'' +
                ", yearModelTrucks=" + yearModelTrucks +
                ", carManufacturer='" + carManufacturer + '\'' +
                '}';
    }

    public String getType(){
        return "у нас це Trucks " + carManufacturer;
    }
}
