package com.ua.robot.HomeWorkOOP_PartTwo;

public class Main {
    public static void main(String[] args) {
        PassengerСars car1 = new PassengerСars();
        car1.setCarManufacturer("VW");
        car1.setPassengerModel("Passat b8");
        car1.setYearModelPassenger(2014);

        Trucks car2 = new Trucks();
        car2.setCarManufacturer("VW");
        car2.setTrucksModel("Constellation");
        car2.setYearModelTrucks(2005);

        PassengerСars car3 = new PassengerСars();
        car3.setCarManufacturer("Audi");
        car3.setPassengerModel("RS7");
        car3.setYearModelPassenger(2023);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);

        System.out.println(car1.getType());
        System.out.println(car2.getType());
        System.out.println(car3.getType());
    }
}
