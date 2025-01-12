public class ConvertData {
    public static char sex;
    
    public static char ConvertSex(int i){
        if (i==0){   sex = 'M';
            return sex;}
        if (i == 1) { sex = 'F';
            return sex; 
        }else return '0';        
    }
    public static void main(String[]args) {
        char sex = ConvertData.ConvertSex(0);//sex เป็นตัวแปร local variable
        System.out.println("Your sex is : "+sex);
        System.out.println("Your sex is :"+ConvertData.ConvertSex(1));
        //System.out.println(Your sex is : "+ConvertData.ConvertSex(1));
    }
}