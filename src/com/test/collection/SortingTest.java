package com.test.collection;

import java.util.*;
import java.util.stream.Collectors;

class Student{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}

//Complete the code
public class SortingTest
{
    public static void main(String[] args){
        List<Student> studentList =Arrays.asList(new Student(33 ,"Rumpa", 3.68),
                new Student(85, "Ashis", 3.85),
                new Student(56 ,"Samiha", 3.75),
                new Student(19 ,"Samara", 3.75),
                new Student(22 ,"Fahim", 3.76));

        List<Student> students = studentList.stream().sorted(Comparator.comparingDouble(Student::getCgpa).reversed().
                thenComparing(Student::getFname).thenComparing(Student::getId)).collect(Collectors.toList());
        for(Student st: students){
            System.out.println(st.getFname());
        }
    }
}



