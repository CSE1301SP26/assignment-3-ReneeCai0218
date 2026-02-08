import java.util.Scanner;
public class SymmetricalImage {
    public static void main (String[] args){
        Scanner in = new Scanner (System.in);
        System.out.print("Enter the number of row: ");
        int n = in.nextInt();
        System.out.print("Enter the number of colum: ");
        int m = in.nextInt();
        String [][] symmertric = new String [n][m];
        for (int i = 0; i < n; i++){
            for (int j = 0; j< m; j++){
                symmertric[i][j] = " ";
            }
        }
        int points = n * m /4;
        for(int point = 1; point <= points; point++){
        int k = (int)(Math.random() * n);
        int y = (int)(Math.random() * m);
        symmertric[k][y] = "*";
        symmertric[k][m-y-1] = "*";
        }
        for(int i = 0;i < n; i++){
            for (int j = 0; j< m; j++){ 
        System.out.print(symmertric[i][j]);
    }
    System.out.println();
}
}
}