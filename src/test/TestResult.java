package test;

import domain.Exercise;

public class TestResult {

    public static void main(String[] args) {
        int a = 15; // початок діапазну
        int b = 23; // і кінець
        Exercise exercise = new Exercise(); // створюємо об'єкт класа Exercise
        int[] array = exercise.Calculate(a, b); // передаємо наш діапазон в метод Calculate і присвоюємо повертаєме значення цього методу в масив array
        for(int i = 0; a <= b; i++){ // цей цикл просто виводить всі значення масиву 
            if(array[i] == 0){ // доки елемент масиву під відповідним індексом не дорівнює 0
                break;
            }
            System.out.println(array[i]);
        }

    }
}
