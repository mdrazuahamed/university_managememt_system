package org.example;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class University implements Serializable {
    private String name;

    private List<Department> departmentList = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Department> getDepartmentList() {
        return departmentList;
    }

    public void setDepartmentList(List<Department> departmentList) {
        this.departmentList = departmentList;
    }
    public void addDepartment(Department department){
        departmentList.add(department);
    }

    public University(String name) {
        this.name = name;
    }


    public University() {
    }

    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", departmentList=" + departmentList +
                '}';
    }
}
