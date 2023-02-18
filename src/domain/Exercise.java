package domain;

public class Exercise {
    private int[] arr = new int[20]; // Створюємо масив на 20 елементів
    private int index = 0; // створюємо змінну-індекс
    public int[] Calculate(int A, int B){ // функція заповнює масив числавми з вказанго діапазону, від А до В
        for(int i = A; i <= B; i++){ 
            arr[index] = i;
            index++;
        }
        return arr; // Вертаємо заповнений масив
    }
}
