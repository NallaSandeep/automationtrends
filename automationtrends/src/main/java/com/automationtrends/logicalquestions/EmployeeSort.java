package com.automationtrends.logicalquestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeSort {
    
    public static void main(String[] args) {
        Employee employee1 = new Employee(5,"Sandeep", 10000);
        Employee employee2 = new Employee(15,"Ramesh", 5000);
        Employee employee3 = new Employee(10,"Anil", 15000);
        List<Employee> list = new ArrayList<Employee>();
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        System.out.println("Before Sorting:");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("After Sorting (By ID) using Comparable:");
        System.out.println(list);
        Collections.sort(list, Employee.salaryComparator);
        System.out.println("After Sorting (By Salary) using Comparator:");
        System.out.println(list);
        Collections.sort(list, Employee.nameComparator);
        System.out.println("After Sorting (By Name) using Comparator:");
        System.out.println(list);
    }
}
