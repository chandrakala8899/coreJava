package Gmail;

public class MsgSending {
   String message="hi";
   public String messages( String  toEmails , String typeMsg ){
       // String userName = "chandrakalag6882gmail.com";
        //String toEmail = "kittu7770@gmail.com";
        //String message="";
        LoginDetails loginDetails=new LoginDetails();
        MsgProcessingService mps = new MsgProcessingService();
        boolean loginStatus = mps.login(loginDetails);
       // if(loginDetails.userName.equals(fromEmail) && toEmail.equals(toEmail)){
       if (loginStatus){
           message =  typeMsg;

          // System.out.println(message);
        }
       return message;
       }

    }



