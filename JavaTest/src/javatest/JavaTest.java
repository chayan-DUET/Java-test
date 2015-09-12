/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest;

import PakageChild.ChildClass;

/**
 *
 * @author Chayan_pc
 */
public class JavaTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pr_8086 ob1=new Pr_8086(10,10);
        Pr_8086 ob2=new Pr_8086(20,4,60);
        
             Pr_8086 obpr=new Pr_8086(10,10);
             obpr.p=1;
             obpr.x=1;
             obpr.y=1;
             obpr.add();
             obpr.print();
             
             
             //--------------inheri  and overwritten and protected-----------
             
             pro2 pro2=new pro2();
             pro2.p=2;
             pro2.q=2;
             pro2.add();
             pro2.print();
             pro1 p1=new pro1(9, 9);
             p1.p=9;
             p1.add();
             p1.print();
        //ob1.x=10;
       // ob1.y=10;
        ob1.add();
        ob1.result();
        //ob2.x=55;
        //ob2.y=7;
        ob2.result();
        ob2.sub();
        ob2.result();
        
        
   //------------------visibilllllity-------------
        parantClass pc=new parantClass();
        pc.a=22;
        pc.b=5;
       
        pc.add();
       
        pc.print();
         
       // ChildClass cc=new ChildClass();
       // ChildClass cc=new ChildClass();
        
        
        
    }
}
