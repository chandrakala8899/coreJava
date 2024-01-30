package BankDemo;

public class CardTest {
    public static void main(String[] args) {
     CardProcessService processService = new CardProcessService();
     CardDetails cardDetails = new CardDetails();
        cardDetails.cardNumber= "2255";
        cardDetails.pinNumber = "123";
        System.out.println(cardDetails.hashCode());
        boolean loginstatus = processService.login(cardDetails);
        CreditService CreditServices = new CreditService();
        if (loginstatus){
            int balance = CreditServices.credit("2255",100);
            System.out.println(balance);
            System.out.println("CreditService hashCode"+CreditServices.hashCode());
            int balance2 = CreditServices.credit("2255",100);
            System.out.println("CreditService CreditService hashCode"+CreditServices.hashCode());
            System.out.println(balance2);
            int balance3 = CreditServices.credit("2255",100);
            System.out.println("CreditService CreditService hashCode"+CreditServices.hashCode());
            System.out.println(balance3);
            
        }
    }
}
