class Counter extends Thread
{
   int count = 0;
   Boolean running;
   Boolean done;
	   
   Counter(){
   	   
      running = false;
      done = false;
   }
   
   public void star(){
      
      running = true;
      start();
   }
   
   public void sto(){ running = false;  }
   	  
   public void cont(){
   	   
      running = true;
   }
   
   public Boolean done(){ 
      return this.done;}
	   
   public void run()
   {
      while (count < Math.pow(2,10))
      {
         if (running)
         {
            System.out.println("Count is " + count);
            count++;               
         }
      }
      done = true;
      System.out.println("Count done");
   }//end run
   
}//end class