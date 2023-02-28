package domain;

public class Exercise {

    public static void main(String[] args) {
        int start = 1; // початкове число діапазону
        int end = 100; // кінцеве число діапазону

        int[] primeNumbers = new int[50]; // ініціалізуємо масив на 50 елементів, оскільки найбільше простих чисел у діапазоні від 1 до 100 - 50 штук
        int count = 0; // лічильник для кількості знайдених простих чисел

        for (int i = start; i <= end; i++) {
            boolean isPrime = true;

            // перевіряємо, чи є поточне число простим
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                primeNumbers[count] = i;
                count++;
            }
        }

        // виводимо масив простих чисел у вигляді рядка
        for (int i = 0; i < count; i++) {
            System.out.print(primeNumbers[i] + " ");
        }
    }

}
