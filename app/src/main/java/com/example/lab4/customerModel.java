package com.example.lab4;

public class customerModel {
    private String name;
    private int age;
    private boolean isActive;
    private int ID;


    public customerModel(String name, int age, boolean isActive, int ID) {
        this.name = name;
        this.age = age;
        this.isActive = isActive;
        this.ID = ID;
    }

    public customerModel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }


    @Override
    public String toString() {
        return "customerModel{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isActive=" + isActive +
                ", ID=" + ID +
                '}';
    }
}
