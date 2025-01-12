package Unit5;
import java.util.Scanner;
public class IfBall {
    public String ball;
    public int Rprice, Yprice;
    
    public void PurcherBall(String ball){
        if (ball=="red")    {System.out.println("i will purchure it.");}
        else if(ball=="green")  {System.out.println("i will not purchure it.");}
            else if(ball=="yellow"&& Yprice <= Rprice) {System.out.println("i will purchure it.");}
}
    
    public static void main(String[] args){
        IfBall myBall=new IfBall();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter ball  color(green/red/yellow): ");
        myBall.ball=sc.next();
        
        System.out.print("Enter price of red ball : ");
        myBall.Rprice=sc.nextInt();
        
        System.out.print("Enter price of yellow ball : ");
        myBall.Yprice=sc.nextInt();
        
        myBall.PurcherBall("yellow");
    }
}
