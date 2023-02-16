package domain;

public class Exercise {
    private int[] arr = new int[20];;
    private int index = 0;
    public int[] Calculate(int A, int B){
        for(int i = A; i <= B; i++){
            arr[index] = i;
            index++;
        }
        return arr;
    }
}
