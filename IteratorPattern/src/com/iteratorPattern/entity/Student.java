package com.iteratorPattern.entity;

public class Student implements Comparable<Student>{
    public String name;
    public int age;
    public String id;

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public int compareTo(Student o) {
        if(this.age!=o.age){
            return o.age - this.age;
        }
        else{
            return this.name.compareTo(o.name);
        }
    }
}
