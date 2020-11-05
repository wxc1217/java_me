import java.util.Scanner;
public class task8_2 {
    public static double sumMajorDiagonal(double[][] m){
        double sum = 0;
        for(int i = 0;i<m.length;i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (i == j) {
                    sum += m[i][j];
                }
            }
        }
        return sum;
    }
    public static void main(String[] args){
        double[][] matrix = new double[4][4];
        System.out.println("enter a 4*4 matrix");
        Scanner input = new Scanner(System.in);
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[i].length;j++){
                matrix[i][j] = input.nextDouble();
            }
        }
        System.out.println("sum of the elements in the major diagonal is " +sumMajorDiagonal(matrix));
    }
}
