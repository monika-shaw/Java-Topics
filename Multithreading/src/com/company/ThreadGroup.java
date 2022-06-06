package com.company;

// Java code illustrating activeCount() method
import java.lang.*;
class NewThread extends Thread
{
    NewThread(String threadname, ThreadGroup tgob)
    {
        super(tgob, threadname);
        start();
    }
    public void run()
    {

        for (int i = 0; i < 1000; i++)
        {
            try
            {
                Thread.sleep(10);
            }
            catch (InterruptedException ex)
            {
                System.out.println("Exception encounterted");
            }
        }
    }
}
 class ThreadGroupDemo
{
    public static void main(String arg[])
    {
        // creating the thread group
        ThreadGroup gfg = new ThreadGroup("parent thread group");

        NewThread t1 = new NewThread("one", gfg);
        System.out.println("Starting one");
        NewThread t2 = new NewThread("two", gfg);
        System.out.println("Starting two");

        // checking the number of active thread
        System.out.println("number of active thread: "
                + gfg.activeCount());
    }
}

