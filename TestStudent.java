import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args){
        Student st1 = new Student();
        Scanner sc= new Scanner ( System.in);
        System.out.print ("Enter your name :");
        st1.name =sc.nextLine();
        System.out.print ("Enter your age :");
        st1.age =sc.nextInt();
        System.out.print ("Enter your sex :");
        st1.sex =sc.next();
        System.out.print ("Enter your subject :");
        st1.subject =sc.next();
        System.out.print ("Enter your code :");
        st1.code =sc.next();
        st1.displayinfo();
    } 
}
