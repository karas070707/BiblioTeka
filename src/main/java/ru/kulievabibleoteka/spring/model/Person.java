package ru.kulievabibleoteka.spring.model;

public class Person {
    private int id;
    private String name;
    private  int date;

    public Person(int id, String name, int date) {
        this.id = id;
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
