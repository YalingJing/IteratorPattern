package com.iteratorPattern.Aggregate;

import com.iteratorPattern.Iterator.AbstractIterator;
import com.iteratorPattern.entity.Student;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractStudentList {
    protected List<Student> stu = new ArrayList<Student>();

    public AbstractStudentList(List<Student> stu){
        this.stu = stu;
    }

    public List<Student> getStu(){
        return this.stu;
    }

    //声明创建迭代器对象的抽象工厂方法
    public abstract AbstractIterator createIterator();

}
