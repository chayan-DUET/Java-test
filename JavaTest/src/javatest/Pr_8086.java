/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest;

/**
 *
 * @author Chayan_pc
 */
public class Pr_8086 extends pro2 {
    
    //---------------p2ext-----------
    
    
    
    
    
    
    int x;
    int y;
   private  int r;
    void add()
    {
     r=x+y+p;
    }
    
    void print()
    {
        System.out.println(r);
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
    
      Pr_8086(int x,int y,int z) {
        // x=xx;
       //  y=yy;
       this.x=x;
       this.y=y;
       r=this.x+this.y+z;
       
     }
    
}
