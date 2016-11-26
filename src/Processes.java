public class Processes
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args){
    
	  int q = 4;
      int i = 0;
      int loop = 1;
      
      Counter counter = new Counter();
      Hello hello = new Hello();
      Bye bye = new Bye();
      Fibonacci fib = new Fibonacci();
      
      while (true){
    	  
         if (counter.done == false 
        		 || hello.done == false 
        		 || bye.done == false 
        		 || fib.done == false){
        	 
            switch (i){   //do we absolutely need a switch statement?? 
           
               case 0: 
                  if (counter.done == false){
                	  
                     if (loop == 1){ 
                    	 counter.start();
                     }
                     else{
                    	 counter.cont();
                     }

                     try{
                    	 Thread.sleep(q);
                     }
                     
                     catch (InterruptedException e){
                        System.out.println("Prob with sleep");
                     }
                     counter.stop();
                  }
                  
                  i = (i + 1) % 4;
                  break;
                    
               case 1: 
                  if (hello.done == false){
                	  
                     if (loop == 1){
                        hello.star();
                     }else{ 
                        hello.cont();
                     }
                     
                     try{
                        Thread.sleep(q);
                     }catch (InterruptedException e){
                    	 
                        System.out.println("Prob with sleep");
                     }
                     
                     hello.stop();
                  }
                  
                  i = (i + 1) % 4;
                  break;
                       
               case 2: 
                  if (bye.done == false) {
                     if (loop == 1){
                        bye.start();
                     }
                     else{
                    	 bye.cont();
                     }
                     try{
                    	 Thread.sleep(q);
                     }catch (InterruptedException e){
                        System.out.println("Prob with sleep");
                     }
                     bye.stop();
                  }
                  i = (i + 1) % 4;
                  break;
                    
               case 3: 
                  if (fib.done == false){
                     if (loop == 1){
                        fib.start();
                     }
                     else{
                        fib.cont();
                     }
                     try{ 
                    	 Thread.sleep(q);   
                     }catch (InterruptedException e){
                        System.out.println("Prob with sleep");
                     }
                     fib.stop();
                  }
                  
                  i = (i + 1) % 4;
                  loop++;
                  break;
               default: System.out.println("Problem??");
            }
         }
         else
            break;
      }
   }
}