package BankDemo;

public class CardProcessService {
   boolean login(CardDetails card){
       System.out.println(card.hashCode());
       String localcardNumber="2255";
       String localpinNumber="123";
      if(localcardNumber.equals(card.cardNumber) && localpinNumber.equals(card.pinNumber))
      {
         return true;

      }
      else{
          return false;
      }
   }

}
