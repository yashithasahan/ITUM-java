package com.textark;

public class Student {
    private String name;

    public void setName(String name){
        this.name=name;// this mean currently running object
    }

    public String getName(){
        return name;
    }
}

class TestEncapsualtion{
    public static void  main(String[] args){
        Student s = new Student();
        s.setName("Tharaka");
        System.out.println(s.getName());
    }
}