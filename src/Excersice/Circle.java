package Excersice;

import java.util.Scanner;

public class Circle {
   private double radius;
   private String color;

   public Circle() {
       this.radius = 0.0;
       this.color = "";
   }
   public Circle(double radius,String color) {
       this.radius = radius;
       this.color = color;
   }
   public double getRadius() {
       return radius;
   }
   public void setRadius(double radius) {
       this.radius = radius;
   }
   public String getColor() {
       return color;
   }
   public void setColor(String color) {
       this.color = color;
   }
   public double chuvi() {
       return 2*Math.PI*radius;
   }
   public double dientich() {
       return Math.PI*radius*radius;
   }

   public void inputData() {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Nhập bán kính: ");
       this.radius = scanner.nextDouble();
       scanner.nextLine();
       System.out.println("Nhập màu sắc: ");
       this.color = scanner.nextLine();
   }
   public void displayData() {
       System.out.println("Bán kính: "+ radius);
       System.out.println("Màu sắc: " + color);
       System.out.println("Chu vi: " + chuvi());
       System.out.println("Diện tích: "+ dientich());
   }


}
