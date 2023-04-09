package edu.psu.abington.ist.ist242;

public class StudentModel {

    final private String[] STUDENT = {"Roger", "Mary Anne", "Melissa","Brian", "Daniel", "David"};
    final private String[] ASSIGNMENT = {"LM01", "LM02", "LM03", "LM04", "LM05"};

    public String getStudent(){
        int studentIndex = (int) (java.lang.Math.random() * STUDENT.length);
        return STUDENT[studentIndex];
    }

    public String getAssignment(){
        int assignmentIndex = (int) (java.lang.Math.random() * ASSIGNMENT.length);
        return ASSIGNMENT[assignmentIndex];
    }

}