package com.ua.robot.HomeWorkOOP_PratTwoVerConstr;

public class MainConstr {
    public static void main(String[] args) {

        PassengerCarsConstr car1 = new PassengerCarsConstr("Ford", "Raprot", 2022);
        TrucksConstr car2 = new TrucksConstr("Volvo", "Heavy Duty Range", 2020);
        PassengerCarsConstr car3 = new PassengerCarsConstr("Polaris", "ROUSH EDITION", 2023);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println("-------------------------------------------------------");
        System.out.println(car1.getType());
        System.out.println(car2.getType());
        System.out.println(car3.getType());

    }
}

