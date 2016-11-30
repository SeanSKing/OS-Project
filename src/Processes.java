public class Processes
{
   @SuppressWarnings("deprecation")
   public static void main(String[] args)
   {
      int q = 1;
      int i = 0;
      int loop = 1;
      
      Counter c = new Counter();
      Hello h = new Hello();
      Bye b = new Bye();
      Fibonacci f = new Fibonacci();
      
      long startTime = System.currentTimeMillis();
      
      loop:
      while (true)
      {
         if (c.done == false || h.done == false || b.done == false || f.done == false)
         {
            switch (i)
            {
               case 0: 
                  if (c.done == false)
                  {
                     if (loop < 5)
                        c.star();
                     else
                        c.cont();
                     try
                     {
                        Thread.sleep(q);
                     }
                     catch (InterruptedException e)
                     {
                        System.out.println("Prob with sleep");
                     }
                     c.sto();
                  }
                  break;
                    
               case 1: 
                  if (h.done == false)
                  {
                     if (loop < 5)
                        h.star();
                     else
                        h.cont();
                     try
                     {
                        Thread.sleep(q);
                     }
                     catch (InterruptedException e)
                     {
                        System.out.println("Prob with sleep");
                     }
                     h.sto();
                  }
                  break;
                       
               case 2: 
                  if (b.done == false)
                  {
                     if (loop < 5)
                        b.star();
                     else
                        b.cont();
                     try
                     {
                        Thread.sleep(q);
                     }
                     catch (InterruptedException e)
                     {
                        System.out.println("Prob with sleep");
                     }
                     b.sto();
                  }
                  break;
                    
               case 3: 
                  if (f.done == false)
                  {
                     if (loop < 5)
                        f.star();
                     else
                        f.cont();
                     try
                     {
                        Thread.sleep(q);
                     }
                     catch (InterruptedException e)
                     {
                        System.out.println("Prob with sleep");
                     }
                     f.sto();
                  }
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
}