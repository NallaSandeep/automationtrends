package com.automationtrends.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SortList {
    public static void main(String[] args) {
        List<ClassA> list = new ArrayList<ClassA>();
        ClassA classA = new ClassA();
        classA.level=1;
        classA.name="Sandeep";
        ClassA classA1 = new ClassA();
        classA1.level=2;
        classA1.name="Srikanth";
        list.add(classA);
        list.add(classA1);
        System.out.println(list.get(0));
    }
}
