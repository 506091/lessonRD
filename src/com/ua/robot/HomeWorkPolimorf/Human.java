package com.ua.robot.HomeWorkPolimorf;

public class Human implements AbilityToFly, AbilityToDrive{

    @Override
    public String driving() {
        return "i can drive";
    }

    @Override
    public String flying() {
        return "i can fly";
    }
}
