import java.util.Scanner;
public class BubbleSort {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int size = in.nextInt();
        int [] bubble = new int [size];
        System.out.print("Enter" + size + "random numbers:");
        for (int i = 0; i < size; i++){
        bubble [i] = in.nextInt();
        }
        for (int i = 0; i < size - 1; i ++){
         for (int j = 0; j < size -1 - i; j++){
            if(bubble[j] > bubble[j+1]){
               int value = bubble[j];
               bubble[j] = bubble [j+1]; 
               bubble [j+1] = value;
            }
                    }
    }
    System.out.print("Sorted Value:");
    for (int arr: bubble){
        System.out.print (arr);
    }
}
}