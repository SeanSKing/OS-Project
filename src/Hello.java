class Hello extends Thread
{

   String  s = "Hello!";
   int count = 0;
   Boolean running;
   Boolean done;

   Hello(){
     
	  running = false;
      done = false;
   }
   
   public void star(){
	   
      running = true;
      start();
   }
   
   //public void stop(){ running = false;  }
   
   public void cont(){ running = true;  }
   
   public Boolean done(){  return done; }
   
   public void run(){
	   
      while (count < Math.pow(2,6)){
         if (running){
            System.out.println(s);
            count++;
         }
      }
      done = true;
   }
   
}