package ExUnit7;

public class TestObj {
    public int age=0;
    public String name="xxx";
    public double grade=0.00;
    
    public TestObj(int a, String n) {
        this.age= a;
        this.name= n;
    }
    
    public TestObj(int a, String n, double g) {
        this.age= a; this.name= n; this.grade= g;
    }
    
    public void displayInfo() {
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
        System.out.println("Grade :"+grade);
        System.out.println("------------------------");
    }
    public static void main(String[] args) {
        TestObj myObj1= new TestObj(20,"Methaporn",3.50);
        TestObj myObj2= new TestObj(30,"Puchana",3.60);
        TestObj myObj3= new TestObj(40,"Patcharaphon",3.70);
        TestObj myObj4= new TestObj(15,"Natnicha",3.80);
        TestObj myObj5= new TestObj(12,"Kanokphon",3.90);
        
        myObj1.displayInfo();
        myObj2.displayInfo();
        myObj3.displayInfo();
        myObj4.displayInfo();
        myObj5.displayInfo();
    }
}
