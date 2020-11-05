import java.util.Date;

public class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;

    public Account(){
        dateCreated = new Date();//因为datecreated没有给默认初始值，所以在构造函数中要进行赋值
    }
    public Account(int id,double balance){
        dateCreated = new Date();
        this.id = id;
        this.balance = balance; //用this指针对id和balance赋值
    }
    //id的访问器
    public int getId(){
        return id;
    }
    //Id的修改器
    public void changeid(int id){
        this.id = id;
    }
    //balance的访问器
    public double getbalance(){
        return balance;
    }
    //balance的修改器
    public void changebalance(double balance){
        this.balance = balance;
    }
    //年利率的访问器
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    //年利率的修改器
    public void changeAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }
    //账户日期的访问器
    public Date getDateCreated(){
        return dateCreated;
    }
    //获得月利率
    public double getmonthrate(){
        double monthrate = annualInterestRate/12;
        return monthrate;
    }
    //取钱
    public void withdraw(double money){
        balance -= money;
    }
    //存钱
    public void deposite(double money){
        balance += money;
    }

    public static void main(String[] args){
        Account account = new Account(176453,7000000);//调用带参数的构造函数创建ACCOUNT类对象
        account.changeAnnualInterestRate(0.12);//按照年利率为12%计算月利率
        account.withdraw(30000);//取钱
        account.deposite(500000);//存钱
        System.out.println("Balance is : "+account.getbalance()+"\n"+
                "Monthly rate is : "+account.getmonthrate()+"\n"+
                "Date Created : "+account.getDateCreated());//结果输出
    }
}
