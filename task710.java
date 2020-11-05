import java.util.Scanner;

public class task710 {
    public static int indexOfSmallestElement(int[] array){
        int min = array[0];
        for(int i = 0;i<array.length;i++) {
            if (array[i] <= min) {
                min = array[i];
            }
        }
        for(int j = 0;j<array.length;j++){
            if(array[j]==min){
                System.out.print(j+" ");
            }
        }
        return 0;
    }
    public static void main(String[] args){
        System.out.println("enter 10 integers: ");
        Scanner input = new Scanner(System.in);
        int[] list = new int[10];
        for(int i = 0;i<list.length;i++){
            list[i] = input.nextInt();
        }
        indexOfSmallestElement(list);
    }
}
