package Student;

public class StudentTest {
    public static void main(String[] args) {
        StudentService ss=new StudentService();
      Student  s= ss.getStudent("Chandu","Ramudu","9908235913","31-01-2002");

        System.out.println(s);
    }
}
