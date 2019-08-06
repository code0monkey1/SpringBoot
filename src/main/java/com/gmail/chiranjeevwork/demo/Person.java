package com.gmail.chiranjeevwork.demo;

public class Person {

    public int getAge() {
        return age;
    }


    private int age;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    Person(){

    }
    Person(int age,String name){
        this.age=age;
        this.name=name;
    }



}
