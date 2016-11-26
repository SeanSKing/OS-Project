class Fibonacci extends Thread
{

   int count = 0;
   int x = 0, y = 1;
   Boolean running;
   Boolean done;

   Fibonacci(){
      running = false;
      done = false;
   }
   
   public void start(){
      running = true;
      start();
   }
   
   //public void stop(){  running = false; }
   
   public void cont(){ running = true;  }
   
   public Boolean done(){ return done;  }

   public void run(){
      
	  int temp;
                  
      while (count < Math.pow(2,6)){  
         if (running){
            System.out.println("Fib is " + y);
            temp = x + y;
            x = y;
            y = temp;
            count++;
         }
      }
      done = true;
   }
   
}