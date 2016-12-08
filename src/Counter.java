package com.company;

/**
 * Created by samru on 11/30/2016.
 */
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
       // System.out.println("I set running to true for count");
        running = true;
    }

    public Boolean done(){
        return this.done;}

    public void run() {
        int x=1;
        System.out.println("Count run started");
        while (count < Math.pow(2,10)) {

            if (running) {
                System.out.println("Count is " + count);
                count++;
            }
            else if(x%100000 == 0){
                System.out.println("count running is false");
                x=1;
            }
            x++;

        }
        done = true;
        System.out.println("Count done");
    }//end run

}//end class
