/**
 * В данном коде используется объектно-ориентированная парадигма программирования.
 * Есть класс Stopwatch, который описывает сущность секундомера.
 * Данные (startTime, elapsedTime и т.д.) и методы работы с ними (start(), stop() и т.д.)
 * инкапсулированы внутри класса.
 * Есть создание объекта класса - Stopwatch stopwatch = new Stopwatch().
 * Вызов методов происходит у объекта - stopwatch.start(), stopwatch.pause() и т.д.
 * Класс Stopwatch капсулирует данные и логику работы конкретного секундомера.
 * Таким образом, программа использует основные принципы ООП - инкапсуляция, наследование, полиморфизм.
 * Это позволяет говорить, что применяется объектно-ориентированная парадигма программирования.
 */


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
