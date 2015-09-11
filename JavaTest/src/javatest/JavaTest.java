/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest;

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
        //ob1.x=10;
       // ob1.y=10;
        ob1.add();
        ob1.result();
        //ob2.x=55;
        //ob2.y=7;
        ob2.result();
        ob2.sub();
        ob2.result();
    }
}
