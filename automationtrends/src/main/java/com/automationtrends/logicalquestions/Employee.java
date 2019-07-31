package com.automationtrends.logicalquestions;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {
    
    private int id;
    private String name;
    private int salary;
    
    public Employee() {
        super();
    }

    public Employee(int id, String name, int salary) {
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int compareTo(Employee o) {
        return this.id - o.getId();
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }

    public static Comparator<Employee> salaryComparator = new Comparator<Employee>() {
        public int compare(Employee o1, Employee o2) {
            return o1.getSalary() - o2.getSalary();
        }
    };
    
    public static Comparator<Employee> nameComparator = new Comparator<Employee>() {
        public int compare(Employee o1, Employee o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };
}
