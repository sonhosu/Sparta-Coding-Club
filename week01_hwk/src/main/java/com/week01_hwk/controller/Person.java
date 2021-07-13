package com.sparta.week01.controller;

public class Person {
    private String name;
    private String job;
    private String address;
    private int age;

    public Person(){

    }

    public Person(String name, String job, String address, int age){
        this.job=job;
        this.name=name;
        this.address=address;
        this.age=age;
    }

    public String getName(){
        return this.name;
    }
    public String getJob(){
        return  this.job;
    }
    public String getAddress(){
        return this.address;
    }
    public int getAge(){
        return  this.age;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setJob(String job){
        this.job=job;
    }
    public void setAddress(String address){
        this.address=address;
    }
}
