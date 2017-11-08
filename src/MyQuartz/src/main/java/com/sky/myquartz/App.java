package com.sky.myquartz;

import org.quartz.SchedulerException;

import com.sky.myquartz.job.ForJob;
import com.sky.myquartz.schedule.DealScheduler;
import com.sky.myquartz.schedule.ForScheduler;
import com.sky.myquartz.schedule.HelloScheduler;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SchedulerException
    {
      HelloScheduler.run();
      ForScheduler.run();
      DealScheduler.run();
    }
}
