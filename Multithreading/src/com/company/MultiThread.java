/*
Multithreading is a Java feature that allows concurrent execution of two or more parts of a program for maximum utilization of CPU. Each part of such program is called a thread. So, threads are light-weight processes within a process.

Threads can be created by using two mechanisms :

Extending the Thread class
Implementing the Runnable Interface
Thread creation by extending the Thread class
We create a class that extends the java.lang.Thread class. This class overrides the run() method available in the Thread class. A thread begins its life inside run() method. We create an object of our new class and call start() method to start the execution of a thread. Start() invokes the run() method on the Thread object.


Thread Class vs Runnable Interface

If we extend the Thread class, our class cannot extend any other class because Java doesn’t support multiple inheritance. But, if we implement the Runnable interface, our class can still extend other base classes.
We can achieve basic functionality of a thread by extending Thread class because it provides some inbuilt methods like yield(), interrupt() etc. that are not available in Runnable interface.
Using runnable will give you an object that can be shared amongst multiple threads.


Lifecycle and States of a Thread in Java
A thread in Java at any point of time exists in any one of the following states. A thread lies only in one of the shown states at any instant:

New
Runnable
Blocked
Waiting
Timed Waiting
Terminated

package com.company;

import java.sql.SQLOutput;

class Demo extends Thread{
    public void run(){
        try {
            System.out.println("Thread" + Thread.currentThread().getId() + "is running");
        }
        catch (Exception e){
            System.out.println("Exception is caught");
        }
    }
}

public class MultiThread  {
    public static void main(String[] args) {

        int n=8;
        for(int i=0 ;i<n;i++){
            Demo obj=new Demo();
            obj.run();
        }
    }

}
*/


package com.company;

import java.sql.SQLOutput;

class Demo implements Runnable{
    public void run(){
        try {
            System.out.println("Thread" + Thread.currentThread().getId() + "is running");
        }
        catch (Exception e){
            System.out.println("Exception is caught");
        }
    }
}

public class MultiThread  {
    public static void main(String[] args) {

        int n=8;
        for(int i=0 ;i<n;i++){
            Thread obj=new Thread(new Demo());
            obj.start();
        }
    }

}
