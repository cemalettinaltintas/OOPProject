package com.cemalettinaltintas.oopproject;

public class User {
    //Property
    private String name;
    private String job;
    public User(String name,String job){
        this.name=name;
        this.job=job;
    }
    public String getName() {
        return "Sn. "+name;
    }

    public void setName(String name,String password) {
        if (password=="123"){
            this.name = name;
        }
    }
    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }
}
