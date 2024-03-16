package org.example;


import java.util.ArrayList;
import java.util.*;

public class Teacher{
    private String name;
    private University university;
    private Department department;
    private Course course;
    private List<Student> studentList = new ArrayList<>();

    public void addStudent( Student student){
        studentList.add(student);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public Teacher() {
    }

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", university=" + university +
                ", department=" + department +
                ", course=" + course +
                ", studentList=" + studentList +
                '}';
    }
}
