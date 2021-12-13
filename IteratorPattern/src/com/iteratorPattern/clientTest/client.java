package com.iteratorPattern.clientTest;

import com.iteratorPattern.Aggregate.AbstractStudentList;
import com.iteratorPattern.Aggregate.StudentList;
import com.iteratorPattern.Iterator.AbstractIterator;
import com.iteratorPattern.entity.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class client {
    public static void main(String[] args){
        System.out.println("请输入要添加的学生个数：");
        Scanner input = new Scanner(System.in);
        int Number = input.nextInt();
        List<Student> students = new ArrayList<Student>();
        System.out.println("请依次输入学生的姓名、学号、年龄");
        for(int i = 0; i<Number; i++){
            System.out.println("请输入学生"+(i+1)+"的信息：");
            String name = input.next();
            String id = input.next();
            int age = input.nextInt();
            Student student = new Student();
            student.setName(name);
            student.setId(id);
            student.setAge(age);
            students.add(student);
        }
        AbstractStudentList list;
        AbstractIterator iterator;
        list = new StudentList(students);
        iterator = list.createIterator();
        iterator.AgeSort();
        iterator.StudentInfoIterator();
    }
}
