public class Thinker {
    public int age=0;
    public String name="Student";
    public int salary=0D;

    public DisplayInfo(double s){
        salary=s+s;
        System.out.println("My Salary  ="+salary);
        System.out.println("My Name is  "+name);
        return();
    }

    public static void main(String[]) {
        Thinker myThink=new Thinker();
        myThink.DisplayInfo(10000);
    }
    }
