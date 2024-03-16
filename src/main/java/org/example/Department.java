package org.example;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Department{
    private String name;
    private University university;
    private List<Course> courseList = new ArrayList<>();
    private List<Teacher> teacherList = new ArrayList<>();
    private List<Student> studentList = new ArrayList<>();

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

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void addTeacher(Teacher teacher) {
        teacherList.add(teacher);
    }
    public void addCourse(Course course) { courseList.add(course); }
    public void addStudent(Student student) {
        studentList.add(student);
    }
    public Department() {
    }

    public Department(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", university=" + university +
                ", courseList=" + courseList +
                ", teacherList=" + teacherList +
                ", studentList=" + studentList +
                '}';
    }
}

