package com.kata.apiRest.model;

public class Employee {

    private Integer Id;
    private String name;
    private String surname;
    private Integer age;
    private Area area;

    public Employee() {
    }

    public Employee(Integer id, String name, String surname, Integer age, Area area) {
        Id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.area = area;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }
};

