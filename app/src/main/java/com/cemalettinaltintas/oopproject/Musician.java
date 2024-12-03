package com.cemalettinaltintas.oopproject;

public class Musician extends  BaseMusician{
    public Musician(String name, String instrument, int age) {
        super(name, instrument, age);
    }
    public String sing(){
        return "Nothing Else Matters";
    }
}
