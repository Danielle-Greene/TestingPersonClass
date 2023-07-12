package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;

    private int weight;

    private int height;

    private String pet;

    private String favoriteColor;

    private String eyeColor;

    public Person() {
        this.age = 45;
    }

    public Person(int age) {

        this.age = age;
    }

    public Person(String name) {

        this.name = name;
    }

    public Person(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, int weight, int height, String pet, String favoriteColor, String eyeColor) {

        this.name = name;
        this.weight= weight;
        this.height=height;
        this.pet=pet;
        this.favoriteColor=favoriteColor;
        this.eyeColor=eyeColor;


    }

    public void setName(String name) {

        this.name = name;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public void setWeight(int weight) {

        this.weight = weight;
    }

    public void setHeight(int height) {

        this.height = height;
    }

    public void setPet(String pet) {

        this.pet = pet;
    }

    public void setFavoriteColor(String favoriteColor) {

        this.favoriteColor = favoriteColor;
    }

    public void setEyeColor(String eyeColor) {

        this.eyeColor = eyeColor;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }


    public Integer getWeight() {
        return weight;
    }

    public Integer getHeight() {
        return height;
    }

    public String getPet() {
        return pet;
    }

    public String getFavoriteColor() {
        return favoriteColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

}
