package Stopwatch;

public class Stopwatch {
    private long startTime;
    private long elapsedTime;
    private boolean isRunning;

    public Stopwatch() {
        startTime = 0;
        elapsedTime = 0;
        isRunning = false;
    }

    public void start() {
        if (!isRunning) {
            startTime = System.currentTimeMillis();
            isRunning = true;
            System.out.println("Stopwatch started.");
        } else {
            System.out.println("Stopwatch is already running.");
        }
    }

    public void pause() {
        if (isRunning) {
            elapsedTime += System.currentTimeMillis() - startTime;
            isRunning = false;
            System.out.println("Stopwatch paused.");
        } else {
            System.out.println("Stopwatch is already paused.");
        }
    }

    public void resume() {
        if (!isRunning) {
            startTime = System.currentTimeMillis();
            isRunning = true;
            System.out.println("Stopwatch resumed.");
        } else {
            System.out.println("Stopwatch is already running.");
        }
    }

    public void stop() {
        if (isRunning) {
            elapsedTime += System.currentTimeMillis() - startTime;
            isRunning = false;
        }
        System.out.println("Stopwatch stopped. Elapsed time: " + getElapsedTime() + " milliseconds.");
    }

    public long getElapsedTime() {
        if (isRunning) {
            return elapsedTime + (System.currentTimeMillis() - startTime);
        } else {
            return elapsedTime;
        }
    }
}
