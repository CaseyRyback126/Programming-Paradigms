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
