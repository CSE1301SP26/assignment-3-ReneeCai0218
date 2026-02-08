import java.util.Scanner;
public class Frequency {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of dice: ");
        int numDice = in.nextInt();
        int [] frequency = new int [6 * numDice + 1];
        for (int i = 0; i< 10000; i++){
            int sum = 0;
            for (int d = 0; d < numDice; d++){
                int roll = (int)(Math.random() * 6) + 1;
                sum += roll;
            }
            frequency [sum] ++;
        }
    for (int i = numDice; i <= 6 * numDice; i++){
        System.out.println(i + " : " + frequency [i]);
    }
    }
    
}
