public class task77 {
    public static void main(String[] args){
        int[] mylist = new int[100];
        int[] count = new int[10];
        for(int i = 0;i<mylist.length;i++){
            mylist[i] = (int)(Math.random()*100.0)/10;
        }
        for(int j = 0;j<=9;j++) {
            for (int k = 0; k < mylist.length; k++) {
                if(mylist[k] == j){
                    count[j] = count[j]+1;
                }
            }
        }
        for(int j = 0;j<=9;j++){
            System.out.println("the counting number of "+j+" is "+count[j]);
        }
    }
}
