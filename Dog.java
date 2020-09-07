package com.company;

public class Dog {
    private int age;
    private String name;
    //private String color;

    public Dog(){
        this.age = 1;
        this.name = "Jake";
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void getParameters() {
        System.out.println(name);
        System.out.println(age);
    }

    public int ageToHuman() {
        return age*7;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
