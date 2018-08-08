package com.gmail.s.granovskiy;

import java.util.Arrays;

import com.gmail.s.granovskiy.MyException;

public class Group {

    /*  empty array for 10 elements  */
    private Student[] studentsArray = new Student[10];

    /*  constructors  */
    public Group(Student[] studentsArray) {
        super();
        this.studentsArray = studentsArray;
    }

    public Group() {
        super();
    }

    /*  getters and setters  */
    public Student[] getStudentsArray() {
        return studentsArray;
    }

    public void setStudentsArray(Student[] studentsArray) {
        this.studentsArray = studentsArray;
    }

    /*  method addStudent  */
    public void addStudent(Student student) throws MyException {
        if (student == null) {
            throw new IllegalArgumentException("Null student");
        }
        for (int i = 0; i < studentsArray.length; i++) {
            if (studentsArray[i] == null) {
                studentsArray[i] = student;
                System.out.println(student.getLastName() + " is added to group.");
                return;
            }
        }
        throw new MyException();
    }

    /*  method deleteStudent  */
    public boolean deleteStudent(long number) {
        for (int i = 0; i < studentsArray.length; i++) {
            if(studentsArray[i] != null && studentsArray[i].getId() == number) {
                System.out.println();
                System.out.println(studentsArray[i].getLastName() + " is deleted from group.");
                studentsArray[i] = null;
                return true;
            }
        }
        return false;
    }

    /*  method searchStudent  */
    public Student searchStudent(String name) {
        for (Student student : studentsArray) {
            if (student != null && student.getLastName().equals(name)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        System.out.println();
        return "Group [studentsArray=" + Arrays.toString(studentsArray) + "]";
    }


}
