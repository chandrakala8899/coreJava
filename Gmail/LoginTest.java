package Gmail;

public class LoginTest {
    public static void main(String[] args) {
     MsgProcessingService   processingService = new MsgProcessingService();
     LoginDetails loginDetails1 = new LoginDetails();
    // loginDetails1.userName = "chandrakalag6882@gmail.com";
    // loginDetails1.passWord ="chandu0210";
         // System.out.println(loginDetails1.hashCode());
boolean loginStatus = processingService.login(loginDetails1);
        MsgSending msgsending = new MsgSending();

if (loginStatus){
    String resultMessage = msgsending.messages("kittu7770@gmail.com","Hello Chandralaka");
    System.out.println(resultMessage);
}

    }
}
