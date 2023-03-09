package com.ua.robot.HomeWorkOOP_PratTwoVerConstr;

public class PassengerCarsConstr extends CarConstr{
    private String passengerModel;

    private int yearModelPassenger;

    public PassengerCarsConstr(String carManufacturer, String passengerModel, int yearModelPassenger) {
        super(carManufacturer);
        this.passengerModel = passengerModel;
        this.yearModelPassenger = yearModelPassenger;
    }

    @Override
    public String toString() {
        return "PassengerCarsConstr{" +
                "passengerModel='" + passengerModel + '\'' +
                ", yearModelPassenger=" + yearModelPassenger +
                ", carManufacturer='" + carManufacturer + '\'' +
                '}';
    }

    public String getType(){
        return "у нас це PassengerСars " + carManufacturer;
    }
}
