package com.cemalettinaltintas.oopproject;

public class Piyanist extends  BaseMusician{
    public Piyanist(String name, String instrument, int age) {
        super(name, instrument, age);
    }
    public String play(){
        return "playing";
    }
}
