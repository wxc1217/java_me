import java.util.Scanner;

public class task614 {
    public static void main(String[] args){
        System.out.println("enter an integer: ");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int matrix[][] = new int[x][x];
        for(int i = 0;i<matrix.length;i++){
            for(int j =0;j<matrix[i].length;j++){
                if(Math.random()>=0.5){
                    matrix[i][j] = 1;
                }
            }
        }
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
