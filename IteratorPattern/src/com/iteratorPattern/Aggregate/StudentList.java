package com.iteratorPattern.Aggregate;

import com.iteratorPattern.Iterator.AbstractIterator;
import com.iteratorPattern.Iterator.StudentIterator;
import com.iteratorPattern.entity.Student;

import java.util.List;

public class StudentList extends AbstractStudentList{
    public StudentList(List<Student> stu) {
        super(stu);
    }

    @Override
    public AbstractIterator createIterator() {
        return new StudentIterator(this);
    }
}
