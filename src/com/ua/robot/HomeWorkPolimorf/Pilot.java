package com.ua.robot.HomeWorkPolimorf;

import java.util.Random;

public class Pilot extends Human{

    Random random = new Random();
    private String name;
    private String lastName;
    private int age;
    private boolean additionalSkill = random.nextBoolean();

    public Pilot(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.additionalSkill = additionalSkill;
    }

    @Override
    public String driving() {
        if (Pilot.this.additionalSkill == true) {
            return "if I can fly, I can probably drive:)";
        } else {}
        return "i CAN`T driving";
    }

    @Override
    public String flying() {
        return super.flying();
    }

    @Override
    public String toString() {
        return "Pilot{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", additionalSkill=" + additionalSkill +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isAdditionalSkill() {
        return additionalSkill;
    }
}
