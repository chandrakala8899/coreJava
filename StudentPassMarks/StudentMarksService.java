package StudentPassMarks;

import Student.Student;

public class StudentMarksService {
   public String ValidateStudent(StudentMarks studentMarks){
       String name="Chandu";
       int marks=56;

       if (marks>35){
           return "Pass";
       }
       else{
           return "fail";
       }

   }

}
