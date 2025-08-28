package com.Adithiyaa.TaskSchedulerProject;

public class Main {

	public static void main(String[] args) {
		 TaskScheduler taskScheduler = new TaskScheduler();

	        // Task 1 - runs every 2 seconds
	        taskScheduler.scheduleTask(() -> System.out.println("Task 1: Printing message every 2 seconds"), 2);

	        // Task 2 - runs every 3 seconds
	        taskScheduler.scheduleTask(() -> System.out.println("Task 2: Current Time: " + java.time.LocalTime.now()), 3);

	        // Task 3 - runs every 5 seconds
	        taskScheduler.scheduleTask(() -> {
	            int sum = 0;
	            for (int i = 1; i <= 5; i++) sum += i;
	            System.out.println("Task 3: Sum of numbers 1 to 5 = " + sum);
	        }, 5);

	        // Keep program running for a while to observe tasks
	        try {
	            Thread.sleep(20000); // Run for 20 seconds
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        taskScheduler.stopScheduler();
	        System.out.println("Scheduler stopped.");
	}

}
