package Stopwatch;

public class Main {
    public static void main(String[] args) {
        Stopwatch stopwatch = new Stopwatch();

        stopwatch.start();
        // Делаем какую-то работу...
        try {
            Thread.sleep(2000); // Подождем 2 секунды
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        stopwatch.pause();
        // Делаем еще что-то...
        try {
            Thread.sleep(3000); // Подождем еще 3 секунды
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        stopwatch.resume();
        // Продолжаем работу...
        try {
            Thread.sleep(1000); // Подождем еще 1 секунду
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        stopwatch.stop();
    }
}
