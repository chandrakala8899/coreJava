package StudentPassMarks;

import Student.StudentService;

public class MarksTest {
    public static void main(String[] args) {
        StudentMarksService studentMarksService=new StudentMarksService();
        StudentMarks studentMarks = new StudentMarks();

        studentMarks.name = "Chandu";
        studentMarks.marks = 56;

       String msg= studentMarksService.ValidateStudent(studentMarks);
        System.out.println(msg);



    }

}
