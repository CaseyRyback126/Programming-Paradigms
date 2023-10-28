/**
 * В данном коде используется процедурная парадигма программирования.
 * Программа представляет собой последовательность операторов и процедур.
 * Основная логика реализована с помощью функций (calculate).
 * Данные и функции не инкапсулированы.
 * Отсутствуют классы и объекты.
 * Используются базовые типы данных (double, int) и массивы.
 * Вызов функций происходит императивно по мере выполнения кода.
 * Таким образом, вся программа сводится к последовательному выполнению функций,
 * обрабатывающих данные - что характерно для процедурного программирования.
 */


package MeanSquaredError;

public class MSE {

    public static double calculate(double[] predictions, double[] actual) {

        double sum = 0.0;
        for (int i = 0; i < predictions.length; i++) {
            double diff = predictions[i] - actual[i];
            sum += diff * diff;
        }

        return sum / predictions.length;
    }

    public static void main(String[] args) {
        double[] predictions = {1.1, 2.5, 3.3, 4.7};
        double[] actual = {1.0, 2.0, 3.0, 5.0};

        double mse = calculate(predictions, actual);
        System.out.println("MSE: " + String.format("%.3f", mse));
    }

}
