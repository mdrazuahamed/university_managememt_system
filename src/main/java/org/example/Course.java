package org.example;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Course{
    private String name;
    private University university;
    private Department department;
    private Teacher teacher;
    private List<Student> studentList = new ArrayList<>();

    public void addStudent(Student student){
        this.studentList.add(student);
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

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public Course(String name) {
        this.name = name;
    }

    public Course() {
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", studentList=" + studentList +
                '}';
    }
}
