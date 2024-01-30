package Order;

public class Test {
    public static void main(String[] args) {
        Processing processing = new Processing();
        LoginDetails loginDetails = new LoginDetails();
        loginDetails.userName ="chandu";
        loginDetails.passWord = "123";
        boolean loginStatus = processing.Login(loginDetails);
        System.out.println(loginStatus);
        if(loginStatus){
            Payment payment = new Payment();
            Product product = new Product();
            product.shirts = 2;
            product.kurtis = 2;
            int items = payment.item(product);
            System.out.println("total items:"+" "+items);
        }

    }


}
