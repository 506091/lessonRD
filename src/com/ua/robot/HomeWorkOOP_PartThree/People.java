package com.ua.robot.HomeWorkOOP_PartThree;

public class People {

    private int id;
    private static int counter;
    private String scientificName;

    static int countInitialization = 0;
    static int countInitializationStatic = 0;

    static {
        counter = 0;
        countInitializationStatic++;
        System.out.println("People id counter = 0");
        System.out.println("before normal initialization"+ "countInitializationStatic = "+ countInitializationStatic);

    }

    {
        countInitialization++;
        scientificName = "Homo sapiens";
        System.out.println("initialization scientificName " + "after `static initialization` " + "countInitialization= " + countInitialization );
    }

    private String name;

    private int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
        this.scientificName = scientificName;
        id = ++counter;
    }


    public void showId() {
        System.out.printf("Id: %d \n", id);
    }

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", scientificName='" + scientificName + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
