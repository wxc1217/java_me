public class course implements Cloneable{
    private String coursename;
    private String[] students = new String[100];
    private int numberofstudents;

    public course(String coursename){
        this.coursename = coursename;
    }
    public void addstudent(String student){
        students[numberofstudents] = student;
        numberofstudents++;
    }
    public int getsnumoftudents(){
        return numberofstudents;
    }
    public String[] getStudents(){
        return students;
    }
    public String getCoursename(){
        return coursename;
    }
    public course clone(){
        course course = null;
        try {
            course = (course) super.clone();
        }catch (CloneNotSupportedException ignored){
            System.out.println(ignored.getMessage());
        }
        return course;
    }
    public static void main(String[] args){
        course course1 = new course("Java");
        course1.addstudent("baby");//向course1中增加一个学生
        course course2 = course1.clone();
        System.out.println("course2 before insertion :"+course2.getsnumoftudents());
        course1.addstudent("daa");//course1中再增加一个学生
        System.out.println("stunum of course2 after insertion:"+course2.getsnumoftudents());//深复制下的course2的学生数量为1
        System.out.println("stunum of course1 after insertion:"+course1.getsnumoftudents());//course1学生数量变为2
    }
}
