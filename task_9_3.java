import java.util.Date;

public class task_9_3 {
    public static void main(String[] args){
        long l = 10000;//record the latest time
        Date date = new Date(l);
        printDate(l,date);
        l*= 10;
        //利用for循环更新流逝时间，显示日期
        for(int i = 0;i<7;i++){
            date.setTime(l);
            printDate(l,date);
            l*=10;
        }
    }
    //利用tostring函数显示日期
    public static void printDate(long l, Date date){
        System.out.println(l+": "+date.toString());
    }
}
