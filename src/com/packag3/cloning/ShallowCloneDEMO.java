package com.packag3.cloning;

public class ShallowCloneDEMO {
    public  void main(String[] args) throws CloneNotSupportedException {
     Courses courses = new Courses();
     courses.setCourseName("math");

     Student originalStudent = new Student(courses, "match");
     Student  ClonestudentName = (Student)originalStudent.clone();
        System.out.println(originalStudent ==  ClonestudentName);
        System.out.println(originalStudent.getCourse() ==  ClonestudentName.getCourse());
    }
}
