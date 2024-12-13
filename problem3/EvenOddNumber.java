public class EvenOddNumber{
   int i=1;
   public synchronized void printNumber(String threadNm) throws InterruptedException{
      if(threadNm.equals("t1")) {
         if(i%2==1){
            System.out.println(Thread.currentThread().getName()+"--"+i++);
            notify();
         }else{
            wait();
         }
      }
      else if(threadNm.equals("t2")){
         if(i%2==0){
            System.out.println(Thread.currentThread().getName()+"--"+i++);
            notify();
         }else{
            wait();
         }
      }
   }
   public static void main(String args[]){
      final EvenOddNumber obj=new EvenOddNumber();
      Thread t1=new Thread(new Runnable(){
         public void run(){
            try{
               while(obj.i<=10){
                  obj.printNumber(Thread.currentThread().getName());
               }
            }catch(InterruptedException e){
               e.printStackTrace();
            }
            System.out.println("done t1");
         }
      });
      Thread t2=new Thread(new Runnable() {
         public void run(){
            try{
               while(obj.i<=10){
                  obj.printNumber(Thread.currentThread().getName());
               }
            }catch(InterruptedException e){
               e.printStackTrace();
            }
            System.out.println("done t2");
         }
      });
      t1.setName("t1");
      t2.setName("t2");
      t1.start();
      t2.start();
   }
}