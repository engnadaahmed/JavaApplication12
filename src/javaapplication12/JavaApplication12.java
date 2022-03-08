/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

/**
 *
 * @author Three Girls
 */
public class JavaApplication12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         rectangl obj=new rectangl(5,5);
        rectangl obj2=new rectangl(5,5);
        System.out.println(obj.perimeter());
        System.out.println(obj.area());
        obj.equal(obj2);
    }
    
}
