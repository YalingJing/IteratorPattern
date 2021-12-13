package com.iteratorPattern.Iterator;

import com.iteratorPattern.Aggregate.StudentList;
import com.iteratorPattern.entity.Student;

import java.util.*;

public class StudentIterator implements AbstractIterator{
    private List<Student> stu;

    public StudentIterator(StudentList stu){
        this.stu = stu.getStu();
    }
    
    @Override
    public void AgeSort() {
        Collections.sort(stu);
    }

    @Override
    public void StudentInfoIterator() {
        Collection<Student> coll;
        coll = this.stu;
        Iterator<Student> s = coll.iterator();
        while(s.hasNext()){
            Student student = s.next();
            System.out.println(student.getName()+" "+student.getId()+" "+student.getAge());
        }
    }
}
