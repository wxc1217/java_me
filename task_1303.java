
import java.util.ArrayList;
import java.util.Scanner;


public class task_1303 {
    public static void sort(ArrayList<Double> list){
        for(int i = 0;i<list.size();i++){
            for(int j = i+1;j<list.size();j++){
                if(list.get(j) > list.get(i)){
                    double temp;
                    temp = list.get(j);
                    list.set(j,list.get(i));
                    list.set(i,temp);
                }
            }
        }
        System.out.println("is:");
        for(int ii = 0;ii<list.size();ii++){
            System.out.print(list.get(ii)+" ");
        }
    }

    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n;
        ArrayList al=new ArrayList();
        System.out.println("请输入需要的个数");
        n=scan.nextInt();
        System.out.println("请逐一输入");
        for(int i=0;i<n;i++) {
            al.add(i,scan.nextDouble());
        }
        sort(al);
    }
}
