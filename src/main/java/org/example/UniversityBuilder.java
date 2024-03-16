package org.example;

public class UniversityBuilder {
    public static void main(String[] args) {
        UniversityBuilder universityBuilder = new UniversityBuilder();
        University university = universityBuilder.build();
        showDepartments(university);
        showCourse(university);
        showStudent(university);
        showCourseInStudent(university);
    }

    public static void showDepartments(University university) {
        System.out.println("Department list----------- \n");
        university.getDepartmentList().forEach(department -> {
            System.out.println(department.getName());
        });
        System.out.println("\n");
    }
    public static void showCourse(University university){
        System.out.println("Course list----------- \n");
        university.getDepartmentList().forEach(department -> {
          department.getCourseList().forEach(course ->
                  System.out.println(course.getName())
          );
        });
        System.out.println("\n");;
    }
    public static void showStudent(University university){
        System.out.println("Student list----------\n");
        university.getDepartmentList().forEach(department ->
                department.getCourseList().forEach(course ->
                        course.getStudentList().forEach(student ->
                                        System.out.println(student.getName())
                        )
                )
        );
        System.out.println("\n");
    }

    public static void showCourseInStudent(University university){
        System.out.println("Course in Student list----------\n");
        university.getDepartmentList().forEach(department ->
                department.getCourseList().forEach(course ->
                        course.getStudentList().forEach(student ->
                                        student.getCourseList().forEach(courseInStudent ->
                                                        System.out.println(courseInStudent.getName())
                                        )
                        )
                )
        );
        System.out.println("\n");
    }

    public University build() {
        University uiu = new University("United International University");

        Department eee = new Department("Electrical and Electronics Engineering");
        Department cse = new Department("Computer Science and Engineering");
        Department ete = new Department("Electrical and Telecommunication Engineering");

        uiu.addDepartment(eee);
        uiu.addDepartment(cse);
        uiu.addDepartment(ete);

        eee.setUniversity(uiu);
        eee.setUniversity(uiu);
        eee.setUniversity(uiu);

        Course communication = new Course("Communication Theory");
        Course electronics = new Course("Electronics 1");
        Course programming = new Course("Structural Programming language");

        eee.addCourse(communication);
        eee.addCourse(electronics);
        eee.addCourse(programming);

        communication.setDepartment(eee);
        electronics.setDepartment(eee);
        programming.setDepartment(eee);

        Student rahim = new Student("Rahim khan");
        Student karim = new Student("Karim khan");
        Student shahin = new Student("Shahin Choudhury");
        Student sohan = new Student("Sohan Choudhury");

        communication.addStudent(rahim);
        communication.addStudent(karim);
        communication.addStudent(shahin);
        communication.addStudent(sohan);

        rahim.addCourse(communication);
        karim.addCourse(communication);
        shahin.addCourse(communication);
        sohan.addCourse(communication);

        return uiu;
    }
}
