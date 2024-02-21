package Constructor;

public class ConstructorTest {
    public static void main(String[] args) {
        Address address = new Address();
        address.city = "hyd";
        address.state = "Ap";
        address.country = "india";
        address.pinCode = "509125";
        Student student = new Student("chandu", "Ramudu","9908","31/01/2002",address);
        System.out.println("joiningStudent="+student);

        Student examStudent = new Student("chandu", "Ramudu","9908","31/01/2002");
        System.out.println("ExamStudent="+examStudent);

    }

}
