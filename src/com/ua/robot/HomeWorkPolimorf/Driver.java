package com.ua.robot.HomeWorkPolimorf;

public class Driver extends Human {
    private String name;
    private String lastName;
    private int age;
    private boolean additionalSkill = false;

    public Driver(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.additionalSkill = additionalSkill;
    }

    @Override
    public String driving() {
        return super.driving();
    }

    @Override
    public String flying() {
        if (Driver.this.additionalSkill == false) {
            return "sorry, i can't fly";
        } else {}
        return super.flying();
    }

    @Override
    public String toString() {
        return "Driver{" +
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
