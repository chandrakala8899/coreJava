package Order;

public class Processing {
    boolean Login(LoginDetails loginDetails){
        String localuserName = "chandu";
        String localpassWord = "123";
        System.out.println(loginDetails.hashCode());
        if(localuserName.equals(loginDetails.userName)&&localpassWord.equals(loginDetails.passWord)){
            return true;
        }
        else {
            return false;
        }

    }



}