package Gmail;

public class MsgProcessingService {
    boolean login(LoginDetails loginDetails){
        System.out.println(loginDetails.hashCode());
        String localuserName="chandrakalag6882@gmail.com";
        String localpassWord="chandu0210";
        if(localuserName.equals(loginDetails.userName) && localpassWord.equals(loginDetails.passWord))
        {
            return true;
        }
        else {
            return false;
        }
    }

}

