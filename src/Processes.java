public class Processes
{
   @SuppressWarnings("deprecation")
   public static void main(String[] args){
      int q = 1;
      int i = 0;
      int loop = 1;

      Counter counter = new Counter();
      Hello hello = new Hello();
      Bye bye = new Bye();
      Fibonacci fibonacci = new Fibonacci();

      long startTime = System.currentTimeMillis();

      loop:
      while (true){

         if (counter.done() == false
                 || hello.done() == false
                 || bye.done() == false
                 || fibonacci.done() == false){

            switch (i) {

               case 0:
                  counter(counter, loop, q);
                  break;

               case 1:
                  hello(hello, loop, q);
                  break;

               case 2:
                  bye(bye, loop, q);
                  break;

               case 3:
                  fibonacci(fibonacci, loop, q);
                  break;
            }
            loop++;
            i = (i + 1) % 4;
         }
         else
            break loop;
      }
      long endTime   = System.currentTimeMillis();
      long totalTime = endTime - startTime;
      System.out.println("Total run time is " + totalTime);
   }


   public static void counter(Counter counter, int loop, int q){
      if (counter.done == false){
         if (loop < 5){
            counter.star();
         }else{
            counter.cont();
         }
         try{ Thread.sleep(q);}
         catch (InterruptedException e){ System.out.println("Prob with sleep");}

         counter.sto();
      }
   }
   public static void hello(Hello hello, int loop, int q){
      if (hello.done == false){
         if (loop < 5) {
            hello.star();
         }else{
            hello.cont();
         }
         try{ Thread.sleep(q);}
         catch (InterruptedException e){ System.out.println("Prob with sleep");}
         hello.sto();
      }
   }

   public static void bye(Bye bye , int loop, int q) {
       if (bye.done == false) {
           if (loop < 5) {
               bye.star();
           } else {
               bye.cont();
           }
           try {
               Thread.sleep(q);
           } catch (InterruptedException e) {
               System.out.println("Prob with sleep");
           }
           bye.sto();
       }
   }

   public static void fibonacci(Fibonacci fibonacci, int loop, int q){

      if (fibonacci.done == false){

         if (loop < 5){
            fibonacci.star();
         }else{
            fibonacci.cont();
         }
         try{ Thread.sleep(q); }
         catch (InterruptedException e){System.out.println("Prob with sleep");}
         fibonacci.sto();
      }
   }

}