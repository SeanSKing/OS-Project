package com.company;

/**
 * Created by samru on 11/30/2016.
 */
class Fibonacci extends Thread
{

    int count = 0;
    double x = 0, y = 1, temp;
    Boolean running;
    Boolean done;

    Fibonacci(){
        running = false;
        done = false;
    }

    public void star(){
        running = true;
        start();
    }

    public void sto(){  running = false; }

    public void cont(){ running = true;  }

    public Boolean done(){
        return done;  }

    public void run() {
        int a =1;
        while (count < Math.pow(2,9)) {
            if (running) {
                System.out.println("Fib is " + y);
                temp = x + y % Math.pow(2, 16);
                x = y;
                y = temp;

                count++;
            }else if(a%100000 == 0){
                System.out.println("count running is false");
                a=1;
            }
            a++;
        }
        done = true;
        running = false;
        System.out.println("Fib done");
    }

}