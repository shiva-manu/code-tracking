public class ExecuteAccount6 {
   public static void main(String[] args){
      InsufficientException ie=new InsufficientException("insufficient balance in account");
      ie.withdraw();
   }
}
