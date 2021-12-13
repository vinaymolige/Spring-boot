package com.example.demo.com.example.demo;

public class Topic {
    String id;
    String name;
    String discripiton;
    public Topic(){

    }
    public Topic(String id, String name, String discripiton) {
        this.id = id;
        this.name = name;
        this.discripiton = discripiton;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscripiton() {
        return discripiton;
    }

    public void setDiscripiton(String discripiton) {
        this.discripiton = discripiton;
    }
}
