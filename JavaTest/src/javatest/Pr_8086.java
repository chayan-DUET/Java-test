/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest;

/**
 *
 * @author Chayan_pc
 */
public class Pr_8086 {
    int x;
    int y;
    int r;
    void add()
    {
     r=x+y;
    }
    void sub()
    {
    r=x-y;
    }
    void result()
    {
        System.out.println("Result="+r);
    }
    
    
    //=============constructructor===========

     Pr_8086(int x,int y) {
        // x=xx;
       //  y=yy;
       this.x=x;
       this.y=y;
     }
    
    
}
