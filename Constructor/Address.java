package Constructor;

public class Address {
    public String city;
    public  String state;
    public String country;
    public String pinCode;
    public Address(){
        city = "hyd";
        state = "ts";
        pinCode = "123";
        country = "india";
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", pinCode='" + pinCode + '\'' +
                '}';
    }
}
