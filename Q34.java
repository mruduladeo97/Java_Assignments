import java.util.Scanner;
class CircleDemo{
   private int radius;
   private double area;
   final double PI = 3.14;

   void init(int radius){
     this.radius = radius;
   }

   void calculateArea(){
       this.area = PI * (radius * radius)  ;
   }

   void display(){
       System.out.println("Area of circle is" + area);
   }

}
class Q34
{
  public static void main(String args[])
  {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter radius");
   int radii = sc.nextInt();
   CircleDemo r = new CircleDemo();
     r.init(radii); 
     r.calculateArea();
     r.display();
 
   }
}