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
public class rectangl implements shape {
double hight;
double width;
rectangl(double hight,double width ){
this.width=width;
this.hight=hight;  
}    

    public double getHight() {
        return hight;
    }

    public double getWidth() {
        return width;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "rectangle{" + "hight=" + hight + ", width=" + width + '}';
    }


@Override
    public double area() {
    return (hight*width);   
    }

    @Override
    public double perimeter() {
    return (2*hight*width);      
    }
    
 void equal(rectangl obj){
  if(this.area()==obj.area()){
   System.out.println("equal");
  }else{   
  System.out.println("not equal");   
 }   
}}
    

