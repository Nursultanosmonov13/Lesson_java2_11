package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setAge(15);
        dog.setBreed("Ovcharka");
        dog.setName("Bobik");
        dog.setColor(Color.BLACK);
        dog.setShelter(new Shelter("NLP", "Repina"));
        dog.setCommands(new String[]{"sit", "run", "bark"});
        System.out.println(dog.getInfo());
        Dog dog1 = new Dog("Bimo", "Хаски", Color.BROWN, new Shelter("KutOso", "Sovetskii"));
        Dog dog2 = new Dog("laika", "Чихуахуа", Color.WHITE, new Shelter("Akorgo", "Kulmatob"), new String[]{"bark", "sit", "run"});
        System.out.println("______________________");
        System.out.println(dog1.getInfo());
        System.out.println("______________________");
        System.out.println(dog2.getInfo());
        System.out.println("______________________");
        dog.makeVoice(2,"vaf - vaf");
        dog1.makeVoice("VOOF", 3);
        dog2.makeVoice("gaf");

        // System.out.println(Arrays.toString(dog.getCommands()));

    }
}
