/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package scd_labs_by_zohaib_20se_005;

/**
 *
 * @author se20-005
 */

class Rectangle{
    private double length, width;

    Rectangle(){
        this.setLength(1.0);
        this.setWidth(1.0);
    }
    
    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
    public boolean verify(){
        return (this.length > 0.0 && this.length < 20.0) && (this.width > 0.0 && this.width < 20.0);
    }
    
}
public class CoolRectangle {
    public static void main(String[] args){
        Rectangle my_rect = new Rectangle(10,15);
        
        System.out.println(my_rect.verify());
        
        
    }
}
