package com.ua.robot.HomeWorkOOP_PartTwo;

public class PassengerСars extends Car{
    private String passengerModel;

    private int yearModelPassenger;

    public String getPassengerModel() {

        return passengerModel;
    }

    public void setPassengerModel(String passengerModel) {

        this.passengerModel = passengerModel;
    }

    public int getYearModelPassenger() {

        return yearModelPassenger;
    }

    public void setYearModelPassenger(int yearModelPassenger) {

        this.yearModelPassenger = yearModelPassenger;
    }

    @Override
    public String toString() {
        return "PassengerСars{" +
                "carManufacturer='" + getCarManufacturer() + '\'' +
                " passengerModel='" + passengerModel + '\'' +
                ", yearModelPassenger=" + yearModelPassenger +
                '}';
    }

    public String getType(){

        return "у нас це PassengerСars " + getCarManufacturer();
    }
}
