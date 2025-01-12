
public class MyFamily {
    private String name;
    private int age;
    private char sex;
    private double salary;
    private String moblie;
    public String lineid;
    
    public String getDetails(){
        return"Name :"+name+"Age : "+age+
              "\nSex : "+sex+"    salary :"+salary+
              "\nMoblie : "+moblie+"Line id :"+lineid;            
    }
    public MyFamily(String n,int a,char s,double sa,String m,String l){
        this.name=n;
        this.age=a;
        this.sex=s;
        this.salary=sa;
        this.moblie=m;
        this.lineid=l;
    }
    
    public void setName(String n){
        this.name=n;
    }
    public String getName(){
        return name;
    } 
        public void Age(int a){
        this.age=a;
    }
    public int getAge(){
        return age;
    } 
    public void setSex(char s){
        switch (s){
            case'F':case'M':
                this.sex=s;
                break;
            default:
                System.out.println("Invalid sex!!!");
        }
    }   
    public char getSex(){
        return sex;
    }
        public void setSalary(double sr){
        this.salary=sr;
    }
    public double getSalary(){
        return salary;
    } 
        public void setMoblie(String m){
        this.moblie=m;
    }
    public String getMoblie(){
        return moblie;
    } 
        public void setlineid(String l){
        this.lineid=l;
    }
    public String getlineid(){
        return lineid;
    } 
}
