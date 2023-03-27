package com.ua.robot.Map3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

    Map<String, Words> dictionary = new HashMap<>();

    dictionary.put("Книга", new Words("Книга","Book","本","Buh"));
    dictionary.put("Молоко",new Words("Молоко","Milk","牛乳 ","Milch"));
    dictionary.put("Сонце",new Words("Сонце","Sun","太陽","Sonne"));
    dictionary.put("День",new Words("День","Day","日","Tag"));
    dictionary.put("Ніч",new Words("Ніч","Night","夜","Nacht"));
    dictionary.put("Кіт",new Words("Кіт","Cat","猫","Katze"));
    dictionary.put("Собака",new Words("Собака","Dog","犬","Hund"));
    dictionary.put("Дерево",new Words("Дерево","Tree","木","Baum"));
    dictionary.put("Музика",new Words("Музика","Music","音楽","Musik"));
    dictionary.put("Вода",new Words("Вода","Water","水","Wasser"));

    System.out.println(dictionary.get("Книга"));
    System.out.println(dictionary.get("Молоко"));
    System.out.println(dictionary.get("Сонце"));
    System.out.println(dictionary.get("День"));
    System.out.println(dictionary.get("Ніч"));
    System.out.println(dictionary.get("Кіт"));
    System.out.println(dictionary.get("Собака"));
    System.out.println(dictionary.get("Дерево"));
    System.out.println(dictionary.get("Музика"));
    System.out.println(dictionary.get("Вода"));

    }
}
