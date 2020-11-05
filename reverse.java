import java.util.Scanner;
public class reverse {
    public static void reverse(int num){
        int n = 0;
        while(num/(int)Math.pow(10,n) != 0){
            n = n+1;
        }
        int[] mylist = new int[n];
        for(int i = 0;i<n;i++){
            mylist[i] = num%(int)Math.pow(10,1);
            num = (num-mylist[i])/10;
        }
        for(int i = 0;i< mylist.length;i++){
            System.out.print(mylist[i]);
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("please enter an integer");
        int x = input.nextInt();
        reverse(x);
    }
}
