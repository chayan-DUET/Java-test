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
public class parantClass extends ChildClass {
     int a;
      int b;
      int r;
      parantClass(int aa,int bb)
      {
      this.a=aa;
      this.b=bb;
      this.r=this.a+this.b;
      }
   void add()
   {
   r=a+b;
   }
   void print()
   {
       System.out.println(r);
   }
    
}
