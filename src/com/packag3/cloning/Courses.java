package com.packag3.cloning;

public class Courses implements Cloneable {
    private String courseName;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public Object clone() throws CloneNotSupportedException{

        return super.clone();
    }
}
