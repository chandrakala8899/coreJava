package Constructor;

public class Student {
    public String name;
    public String fatherName;
    public String mobileNumber;
    public String dateOfBirth;
    public Address address;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", address=" + address +
                '}';
    }

    public  Student(String name, String fatherName, String mobileNumber, String dateOfBirth, Address address){
        this.name=name;
        this.fatherName = fatherName;
        this.mobileNumber = mobileNumber;
        this.dateOfBirth = dateOfBirth;
        this.address = address;

    }
    public Student(String name,String fatherName,String mobileNumber,String dateOfBirth){
        this(name,fatherName,mobileNumber,dateOfBirth,new Address());
    }
}


