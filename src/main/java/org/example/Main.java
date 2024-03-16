package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    @Override
    public String toString() {
        return "Main{}";
    }
    public static void main(String[] args) {
        Main main = new Main();
        List<Student> returnStudentList = new ArrayList<>();
        List<Teacher> returnTeacherList = new ArrayList<>();
        List<Course> returnCourseList = new ArrayList<>();
        List<Department> returnDepartmentList = new ArrayList<>();

        returnStudentList = studentFactory();
        returnTeacherList = teacherFactory();
        returnDepartmentList = departmentFactory();
        returnCourseList = courseFactory();

        buildUniversity(returnDepartmentList,returnStudentList,returnTeacherList,returnCourseList);
    }
    public static void buildUniversity(List<Department> departmentList,List<Student> studentList, List<Teacher> teacherList, List<Course> courseList){
        University uiu = new University("United International University");
        uiu.setDepartmentList(departmentList);
        int numberOfCourse=0;

        for(Student student : studentList){
            if(Objects.equals(student.getName(),"Rahim Ahamed")) {
                student.addCourse(courseList.get(0));
                student.addCourse(courseList.get(1));
            }
            if(Objects.equals(student.getName(),"karim Khan")) {
                student.addCourse(courseList.get(0));
                student.addCourse(courseList.get(1));
            }
            if(Objects.equals(student.getName(),"Newton Rahman")) {
                student.addCourse(courseList.get(1));
            }
            if(Objects.equals(student.getName(),"Galilio Bishawas")) {
                student.addCourse(courseList.get(0));
            }
            if(Objects.equals(student.getName(),"Raihan Mollah")) {
                student.addCourse(courseList.get(2));
            }
            if(Objects.equals(student.getName(),"Harun Mollah")) {
                student.addCourse(courseList.get(2));
            }
            if(Objects.equals(student.getName(),"Niem Choudhury")) {
                student.addCourse(courseList.get(2));
            }
            if(Objects.equals(student.getName(),"Saimun Rahman")) {
                student.addCourse(courseList.get(3));
                student.addCourse(courseList.get(4));
            }
            if(Objects.equals(student.getName(),"Deve Khan")) {
                student.addCourse(courseList.get(3));
            }
            if(Objects.equals(student.getName(),"Evan Rahman")) {
                student.addCourse(courseList.get(3));
                student.addCourse(courseList.get(4));
            }
        }

        for(Course course :courseList){
            if(Objects.equals(course.getName(),"Mathematics")){
                course.addStudent(studentList.get(0));
                course.addStudent(studentList.get(1));
                course.addStudent(studentList.get(3));
                course.setTeacher(teacherList.get(0));
            }
            if(Objects.equals(course.getName(),"Electronics 1")){
                course.addStudent(studentList.get(0));
                course.addStudent(studentList.get(1));
                course.addStudent(studentList.get(2));
                course.setTeacher(teacherList.get(1));
            }
            if(Objects.equals(course.getName(),"Structural programming language")){
                course.addStudent(studentList.get(4));
                course.addStudent(studentList.get(5));
                course.addStudent(studentList.get(6));
                course.setTeacher(teacherList.get(2));
            }
            if(Objects.equals(course.getName(),"English 1")){
                course.addStudent(studentList.get(7));
                course.addStudent(studentList.get(8));
                course.addStudent(studentList.get(9));
                course.setTeacher(teacherList.get(3));
            }
            if(Objects.equals(course.getName(),"Accounting")){
                course.addStudent(studentList.get(7));
                course.addStudent(studentList.get(9));
                course.setTeacher(teacherList.get(4));
            }
        }

        for(Teacher teacher : teacherList) {
            if (Objects.equals(teacher.getName(), "Salimullah")) {
                teacher.addStudent(studentList.get(0));
                teacher.addStudent(studentList.get(1));
                teacher.addStudent(studentList.get(2));
            }
            if (Objects.equals(teacher.getName(), "Manik Munshi")) {
                teacher.addStudent(studentList.get(0));
                teacher.addStudent(studentList.get(1));
                teacher.addStudent(studentList.get(3));
            }
            if (Objects.equals(teacher.getName(), "Salauddin Ahamed")) {
                teacher.addStudent(studentList.get(3));
                teacher.addStudent(studentList.get(4));
                teacher.addStudent(studentList.get(5));
            }
            if (Objects.equals(teacher.getName(), "Iqbal bahar choudhury")) {
                teacher.addStudent(studentList.get(7));
                teacher.addStudent(studentList.get(8));
                teacher.addStudent(studentList.get(9));
            }
            if (Objects.equals(teacher.getName(), "Dider Khan")) {
                teacher.addStudent(studentList.get(7));
                teacher.addStudent(studentList.get(9));
                teacher.addStudent(studentList.get(4));
            }
        }

        for(Department department : departmentList){
            if(Objects.equals(department.getName(),"Electrical and Electronic Engineering")){
                department.addCourse(courseList.get(0));
                department.addCourse(courseList.get(1));

                department.addStudent(studentList.get(0));
                department.addStudent(studentList.get(1));
                department.addStudent(studentList.get(2));
                department.addStudent(studentList.get(3));

                department.addTeacher(teacherList.get(0));
                department.addTeacher(teacherList.get(1));
            }

            else if(Objects.equals(department.getName(),"Computer science")) {
                department.addCourse(courseList.get(2));

                department.addStudent(studentList.get(4));
                department.addStudent(studentList.get(5));
                department.addStudent(studentList.get(6));

                department.addTeacher(teacherList.get(2));
                department.addTeacher(teacherList.get(3));

            }
            else if(Objects.equals(department.getName(),"Business Administration")){
                department.addCourse(courseList.get(3));
                department.addCourse(courseList.get(4));

                department.addStudent(studentList.get(7));
                department.addStudent(studentList.get(8));
                department.addStudent(studentList.get(9));
                department.addTeacher(teacherList.get(4));
            }
        }
    }
    public static List<Student> studentFactory(){

        List<Student> studentList = new ArrayList<>();
        Student rahim = new Student("Rahim Ahamed");
        studentList.add(rahim);

        Student karim = new Student("karim Khan");
        studentList.add(karim);

        Student newton = new Student("Newton Rahman");
        studentList.add(newton);

        Student galilio = new Student("Galilio Bishawas");
        studentList.add(galilio);

        Student raihan = new Student("Raihan Mollah");
        studentList.add(raihan);

        Student harun = new Student("Harun Mollah");
        studentList.add(harun);

        Student niem = new Student("Niem Choudhury");
        studentList.add(niem);

        Student saimon = new Student("Saimun Rahman");
        studentList.add(saimon);

        Student deve = new Student("Deve Khan");
        studentList.add(deve);

        Student evan = new Student("Evan Rahman");
        studentList.add(evan);

        return studentList;
    }
    public static List<Teacher> teacherFactory(){
        List<Teacher> teacherList = new ArrayList<>();

        Teacher salimullah = new Teacher("Salimullah");
        teacherList.add(salimullah);

        Teacher manik = new Teacher("Manik Munshi");
        teacherList.add(manik);

        Teacher salauddin = new Teacher("Salauddin Ahamed");
        teacherList.add(salauddin);

        Teacher ibc = new Teacher("Iqbal bahar choudhury");
        teacherList.add(ibc);

        Teacher dider = new Teacher("Dider Khan");
        teacherList.add(dider);

        return teacherList;
    }
    public static List<Course> courseFactory(){
        List<Course> courseList = new ArrayList<>();

        Course math = new Course("Mathematics");
        courseList.add(math);

        Course electronics = new Course("Electronics 1");
        courseList.add(electronics);

        Course spl = new Course("Structural programming language");
        courseList.add(spl);

        Course english = new Course("English 1");
        courseList.add(english);

        Course accounting = new Course("Accounting");
        courseList.add(accounting);

        return courseList;

    }
    public static List<Department> departmentFactory(){
        List<Department> departmentList = new ArrayList<>();

        Department eee = new Department("Electrical and Electronic Engineering");
        departmentList.add(eee);

        Department cse = new Department("Computer science");
        departmentList.add(cse);

        Department bba = new Department("Business Administration");
        departmentList.add(bba);
        return departmentList;
    }

}