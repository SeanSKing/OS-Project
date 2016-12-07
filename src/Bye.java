
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

   public void star(){
      running = true;
      start();
   }

   public void sto(){ running = false;}

   public void cont(){ running = true; }

   public Boolean done(){ return this.done; }

   public void run(){
      while (count < Math.pow(2,8)){
         if (running){
            System.out.println(s);
            count++;
         }
      }
      done = true;
      System.out.println("Bye done");
   }

}