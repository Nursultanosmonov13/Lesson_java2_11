package com.company;

import java.util.Random;

public class Pet {
    private int age = generateDefaultAge();
    private Color color;
    private Shelter shelter;

    public int getAge() {
        return age;
    }

    public Color getColor() {
        return color;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

    private int generateDefaultAge() {
        Random random = new Random();
        int i = random.nextInt(18) + 1;
        return i;
    }

    public String getInfo() {
        return "\nAge = " + getAge() + "\nColor = " + getColor() + "\nShelterName = " + getShelter().getName() + " ShelterAdress = " + getShelter().getAddress();
    }

}
