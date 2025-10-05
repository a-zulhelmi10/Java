import java.util.concurrent.*;
import java.util.*;

class Job implements Comparable<Job> {
    private final int jobId;
    private final int priority;
    private final int durationMs;

    public Job(int jobId, int priority, int durationMs) {
        this.jobId = jobId;
        this.priority = priority;
        this.durationMs = durationMs;
    }

    public int getJobId() { return jobId; }
    public int getPriority() { return priority; }
    public int getDurationMs() { return durationMs; }

    @Override
    public String toString() {
        return "Job[ID=" + jobId + ", priority=" + priority + ", duration=" + durationMs + "ms]";
    }

    @Override
    public int compareTo(Job other) {
        return Integer.compare(other.priority, this.priority); // Higher priority first
    }
}

class JobProcessor implements Runnable {
    private final BlockingQueue<Job> jobQueue;
    private final int processorId;

    public JobProcessor(BlockingQueue<Job> jobQueue, int processorId) {
        this.jobQueue = jobQueue;
        this.processorId = processorId;
    }

    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                Job job = jobQueue.take(); // Blocks if queue is empty
                System.out.println("Processor " + processorId + " picked up " + job);
                Thread.sleep(job.getDurationMs()); // Simulate processing
                System.out.println("Processor " + processorId + " completed " + job);
            }
        } catch (InterruptedException e) {
            System.out.println("Processor " + processorId + " shutting down.");
        }
    }
}

public class Exercise1MultiThread {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Job> jobQueue = new PriorityBlockingQueue<>();

        int numProcessors = 3;
        List<Thread> processors = new ArrayList<>();

        for (int i = 1; i <= numProcessors; i++) {
            Thread processorThread = new Thread(new JobProcessor(jobQueue, i));
            processorThread.start();
            processors.add(processorThread);
        }

        // Simulate job arrivals
        for (int i = 1; i <= 10; i++) {
            Job job = new Job(i, (int)(Math.random() * 10), 500 + (int)(Math.random() * 1000));
            jobQueue.put(job); // Add to the queue
            System.out.println("Added " + job);
            Thread.sleep(300); // New job every 300ms
        }

        // Let jobs finish processing
        Thread.sleep(7000);

        // Graceful shutdown
        for (Thread t : processors) {
            t.interrupt();
        }
    }
}

/* 💼 Objective
Design a Java CLI application that simulates a simplified job queue system for a data center. The system should handle multiple job requests, process them using threads, and showcase thread management techniques like synchronization, wait/notify, and thread pooling.

🛠️ Core Requirements
Create a Job class that has attributes like job ID, priority, and execution time.

Use a shared job queue (e.g., BlockingQueue<Job> or a custom synchronized list).

Simulate job processors as threads:

At least 3 worker threads that continuously fetch jobs from the queue and "process" them (use Thread.sleep() to simulate processing time).

Use synchronization to avoid race conditions on shared resources.

Implement graceful shutdown of threads with interrupt() or flags.

Log thread activity clearly in the CLI:

When a job is picked up, started, and completed.

⚙️ Bonus Features (Pick 1–2)
Add a thread pool using ExecutorService for job dispatching.

Add job prioritization logic using PriorityQueue.

Simulate dynamic job arrivals using a timer thread that adds jobs at intervals.

Use wait() and notify() to pause and resume job processing.

🧪 Testing Tasks
Feed in 10 jobs with varying priorities and delays.

Verify that the threads process jobs correctly, without duplication or deadlocks.

Measure total processing time and thread utilization.

📋 Deliverables
Source code with comments explaining key thread interactions.

A diagram or written explanation showing the thread flow and queue behavior.

A README with instructions and observations. */
