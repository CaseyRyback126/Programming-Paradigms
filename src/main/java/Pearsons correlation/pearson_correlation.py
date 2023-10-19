import numpy as np

#  Генерация двух случайных массивов

array1 = np.random.rand(50)
array2 = np.random.rand(50)


# Расчет корреляции Пирсона

def pearson_correlation(x, y):
    mean_x = np.mean(x)
    mean_y = np.mean(y)
    x_minus_mean = x - mean_x
    y_minus_mean = y - mean_y
    numerator = np.sum(x_minus_mean * y_minus_mean)
    denominator_x = np.sqrt(np.sum(x_minus_mean ** 2))
    denominator_y = np.sqrt(np.sum(y_minus_mean ** 2))
    correlate = numerator / denominator_x * denominator_y
    return correlate


correlation = pearson_correlation(array1, array2)
print(f"Корреляция Пирсона: {correlation: .2f}")
