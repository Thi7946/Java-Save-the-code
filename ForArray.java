package array;


public class ForArray {
    public static void main(String[]args){
        int [] intArray;
        intArray = new int [10];
        double [] doubleArray = new double [10];
        char [] charArray =(t,i,w,a,k,r,o,n,y,);
        boolean [] boolArray= new boolean [10];
        String [] strArray=new String[10];
        
        System.out.printf("%3s %10s %10s %8s% 10s% 10s\n","index","interger","Douyble","Char","Boolean","String");
        strArray[0]= "Thowalprm";strArray[1]="yosruengsa";
        
        for(int i=0;i<intArray.length;i++){
            intArray[i]=(i+1)*10;
            System.out.printf("%3d \t%3d \t%10f %5c %10b %8s\n",i,intArray[i],doubleArray[i],charArray[i],boolArray[i],strArray[i]);
            
        }
        System.out.println("Total of array integer ="+total);
         System.out.println("VALUE OF CHAR INDEX 2 =" +CHARaRRAY[2]);
    }
    
}
