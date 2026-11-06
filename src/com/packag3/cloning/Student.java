package com.packag3.cloning;

public class Student implements Cloneable {
    private String name;
    private Courses course;

    public Student(Courses course, String name) {
        this.course = course;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Courses getCourse() {
        return course;
    }

    public void setCourse(Courses course) {
        this.course = course;
    }

    public Object clone() throws CloneNotSupportedException{
        Student ClonestudentName = (Student)super.clone();
        ClonestudentName.course= (Courses) course.clone();
        return  ClonestudentName;
    }
}
