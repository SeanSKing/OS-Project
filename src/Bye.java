
class Bye extends Thread
{
	
   protected String  s = "Bye!";
   int count = 0;
   protected Boolean running;
   protected Boolean done;
   
   Bye(){
     
	  running = false;
      done = false;
   }
   
   public void start(){
	  running = true;
      start();
   }
   
   //public void stop(){ running = false;}
   
   public void cont(){ running = true; }
   
   public Boolean done(){ return this.done; }
   
   public void run(){
     
	   while (count < Math.pow(2,6)){
         
		   if (running){     
			   
	            System.out.println(s);
	            count++;
         }
         done = true;
      }
	   
   }
   
}