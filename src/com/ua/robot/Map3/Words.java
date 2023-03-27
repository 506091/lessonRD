package com.ua.robot.Map3;

public class Words {
    private String ukrainian;
    private String english;
    private String japanese;
    private String german;

    public Words(String ukrainian, String english, String japanese, String german) {
        this.ukrainian = ukrainian;
        this.english = english;
        this.japanese = japanese;
        this.german = german;
    }

    public String getUkrainian() {
        return ukrainian;
    }

    public String getEnglish() {
        return english;
    }

    public String getJapanese() {
        return japanese;
    }

    public String getGerman() {
        return german;
    }

    @Override
    public String toString() {
        return "Words{" +
                "ukrainian='" + ukrainian + '\'' +
                ", english='" + english + '\'' +
                ", japanese='" + japanese + '\'' +
                ", german='" + german + '\'' +
                '}';
    }
}
