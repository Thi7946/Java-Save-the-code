/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SCILXXWSXX
 */
public class TestMyFamily {
    public static void main(String[] args){
        MyFamily fm1=new MyFamily("Thiwakorn",20,'M',100.00,"094-251-8731","555");
        /*fm1.setName("Thiwakron");
        fm1.setSex('M');
        fm1.setAge(20);
        fm1.setMoblie("094-251-8731");
        fm1.setLineid("arm123opo123");
        fm1.setSalary(100.00);*/
        System.out.println(fm1.getDetails());
    }
    
}
