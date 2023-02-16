package test;

import domain.Exercise;

public class TestResult {

    public static void main(String[] args) {
        int a = 15;
        int b = 23;
        Exercise exercise = new Exercise();
        int[] array = exercise.Calculate(a, b);
        for(int i = 0; a <= b; i++){
            if(array[i] == 0){
                break;
            }
            System.out.println(array[i]);
        }
        
    }
}
