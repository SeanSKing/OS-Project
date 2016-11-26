class Counter extends Thread
{
	   int count = 0;
	   Boolean running;
	   Boolean done;
	   
	   Counter(){
		   
		  running = false;
	      done = false;
	   }
   
	   public void start(){
	   
		  running = true;
	      start();
	   }
   	  
	   public void cont(){
		   
	      running = true;
	   }
   
	   public Boolean done(){ return this.done;}
	   
	   public void run(){
	      while (count < Math.pow(2,6)){
	         
	    	 if (running){
	            System.out.println("Count is " + count);
	            count++;               
	         }
	      }
	      done = true;
	   }//end run
   
}//end class