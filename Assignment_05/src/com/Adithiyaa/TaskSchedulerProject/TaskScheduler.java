package com.Adithiyaa.TaskSchedulerProject;

import java.util.concurrent.*;

public class TaskScheduler {
    private final ScheduledExecutorService scheduler;

    public TaskScheduler() {
        scheduler = Executors.newScheduledThreadPool(5);
    }

    public void scheduleTask(Task task, int interval) {
        scheduler.scheduleAtFixedRate(() -> task.execute(), 0, interval, TimeUnit.SECONDS);
    }

    public void stopScheduler() {
        scheduler.shutdown();
    }
}
