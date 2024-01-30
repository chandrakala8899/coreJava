package Order;

public class Payment {
   int orderItems=0;
   int shirtsPrice = 200;
   int kurtisPrice = 200;
   int totalPrice;
   public int item(Product product){
       if(orderItems<product.shirts+product.kurtis) {
           orderItems = product.shirts + product.kurtis;
           totalPrice = product.shirts*shirtsPrice+product.kurtis *kurtisPrice;
           System.out.println("totalPrice:"+" "+totalPrice);

       } else{
           System.out.println("item");

           }
       return orderItems;
   }
   }

