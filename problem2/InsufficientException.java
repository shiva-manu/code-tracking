import java.util.Scanner;
class InsufficientException extends Exception{
   double balance;
   double wbalance;
   public InsufficientException(String msg){
      super(msg);
   }
   void withdraw(){
      double balance=25000;
      System.out.println("Current Balance:"+balance);
      try{
         System.out.println("Enter withdraw amount: ");
         Scanner input=new Scanner(System.in);
         double wamount=input.nextDouble();
         input.close();
         if(wamount>balance){
            throw new InsufficientException("Insufficient balance in account");
         }
         else{
            System.out.println("Transaction Successfully Completed............");
            double rembal=balance-wamount;
            System.out.println("After transaction current balance:"+rembal);
         }
      }catch(InsufficientException e){
         System.out.println("Caught:"+e.getMessage());
      }
   }
}