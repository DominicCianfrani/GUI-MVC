package edu.psu.abington.ist.ist242;

import java.awt.event.*;

public class StudentController {

    private StudentModel model;
    private StudentView view;

    public StudentController(StudentModel model, StudentView view) {
        this.model = model;
        this.view = view;

        class StudentButtonListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent ev) {
                view.setCurrentStudent(model.getStudent());
            }
        }
        view.addStudentButtonListener(new StudentButtonListener());

        class AssignmentButtonListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent ev) {
                view.setCurrentAssignment(model.getAssignment());
            }
        }
        view.addAssignmentButtonListener(new AssignmentButtonListener());
    }

}
